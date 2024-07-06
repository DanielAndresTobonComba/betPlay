package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionCalendarios;
import com.betplay.View.viewSecundarias.gestionComunicadosNoticias;
import com.betplay.View.viewSecundarias.gestionMedios;
import com.betplay.View.viewSecundarias.visualizarEstadisticas;

public class Periodista {


    public static void startPeriodista( String nombreUsuario){

        int decision ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--------------------------");
        System.out.println("   P E R I O D I S T A");
        System.out.println("==========================");
        System.out.println("          Menú");
        System.out.println("==========================");
        System.out.println("1. Visualizar estadísticas\n");
        System.out.println("2. Noticias y comunicados\n");
        System.out.println("3. Calendario de partidos\n");
        System.out.println("4. Medios de comunicación\n");
        System.out.println("0. Cerrar sesión");
        System.out.println("--------------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");
        
        // Validación de la opción ingresada por el usuario
        decision = CheckInt.check();


        
        

        switch (decision) {
            case 1:
                if (Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.contains(decision)) {
                    System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                    System.out.println("  Estás impedido para realizar esta función");
                    System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*\n");
                    Periodista.startPeriodista(nombreUsuario);
                }
                else {
                    visualizarEstadisticas.startVisualizarEstadisticas(nombreUsuario);
                }
                
                break;

            case 2:
                if (Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.contains(decision)) {
                    System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                    System.out.println("  Estás impedido para realizar esta función");
                    System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*\n");
                    Periodista.startPeriodista(nombreUsuario);
                }
                else {
                    gestionComunicadosNoticias.startGestionComunicadosNoticias(nombreUsuario);
                }
                
                break;

            case 3:
                if (Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.contains(decision)) {
                    System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                    System.out.println("  Estás impedido para realizar esta función");
                    System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*\n");
                    Periodista.startPeriodista(nombreUsuario);
                }
                else {
                    gestionCalendarios.startconsultarCalendario(nombreUsuario);
                }
                                
                break;

            case 4:
                if (Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.contains(decision)) {
                    System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                    System.out.println("  Estás impedido para realizar esta función");
                    System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*\n");
                    Periodista.startPeriodista(nombreUsuario);
                }
                else {
                    gestionMedios.startGestionMedios(nombreUsuario);
                }
                
                break;

            default:
                Intro.startIntro();
                break;
        }
    }

}
