/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.io.File;

/**
 *
 * @author Admin
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco configuracion;
        File txt = new File("prod.txt");
        if (txt.exists()) {
            configuracion = Banco.cargarConfiguracion();
        } else {
            configuracion = Banco.obtenerConfiguracion();
        }
    }
    
    
    
}
