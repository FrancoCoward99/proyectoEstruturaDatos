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
    private int contadorTickets;

    public ColaCajas() {
        this.colaPreferencial = new Cola();
        this.colaNormal = new Cola();
        this.colaRapida = new Cola();
        this.contadorTickets = 1;
    }

    public void agregarCliente(Clientes cliente) {
        Ticket ticket = new Ticket(contadorTickets);
        contadorTickets++;
        cliente.setTicket(contadorTickets);
        Nodo nodoCliente = new Nodo(cliente);

        switch (cliente.getTipo()) {
            case 'P': // Preferencial
                colaPreferencial.encolar(nodoCliente);
                break;
            case 'R': // Trámite rápido
                colaRapida.encolar(nodoCliente);
                break;
            case 'N': // Trámite normal
                colaNormal.encolar(nodoCliente);
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

    public int obtenerPosicionEnCola(char tipo, int ticket) {
        switch (tipo) {
            case 'P':
                return colaPreferencial.obtenerPosicion(ticket);
            case 'R':
                return colaRapida.obtenerPosicion(ticket);
            case 'N':
                return colaNormal.obtenerPosicion(ticket);
            default:
                return -1; // Tipo de cliente no existe
        }
    }

    public boolean esTurnoDeAtencion(char tipo, int ticketNumero) {
        return obtenerPosicionEnCola(tipo, ticketNumero) == 0;
    }


    public void mostrarColas() {
        System.out.println("Cola Preferencial:");
        mostrarCola(colaPreferencial);

        System.out.println("Cola Normal:");
        mostrarCola(colaNormal);

        System.out.println("Cola Rápida:");
        mostrarCola(colaRapida);
    }
    
    private void imprimirTicket(Clientes cliente) {
        System.out.println("Ticket generado para el cliente: " + cliente);
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
