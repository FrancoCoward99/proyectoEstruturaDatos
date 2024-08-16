/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Banco {

    /*Este módulo permite ingresar el nombre del banco, así como la cantidad de cajas para 
     la atención de clientes,  como minimo 3*/
    private String nombreBanco;
    private int cajaClientes;
    /*Además, debe permitir contar con una única caja preferencial
    una única para tramites rápidos no preferenciales*/
    private int cajaPreferencial = 1;
    private int cajaRapida = 1;
    private boolean[] cajasDisponibles; //Para manejar la disponibilidad de las cajas
    

    public Banco(String nombreBanco, int cajaClientes) {
        this.nombreBanco = nombreBanco;
        this.cajaClientes = cajaClientes;
        this.cajasDisponibles = new boolean[cajaClientes];  // Inicializa las cajas como disponibles
        for (int i = 0; i < cajaClientes; i++){
            cajasDisponibles[i] = true; // Todas las cajas están disponibles al inicio
        }
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getCajaClientes() {
        return cajaClientes;
    }

    public void setCajaClientes(int cajaClientes) {
        this.cajaClientes = cajaClientes;
    }

    public int getCajaPreferencial() {
        return cajaPreferencial;
    }

    public void setCajaPreferencial(int cajaPreferencial) {
        this.cajaPreferencial = cajaPreferencial;
    }

    public int getCajaRapida() {
        return cajaRapida;
    }

    public void setCajaRapida(int cajaRapida) {
        this.cajaRapida = cajaRapida;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombreBanco=" + nombreBanco + ", cajaClientes=" + cajaClientes + ", cajaPreferencial=" + cajaPreferencial + ", cajaRapida=" + cajaRapida + '}';
    }

    public void crearTxt() {
        try (FileWriter writer = new FileWriter("prod.txt")) {
            writer.write(nombreBanco + "\n");
            writer.write(cajaClientes + "\n");
            JOptionPane.showMessageDialog(null,"La configuracion ha sido guardada");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Se presento un error inesperado");
            e.printStackTrace();
        }
    }
    public static Banco cargarConfiguracion() {
        try (BufferedReader reader = new BufferedReader(new FileReader("prod.txt"))) {
            String nombreBanco = reader.readLine();
            int cajaClientes = Integer.parseInt(reader.readLine());
            return new Banco(nombreBanco, cajaClientes);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error al cargar la configuración.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    public static Banco obtenerConfiguracion() {
    String nombreBanco = JOptionPane.showInputDialog(null, "Ingrese el nombre del banco:");

    int cajaClientes;
    while (true) {
        String input = JOptionPane.showInputDialog(null, "Ingrese la cantidad de cajas normales (mínimo 3):");
        try {
            cajaClientes = Integer.parseInt(input);
            if (cajaClientes >= 3) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad de cajas normales debe ser al menos 3. Intente de nuevo.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido. Intente de nuevo.");
        }
    }
    Banco configuracion = new Banco(nombreBanco, cajaClientes);
    configuracion.crearTxt();
    return configuracion; 

    }
    
    // Método para atender a un cliente en la caja
    public void atenderCliente(Clientes cliente) {
        // Buscar una caja disponible
        for (int i = 0; i < cajaClientes; i++) {
            if (cajasDisponibles[i]) {
                cliente.setCaja("Caja " + (i + 1)); // Asigna la caja al cliente
                cliente.setHoraAtencion(LocalDateTime.now()); // Actualiza la hora de atención
                cajasDisponibles[i] = false; // Marca la caja como ocupada
                System.out.println("Cliente " + cliente.getNombre() + " está siendo atendido en la " + cliente.getCaja());
                break;
            }
        }
    }

    // Método para liberar una caja
    public void liberarCaja(int numeroCaja) {
        if (numeroCaja > 0 && numeroCaja <= cajaClientes) {
            cajasDisponibles[numeroCaja - 1] = true;
            System.out.println("La caja " + numeroCaja + " ahora está disponible.");
        }
    }
    

}
