package com.betplay.View.viewSecundarias;


import java.util.Scanner;

import com.betplay.Entity.CheckInt;

public class visualizarEstadisticas {

    public static void startVisualizarEstadisticas (){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {

            System.out.println("\n-------------------");
            System.out.println("   E S T A D I S T I C A S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Visualizar equipos");
            System.out.println("2. Visulizar jugadores");
            System.out.println("3. Visualizar por temporadas");
            System.out.println("4. Regresar al menu");

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
                    System.out.print("Presiona entrer para volver al menu pricipal: ");
                    scanner.nextLine();
                    return;
        
            }
            
        } while (decision != 4);

       
    }

}
