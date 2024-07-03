package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionComunicadosNoticias;
import com.betplay.View.viewSecundarias.gestionPartidos;
import com.betplay.View.viewSecundarias.gestionResultados;

public class Arbitro {

    
    public static void startArbitro(String nombreUsuario){


        int decision = 0 ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------------------------------------");
        System.out.println("          A R B I T R O");
        System.out.println("====================================");
        System.out.println("              Menú");
        System.out.println("====================================");
        System.out.println("1. Gestion de resultados\n");
        System.out.println("2. Gestion de incidentes y sanciones\n");
        System.out.println("3. Cerrar sesion");
        System.out.println("------------------------------------");

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
                    Arbitro.startArbitro(nombreUsuario);
                }
                else {
                    gestionResultados.startGestionResultados();
                }
                
                break;

            case 2:
                if (Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.contains(decision)) {
                    System.out.println("\n*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
                    System.out.println("  Estás impedido para realizar esta función");
                    System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*\n");
                    Arbitro.startArbitro(nombreUsuario);
                }
                else {
                    gestionComunicadosNoticias.startGestionComunicadosNoticias();
                }
                
                break;

            default:
                Intro.startIntro();
                break;

        }


    }

}
