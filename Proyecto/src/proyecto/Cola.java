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
    private Nodo cabeza , ultimo;
    
    
    public Cola(){
        this.cabeza = null;
        this.ultimo = null;
    }
      
     public void encolar(Clientes cliente){
         
     }
   
    // Añadir un cliente al final de la cola
    public void encolar(Nodo clientes) {
        if (ultimo == null) { // Si la cola está vacía
            cabeza = clientes;
            ultimo = clientes;
        } else {
            ultimo.setSiguiente(clientes);
            ultimo = clientes;
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
    public int obtenerPosicion(int ticket ) {
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
    
    public Nodo verCabeza() {
        return cabeza;
    }

    @Override
    public String toString() {
        return "Cola{" + "cabeza=" + cabeza + ", ultimo=" + ultimo + '}';
    }
    
    
    
}
