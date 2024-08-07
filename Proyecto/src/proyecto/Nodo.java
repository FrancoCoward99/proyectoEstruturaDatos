package proyecto;

import java.time.LocalDateTime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Nodo {

    private Clientes dato;
    private Nodo siguiente;
    private Nodo ultimo;

    public Nodo(Clientes dato) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.ultimo = ultimo;
    }

    public Clientes getDato() {
        return dato;
    }

    public void setDato(Clientes dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

}
