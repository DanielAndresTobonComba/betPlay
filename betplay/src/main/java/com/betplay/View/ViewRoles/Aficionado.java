package com.betplay.view.ViewRoles;

import java.util.Scanner;

public class Aficionado {

    public static void startAficionado(){


        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("1. Visualizar estadisticas");
            System.out.println("2. Compra de entradas");
            System.out.println("3. Calendario de partidos");
            System.out.println("4. Cerrar sesion");

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
