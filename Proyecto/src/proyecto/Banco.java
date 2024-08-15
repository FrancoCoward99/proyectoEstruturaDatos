/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    

    public Banco(String nombreBanco, int cajaClientes) {
        this.nombreBanco = nombreBanco;
        this.cajaClientes = cajaClientes;
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

}
