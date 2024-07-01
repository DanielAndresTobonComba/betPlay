package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.View.viewSecundarias.gestionCalendarios;
import com.betplay.View.viewSecundarias.gestionComunicadosNoticias;
import com.betplay.View.viewSecundarias.gestionMedios;
import com.betplay.View.viewSecundarias.visualizarEstadisticas;

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
                
                break;
        }
    }

}
