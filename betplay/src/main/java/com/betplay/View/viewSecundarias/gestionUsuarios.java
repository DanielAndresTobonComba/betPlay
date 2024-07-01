package com.betplay.View.viewSecundarias;

import java.util.Scanner;

public class gestionUsuarios {

    public static void startGestionUsuarios (){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("\n\tMENU GESTION USUARIOS\n");
            System.out.println("1. Ingresar");
            System.out.println("2. Modificar");
            System.out.println("3. Eliminar");
            System.out.println("4. Regresar al menu princiàl");

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
