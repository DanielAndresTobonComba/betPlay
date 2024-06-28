package com.betplay.view.ViewRoles;

import java.util.Scanner;

public class Arbitro {

    
    public static void startArbitro(){


        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("1. Gestion de resultados");
            System.out.println("2. Gestion de incidentes y sanciones");
            System.out.println("3. Cerrar sesion");

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

        }


    }

}
