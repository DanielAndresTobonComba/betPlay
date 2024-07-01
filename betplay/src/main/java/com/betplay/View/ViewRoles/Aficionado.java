package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.View.viewSecundarias.gestionCalendarios;
import com.betplay.View.viewSecundarias.ventaEntradas;
import com.betplay.View.viewSecundarias.visualizarEstadisticas;

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
                visualizarEstadisticas.startVisualizarEstadisticas();
                break;

            case 2:
                ventaEntradas.startVentaEntradas();
                break;

            case 3:
                gestionCalendarios.startconsultarCalendario();
                break;

            case 4:
                
                break;
        }
    }

    
}
