/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Isaac
 */
public class SistemaTickets {
private static final String ARCHIVO_TICKETS = "numero_ticket.txt";
    private static int ticketActual;

    static {
        // Leer el número de ticket actual desde el archivo
        try (BufferedReader lector = new BufferedReader(new FileReader(ARCHIVO_TICKETS))) {
            ticketActual = Integer.parseInt(lector.readLine());
        } catch (IOException e) {
            ticketActual = 1; // Iniciar con 1 si el archivo no existe o está vacío
        }
    }

    public static int obtenerSiguienteTicket() {
        return ticketActual++;
    }

    public static void guardarTicketActual() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ARCHIVO_TICKETS))) {
            escritor.write(Integer.toString(ticketActual));
        } catch (IOException e) {
            e.printStackTrace(); // Manejar error si no se puede guardar el número de ticket
        }
    }
}
