package com.betplay.View.viewSecundarias;


import java.util.Scanner;

public class visualizarEstadisticas {

    public static void startVisualizarEstadisticas (){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("1. Visualizar equipos");
            System.out.println("2. Visulizar jugadores");
            System.out.println("3. Visualizar por temporadas");
            System.out.println("Regresar al menu");

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
