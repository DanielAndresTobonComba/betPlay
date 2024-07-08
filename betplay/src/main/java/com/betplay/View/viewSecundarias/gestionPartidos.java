package com.betplay.View.viewSecundarias;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.ViewRoles.GuiaRoles;

public class gestionPartidos {

    public static void startGestionPartidos (String nombreUsuario){

        int decision ;

        Scanner scanner = new Scanner(System.in);

        //do {
            System.out.println("\n---------------------");
            System.out.println("   P A R T I D O S");
            System.out.println("=====================");
            System.out.println("        Menú");
            System.out.println("=====================");
            System.out.println("1. Programar partido\n");
            System.out.println("2. Modificar partido\n");
            System.out.println("3. Eliminar partido\n");
            // System.out.println("4. Registrar resultados"); // Revizar que datos va a tener como goles tarjetas etc.
            System.out.println("0. Regresar al menú");
            System.out.println("---------------------");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");

            decision = CheckInt.check();
            
            switch (decision) {
                case 1:
                    AgendaPartidos.Agendar(nombreUsuario);
                    break;
    
                case 2:
                    
                    break;
    
                case 3:
                    
                    break;
    
                default:
                    System.out.print("Presiona entrer para volver al menu pricipal: ");
                    System.out.print(">>> ");
                    scanner.nextLine();
                    String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    break;
    
            }
            
        //} while (decision != 4);

        
        
    }

}
