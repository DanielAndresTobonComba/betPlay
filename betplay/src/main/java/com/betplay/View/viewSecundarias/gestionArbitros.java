package com.betplay.View.viewSecundarias;

import java.util.Scanner;
import java.util.ResourceBundle.Control;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.ViewRoles.Arbitro;
import com.betplay.View.ViewRoles.GuiaRoles;

public class gestionArbitros {

    public static void startGestionArbitros (String nombreUsuario){
        int decision ;

        // Falta la clase arbitro

        Scanner scanner = new Scanner(System.in);

        //do {
            System.out.println("\n---------------------");
            System.out.println("   Á R B I T R O S");
            System.out.println("=====================");
            System.out.println("        Menú");
            System.out.println("=====================");
            //System.out.println("1. Registrar\n");
            System.out.println("1. Editar árbitro\n");
            System.out.println("2. Eliminar árbitro\n");
            System.out.println("0. Volver al menú");
            System.out.println("---------------------");


            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            decision = CheckInt.check();


            switch (decision) {
                case 1:
                    System.out.println("\n---------------------------------------");
                    System.out.println("  Aquí vamos a editar info de Árbitro");
                    System.out.println("---------------------------------------");
                    String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    break;
    
                case 2:
                    System.out.println("\n------------------------------------");
                    System.out.println("  Aquí vamos a eliminar un Árbitro");
                    System.out.println("------------------------------------");
                    rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    break;
    
                default:
                    System.out.print("\nPresiona entrer para volver al menu pricipal: ");
                    scanner.nextLine();
                    rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    break ;
    
            }
    
            
        //} while (decision != 3);

       
    }

}
