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
    private String nombre;
    private String id;
    private int edad;
    private LocalDateTime horaCreacion;
    private LocalDateTime horaAtencion;
    private String tramite;
    private char tipo; // nivel de prioridad A,B,C 
    private int prioridad; // Para manejar la prioridad en la cola
    private int ticket;
  

 public Clientes(String nombre, String id, int edad, LocalDateTime horaCreacion, String tramite, char tipo, int prioridad, int ticket) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.horaCreacion = horaCreacion;
        this.tramite = tramite;
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.ticket = ticket;
    }

    public Clientes(Clientes cliente) {
    }
    

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
    

   
    
    public void setPrioridad(){
        switch(tipo){
            case 'A':
                this.prioridad =1;
                break;
            case 'B':
                this.prioridad = 2;
                 break;
            case 'C':
                this.prioridad = 3;
                break;
        }
    }

    @Override
    public String toString() {
        return "Cliente " +"\n"+
                "Nombre: " + nombre +"\n"+ 
                "Id: " + id +"\n"+ 
                "Edad: " + edad +"\n"+ 
                "HoraCreacion=" + horaCreacion +"\n"+ "Hora de atencion" + horaAtencion +"\n"+ 
                "Tramite: " + tramite +"\n"+ 
                "Tipo: " + tipo +"\n"+ 
                "Prioridad: " + prioridad+
                ", ticket=" + ticket +
                '}';
    }
    
 
}
