package com.betplay.View.ViewRoles;

import java.util.Scanner;

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

            System.out.println("\n\tSelecciona tu rol\n");
            System.out.println("1. Administrador");
            System.out.println("2. Arbitro");
            System.out.println("3. Medico");
            System.out.println("4. Periodista");
            System.out.println("5. Tecnico");
            System.out.println("6. Regresar al menu principal");

            System.out.print("Opcion: ");
            decision = scanner.nextInt();
            scanner.nextLine();
     
            
        } while (decision != 3);

        switch (decision) {
            case 1:
                
                break;

            case 2:

                
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
    }

}
