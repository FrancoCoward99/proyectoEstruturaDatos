/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import UI.FormCliente;
import UI.Login;
import UI.MenuPrincipal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import proyecto.Banco;
import proyecto.InfoSesion;

/**
 *
 * @author Admin
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InfoSesion sesion = new InfoSesion("admin", "admin");

        //Mostra UI
        Login loginUi = new Login();
        MenuPrincipal menuPrincipalUI = new MenuPrincipal();
        FormCliente formClientesUI = new FormCliente();
        loginUi.setVisible(true);
        iniciarAplicacion();

        //Lista de ejemplo
        //List<Nodo> clientes = new ArrayList<>();
        //clientes.add(new Nodo("Juan Perez", "123", 30, "Depósitos", 'P'));
        //clientes.add(new Nodo("Maria Lopez", "124", 25, "Retiros", 'A'));
        // clientes.add(new Nodo("Carlos Sanchez", "125", 40, "Cambio de Divisas", 'B'));
        //guardarCliente_archivo(clientes);
        //Cargar Conf TXT
        //File txt = new File("prod.txt");
    }

    private static void iniciarAplicacion() {
        Banco configuracion;
        File txt = new File("prod.txt");

        // Verifica si el archivo existe y no está vacío
        if (txt.exists() && txt.length() > 0) {
            configuracion = Banco.cargarConfiguracion();
            if (configuracion == null) {
                // Si la configuración cargada es nula, solicita la configuración
                configuracion = Banco.obtenerConfiguracion();
            }
        } else {
            // Si el archivo no existe o está vacío, solicita la configuración
            configuracion = Banco.obtenerConfiguracion();
        }

    }
}
