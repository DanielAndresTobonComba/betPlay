package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionCalendarios;
import com.betplay.View.viewSecundarias.ventaEntradas;
import com.betplay.View.viewSecundarias.visualizarEstadisticas;

public class Aficionado {

    public static void startAficionado(){


        int decision = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--------------------------");
        System.out.println("    A F I C I O N A D O");
        System.out.println("==========================");
        System.out.println("           Menú");
        System.out.println("==========================");
        System.out.println("1. Visualizar estadisticas\n");
        System.out.println("2. Compra de entradas\n");
        System.out.println("3. Calendario de partidos\n");
        System.out.println("4. Cerrar sesion");
        System.out.println("--------------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");
        
        // Validación de la opción ingresada por el usuario
        decision = CheckInt.check();


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

            
            default:
                Intro.startIntro();
                break;
        }
    }

    
}
