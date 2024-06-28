package com.betplay.View.viewSecundarias;

import java.util.Scanner;

public class gestionEntrenadores {

    public static void startGestionEntrenadores () {

        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Menu entrenadores");
            System.out.println("1. Agregar");
            System.out.println("2. Editar");
            System.out.println("3. Eliminar");
            System.out.println("4. Regresar al menu");

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
                
                break;

            case 4:
                
                break;

        }
    }

}
