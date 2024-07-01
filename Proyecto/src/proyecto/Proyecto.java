/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Nodo> clientes = new ArrayList<>();
        clientes.add(new Nodo("Juan Perez", "123", 30, "Depósitos", 'P'));
        clientes.add(new Nodo("Maria Lopez", "124", 25, "Retiros", 'A'));
        clientes.add(new Nodo("Carlos Sanchez", "125", 40, "Cambio de Divisas", 'B'));
         
       guardarCliente_archivo(clientes);
        Banco configuracion;
        File txt = new File("prod.txt");
        if (txt.exists()) {
            configuracion = Banco.cargarConfiguracion();
        } else {
            configuracion = Banco.obtenerConfiguracion();
        }
        
        //File txt = new File("prod.txt");
        
    }
    
        public static void guardarCliente_archivo(List<Nodo> lista){
        try{
            BufferedWriter ingreso = new BufferedWriter(new FileWriter("prod.txt", true));
            for(Nodo ls : lista){
                ingreso.write(ls.getNombre()+"\t"+ls.getId()+"\t"+String.valueOf(ls.getEdad())+"\t"+ls.getTramite()+"\t"+ls.getTipo());
                ingreso.newLine();
            }
            ingreso.close();
        }catch(IOException e){
             System.out.println("Error al escribir en el archivo " + e.getMessage());
        }
    }
    
}
