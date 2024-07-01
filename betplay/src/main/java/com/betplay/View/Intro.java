package com.betplay.View;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.betplay.View.ViewRoles.seleccionRol;

<<<<<<< HEAD
import com.betplay.Entity.CheckInt;

=======
>>>>>>> 9e4a932a81a703bce58ab9c241dbed9701dc80bd
public class Intro {

    public static void startIntro (){

        int decision;
        boolean introPermise = true;


        //do {
        System.out.println("\n-------------------");
        System.out.println("   B E T P L A Y");
        System.out.println("===================");
        System.out.println("       Menú");
        System.out.println("===================");
        System.out.println("1. Registrar\n");
        System.out.println("2. Iniciar sesión\n");
        System.out.println("3. Salir");
        System.out.println("-------------------");

<<<<<<< HEAD
        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");
        
        // Validación de la opción ingresada por el usuario
        decision = CheckInt.check(introPermise);
        
=======
            System.out.println("\n\tMENU\n");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");

            System.out.print("Opcion: ");
            decision = scanner.nextInt();
            scanner.nextLine();
>>>>>>> 9e4a932a81a703bce58ab9c241dbed9701dc80bd
     
            
        //} while (decision != 3);

        switch (decision) {
            case 1:
                System.out.println("Registrar");
                break;

            case 2:

<<<<<<< HEAD
            System.out.println("Iniciar sesión");
                break;

=======
                seleccionRol.startSeleccionRol();
                
                break;

            case 3:

                System.out.println("Programa finalizado");
                scanner.close();
                
                break;

            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;
>>>>>>> 9e4a932a81a703bce58ab9c241dbed9701dc80bd
        
            default:
            System.out.println("CHAO");
                break;
        }

        System.out.println("\nPrograma finalizado");


    }

}
