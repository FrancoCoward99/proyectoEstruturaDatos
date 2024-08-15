/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Isaac
 */
public class ColaCajas {
 private ListaPreferencial colaPreferencial;
    private ListaCajaRapida colaRapida;
    private ListaNormal colaNormal;

    public ColaCajas() {
        colaPreferencial = new ListaPreferencial();
        colaRapida = new ListaCajaRapida();
        colaNormal = new ListaNormal();
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
}   

