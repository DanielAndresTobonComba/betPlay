package com.betplay.View.viewSecundarias;


import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.ViewRoles.GuiaRoles;

public class visualizarEstadisticas {

    public static void startVisualizarEstadisticas (String nombreUsuario){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("\n-------------------");
            System.out.println("   E S T A D I S T I C A S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Visualizar equipos");
            System.out.println("2. Visulizar jugadores");
            System.out.println("3. Visualizar por temporadas");
            System.out.println("4. Regresar al menu");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            
            decision = CheckInt.check();
            
            switch (decision) {
                case 1:
                    
                    break;
    
                case 2:
                    
                    break;
    
                case 3:
                    
                    break;
    
                default:
                    System.out.print("Presiona entrer para volver al menu pricipal: ");
                    scanner.nextLine();
                    String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    return;
        
            }
            
        } while (decision != 4);

       
    }

}
