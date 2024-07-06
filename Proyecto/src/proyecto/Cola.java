/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Admin
 */
public class Cola {
    private Nodo cabeza, ultimo;
    
    public Cola(){
        this.cabeza = null;
        this.ultimo = null;
    }
   
    // Añadir un cliente al final de la cola
    public void encolar(Nodo cliente) {
        if (ultimo == null) { // Si la cola está vacía
            cabeza = cliente;
            ultimo = cliente;
        } else {
            ultimo.setSiguiente(cliente);
            ultimo = cliente;
        }
    }
    
    // Remover y devolver el primer cliente de la cola
    public Nodo desencolar() {
        if (cabeza == null) {
            return null; // La cola está vacía
        } else {
            Nodo cliente = cabeza;
            cabeza = cabeza.getSiguiente();
            if (cabeza == null) {
                ultimo = null; // La cola quedó vacía
            }
            return cliente;
        }
    }
    
    public Nodo verCabeza() {
        return cabeza;
    }
}
