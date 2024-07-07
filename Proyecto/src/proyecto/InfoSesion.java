/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author Admin
 */
public class InfoSesion {
     private String nombreUsuario;
    private String contrasenia;

    public InfoSesion() {
    }

    public InfoSesion(String nombreUsuario, String contrasenia) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenia = contrasenia;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    // Método para autenticar usuario
    public boolean autenticar(String nombreUsuario, String contrasenia) {
        return this.nombreUsuario.equals(nombreUsuario) && this.contrasenia.equals(contrasenia);
    }
}
