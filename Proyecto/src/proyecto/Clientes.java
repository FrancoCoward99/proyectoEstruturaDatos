/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.time.LocalDateTime;

/**
 *
 * @author Isaac
 */
public class Clientes {
     //Como se indica en el modulo 1.1 se debe cotemplar la informacion del cliente en la clase nodo
    // Atributos del cliente
    private String nombre;
    private String id;
    private int edad;
    private LocalDateTime horaCreacion;
    private LocalDateTime horaAtencion;
    private String tramite;
    private char tipo; // nivel de prioridad A, B, C 
    private int ticket;
    private String caja; // Caja en la que será atendido (rápida, normal, preferencial)
    private int personasPorDelante; // Cantidad de personas por delante en la cola

    // Constructor principal
   public Clientes(String nombre, String id, int edad, LocalDateTime horaCreacion, String tramite, char tipo, int prioridad, int ticket, String caja) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.horaCreacion = horaCreacion;
        this.tramite = tramite;
        this.tipo = tipo;
        this.ticket = ticket;
        this.caja = caja;
        this.personasPorDelante = 0; // Se asignará al calcular la posición en la cola
    }

    // Constructor de copia
   
    

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalDateTime horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public LocalDateTime getHoraAtencion() {
        return horaAtencion;
    }

    public void setHoraAtencion(LocalDateTime horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public int getPersonasPorDelante() {
        return personasPorDelante;
    }

    public void setPersonasPorDelante(int personasPorDelante) {
        this.personasPorDelante = personasPorDelante;
    }

    // Método toString para mostrar la información del cliente
    @Override
    public String toString() {
        return "Cliente:" + "\n" +
                "Nombre: " + nombre + "\n" + 
                "ID: " + id + "\n" + 
                "Edad: " + edad + "\n" + 
                "Hora de Creación: " + horaCreacion + "\n" + 
                "Hora de Atención: " + (horaAtencion != null ? horaAtencion : "No atendido aún") + "\n" + 
                "Trámite: " + tramite + "\n" + 
                "Tipo: " + tipo + "\n" + 
                "Ticket: " + ticket + "\n" + 
                "Caja Asignada: " + caja + "\n" + 
                "Personas por Delante: " + personasPorDelante + "\n";
    }
}
