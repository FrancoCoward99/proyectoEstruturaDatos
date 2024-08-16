/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */
//Falta implementar que lea los clientes de prod.txt

public class ColaCajas {
 private ListaPreferencial colaPreferencial;
    private ListaCajaRapida colaRapida;
    private ListaNormal colaNormal;
    private Banco banco;

    public ColaCajas() {
        this.colaPreferencial = new ListaPreferencial();
        this.colaRapida = new ListaCajaRapida();
        this.colaNormal = new ListaNormal();
        this.banco = banco;
    }


    // Agregar un cliente a la cola correspondiente
    public void agregarCliente(Clientes cliente) {
        switch (cliente.getTipo()) {
            case 'P':
                colaPreferencial.inserta(cliente);
                break;
            case 'R':
                colaRapida.inserta(cliente);
                break;
            case 'N':
                colaNormal.inserta(cliente);
                break;
        }
        
        // Intentar atender al cliente si hay una caja disponible
        banco.atenderCliente(cliente);    
    }
   

    // Obtener la cantidad de personas por delante en la cola
    public int obtenerPersonasPorDelante(char tipo, int ticket) {
        switch (tipo) {
            case 'P':
                return colaPreferencial.obtenerPosicionP(ticket);
            case 'R':
                return colaRapida.obtenerPosicionR(ticket);
            case 'N':
                return colaNormal.obtenerPosicionN(ticket);
            default:
                return -1; // Tipo de cliente no existe
        }
    }
    
    // Método para atender el siguiente cliente de una cola
    public void atenderSiguienteCliente(char tipo) {
        Clientes cliente = null;
        switch (tipo) {
            case 'P':
                cliente = atenderClienteFilaPreferencial();
                break;
            case 'R':
                cliente = atenderClienteFilaRapida();
                break;
            case 'N':
                cliente = atenderClienteFilaNormal();
                break;
                default:
            JOptionPane.showMessageDialog(null, "Tipo de cliente no válido.");
            return;
        }
        
        if (cliente != null) {
            banco.atenderCliente(cliente); // Asigna una caja y atiende al cliente
        } else {
            System.out.println("No hay clientes en la fila " + tipo);
        }
    }
    
    //Atender cliente de la fila normal
    public  Clientes atenderClienteFilaNormal(){
        Nodo clienteNodo = colaNormal.extrae(null); // Suponiendo que extrae el primer cliente en la cola
        return clienteNodo != null ? clienteNodo.getDato() : null;
    }
    
    // Atender cliente de la fila preferencial
    public Clientes atenderClienteFilaPreferencial() {
        Nodo clienteNodo = colaPreferencial.extrae(null);  // Extrae el primer cliente en la cola
        return clienteNodo != null ? clienteNodo.getDato() : null;
    }

    // Atender cliente de la fila rápida
    public Clientes atenderClienteFilaRapida() {
        Nodo clienteNodo = colaRapida.extraer();  // Extrae el primer cliente en la cola
        return clienteNodo != null ? clienteNodo.getDato() : null;
    }
}   

