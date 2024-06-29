package com.betplay.View;

import java.util.Scanner;

import com.betplay.View.ViewRoles.seleccionRol;

public class Intro {

    public static void startIntro (){

        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\n\tMENU\n");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");

            System.out.print("Opcion: ");
            decision = scanner.nextInt();
            scanner.nextLine();
     
            
        } while (decision != 3);

        switch (decision) {
            case 1:
                
                break;

            case 2:

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
        
            default:
            System.out.println("Opcion invalida");
                break;
        }

        System.out.println("\nPrograma finalizado");


    }

}
