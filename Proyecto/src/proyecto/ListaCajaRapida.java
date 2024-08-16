/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import javax.swing.JOptionPane;

/**
 *
 * @author Franco Coward
 */
public class ListaCajaRapida {
        
     private Nodo cabeza, ultimo;
     
     public void inserta(Clientes pclientes) {
        Nodo nuevo = new Nodo(pclientes);
        if (cabeza == null) {
            cabeza = nuevo;
            //circularidad
            ultimo = nuevo;
            ultimo.setSiguiente(nuevo);
        }
    }
     
     public Nodo extraer() {
    if (cabeza == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía.");
        return null;
    }

    Nodo extraido = cabeza;
    if (cabeza == ultimo) { // Solo un nodo en la lista
        cabeza = null;
        ultimo = null;
    } else {
        cabeza = cabeza.getSiguiente();
        ultimo.setSiguiente(cabeza); // Mantener la circularidad
    }
    extraido.setSiguiente(null); // Desconectar el nodo extraído de la lista

    JOptionPane.showMessageDialog(null, "Cliente " + extraido.getDato().getNombre() + " será atendido.");
    return extraido;
}
     
public int obtenerPosicionR(int ticket) {
        Nodo actual = cabeza;
        int posicion = 0;

        while (actual != null) {
            if (actual.getDato().getTicket() == ticket) {
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        }

        return -1; // No encontrado
    }
}
