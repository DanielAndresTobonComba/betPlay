package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionCalendarios;
import com.betplay.View.viewSecundarias.gestionComunicadosNoticias;
import com.betplay.View.viewSecundarias.gestionMedios;
import com.betplay.View.viewSecundarias.visualizarEstadisticas;

public class Periodista {


    public static void startPeriodista(){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("\n-------------------");
            System.out.println("   P E R I O D I S T A ");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");

            System.out.println("1. Visualizar estadisticas");
            System.out.println("2. Noticias y comunicados");
            System.out.println("3. Calendario de partidos");
            System.out.println("4. Medios de comunicacion");
            System.out.println("5. Cerrar sesion");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");

            decision = CheckInt.check(true);

            switch (decision) {
                case 1:
                    visualizarEstadisticas.startVisualizarEstadisticas();
                    break;
    
                case 2:
                    gestionComunicadosNoticias.startGestionComunicadosNoticias();
                    break;
    
                case 3:
                    gestionCalendarios.startconsultarCalendario();                
                    break;
    
                case 4:
                    gestionMedios.startGestionMedios();
                    break;
    
                case 5:
                    System.out.println("Sesion Cerrada");
                    System.out.print("Presiona entrer para salir: ");
                    scanner.nextLine();
                    Intro.startIntro();
                    
                    break;
            }
    
            
        } while (decision != 5);

       
    }

}
