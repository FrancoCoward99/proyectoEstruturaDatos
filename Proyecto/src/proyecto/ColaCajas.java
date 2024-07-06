/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Lenovo X1
 */
public class ColaCajas {
    //Las 3 solicitadas
    private Cola colaPreferencial;
    private Cola colaNormal;
    private Cola colaRapida;

    public ColaCajas() {
        this.colaPreferencial = new Cola();
        this.colaNormal = new Cola();
        this.colaRapida = new Cola();
    }

    public void agregarCliente(Nodo cliente) {
        switch (cliente.getTipo()) {
            case 'P': // Preferencial
                colaPreferencial.encolar(cliente);
                break;
            case 'R': // Trámite rápido
                colaRapida.encolar(cliente);
                break;
            case 'N': // Trámite normal
                colaNormal.encolar(cliente);
                break;
            default:
                System.out.println("Tipo de cliente no existe.");
                break;
        }
    }

    public Nodo atenderPreferencial() {
        return colaPreferencial.desencolar();
    }

    public Nodo atenderNormal() {
        return colaNormal.desencolar();
    }

    public Nodo atenderRapida() {
        return colaRapida.desencolar();
    }

    public void mostrarColas() {
        System.out.println("Cola Preferencial:");
        mostrarCola(colaPreferencial);

        System.out.println("Cola Normal:");
        mostrarCola(colaNormal);

        System.out.println("Cola Rápida:");
        mostrarCola(colaRapida);
    }
    
    //Para ver todos los nodos en una cola específica
    private void mostrarCola(Cola cola) {
        Nodo actual = cola.verCabeza();
        while (actual != null) {
            System.out.println(actual.toString());
            actual = actual.getSiguiente();
        }
    }
}
