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
     
public Nodo extraer(Clientes pclientes) {
    Nodo extraido = null;

    if (cabeza == null) {
        JOptionPane.showMessageDialog(null, "Lista vacía");
    } else if (cabeza.getDato().equals(pclientes)) {
        extraido = cabeza;

        if (cabeza == ultimo) {
           
            cabeza = null;
            ultimo = null;
        } else {
            cabeza = cabeza.getSiguiente();
            ultimo.setSiguiente(cabeza);  
        }
        
        JOptionPane.showMessageDialog(null, "El siguiente cliente se va a atender" + pclientes.getNombre());
        extraido.setSiguiente(null);
    } else {
        Nodo aux = cabeza;
        while (aux.getSiguiente() != cabeza && !aux.getSiguiente().getDato().equals(pclientes)) {
            aux = aux.getSiguiente();
        }

        if (aux.getSiguiente() != cabeza && aux.getSiguiente().getDato().equals(pclientes)) {
            extraido = aux.getSiguiente();
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
            if (extraido == ultimo) {
                ultimo = aux; 
            }
            extraido.setSiguiente(null);
        } else {
            JOptionPane.showMessageDialog(null, "Ya no hay mas clientes en cola");
        }
    }
    
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
