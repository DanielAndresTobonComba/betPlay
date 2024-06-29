package com.betplay.View;

import java.util.Scanner;

public class Intro {

    public static void startIntro (){

        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("   B E T P L A Y");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Registrar\n");
            System.out.println("2. Iniciar sesión\n");
            System.out.println("3. Salir");
            System.out.println("-------------------");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            decision = scanner.nextInt();
            scanner.nextLine();
     
            
        } while (decision != 3);

        switch (decision) {
            case 1:
                
                break;

            case 2:
                
                break;

        
            default:
            System.out.println("Opcion invalida");
                break;
        }

        System.out.println("\nPrograma finalizado");


    }

}
