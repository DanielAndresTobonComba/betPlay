package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.ViewRoles.GuiaRoles;

public class gestionInformes {

    public static void startGestionInformes (String nombreUsuario){

        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("   I N F O R M E S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Agregar");
            System.out.println("2. Editar");
            System.out.println("3. Eliminar");
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
                    break;
   
            }

        } while (decision != 4);

        
    }

}
