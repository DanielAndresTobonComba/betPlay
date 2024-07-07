package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.ViewRoles.GuiaRoles;

public class ventaEntradas {

    public static void startVentaEntradas (String nombreUsuario){

        Scanner scanner = new Scanner(System.in);

        int decision = 0;
        
        do {

            System.out.println("\n---------------------");
            System.out.println("   E N T R A D A S");
            System.out.println("=====================");
            System.out.println("        Menú");
            System.out.println("=====================");
            System.out.println("1. Comprar\n");
            System.out.println("2. Visulizar\n");
            System.out.println("3. Cancelar\n");
            System.out.println("4. Regresar al menú");
            System.out.println("---------------------");


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
                    break;
        
            }
            
        } while (decision != 4);


    }

}
