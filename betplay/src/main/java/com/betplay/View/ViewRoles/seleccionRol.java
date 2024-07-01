package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;

public class seleccionRol {

    public static void startSeleccionRol (){

        Scanner scanner = new Scanner(System.in);

        String usuario = "";
        String contraseña = "";

        int decision ;
        int rol = 0;

        
        System.out.print("Usuario: ");
        scanner.nextLine();

        System.out.print("Contraseña: ");
        scanner.nextLine();

        do {
            System.out.println("\n-------------------");
            System.out.println("   R O L E S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Administrador");
            System.out.println("2. Arbitro");
            System.out.println("3. Medico");
            System.out.println("4. Periodista");
            System.out.println("5. Tecnico");
            System.out.println("6. Regresar al menu principal");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");

            decision = CheckInt.check(true);

            switch (decision) {
                case 1:
                    
                    break;
    
                case 2:
    
                    
                    break;
    
                case 3:
                    
                    break;
    
                case 4:
                    
                    break;
    
                case 5:
                    
                    break;
    
                case 6:
                    System.out.println("Seleccion de rol candelada");
                    System.out.print("Presiona entrer para salir: ");
                    scanner.nextLine();
                    Intro.startIntro();
                    
                    break;
            
                default:
                System.out.println("Opcion invalida");
                    break;
            }
     
            
        } while (decision != 6);

       
    }

}
