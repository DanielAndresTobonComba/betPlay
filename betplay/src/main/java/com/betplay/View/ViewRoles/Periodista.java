package com.betplay.View.ViewRoles;

import java.util.Scanner;

public class Periodista {


    public static void startPeriodista(){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("1. Visualizar estadisticas");
            System.out.println("2. Noticias y comunicados");
            System.out.println("3. Calendario de partidos");
            System.out.println("4. Medios de comunicacion");
            System.out.println("5. Cerrar sesion");

            System.out.print("Opcion: ");
            decision = scanner.nextInt();
            scanner.nextLine();
    
            
        } while (decision != 3);
    }

}
