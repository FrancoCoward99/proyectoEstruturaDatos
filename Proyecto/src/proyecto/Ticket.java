/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Isaac
 */
public class Ticket {
    private int numeroTicket;

    public Ticket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numeroTicket=" + numeroTicket + '}';
    }
}