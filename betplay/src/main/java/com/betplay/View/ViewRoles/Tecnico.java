package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionConvocatoria;
import com.betplay.View.viewSecundarias.gestionEntrenadores;
import com.betplay.View.viewSecundarias.gestionEntrenamiento;
import com.betplay.View.viewSecundarias.gestionEquipos;
import com.betplay.View.viewSecundarias.gestionInformes;
import com.betplay.View.viewSecundarias.gestionJugadores;
import com.betplay.View.viewSecundarias.gestionPartidos;
import com.betplay.View.viewSecundarias.gestionRendimiento;
import com.betplay.View.viewSecundarias.visualizarEstadisticas;

public class Tecnico {

    public static void startTecnico (){

        int decision ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n----------------------------");
        System.out.println("       T É C N I C O");
        System.out.println("============================");
        System.out.println("           Menú");
        System.out.println("============================");
        System.out.println("1.Gestioón del equipo\n");
        System.out.println("2. Gestión de jugadores\n");
        System.out.println("3. Gestión de partidos\n");
        System.out.println("4. Gestión de entrenadores\n");
        System.out.println("5. Gestión de estadisticas\n");
        System.out.println("6. Gestión de informes\n");
        System.out.println("7. Gestión de entrenamientos\n");
        System.out.println("8. Gestión de rendimiento\n");
        System.out.println("9. Gestión de convocatorias\n");
        System.out.println("0.Cerrar sesión");
        System.out.println("-----------------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");
        
        // Validación de la opción ingresada por el usuario
        decision = CheckInt.check();

 
        switch (decision) {
            case 1:
                gestionEquipos.startGestioEquipos();
                break;

            case 2:
                gestionJugadores.startGestionJugadores();
                break;

            case 3:
                gestionPartidos.startGestionPartidos();
                break;

            case 4:
                gestionEntrenadores.startGestionEntrenadores();
                break;

            case 5:
                visualizarEstadisticas.startVisualizarEstadisticas();
                break;

            case 6:
                gestionInformes.startGestionInformes();
                break;

            case 7:
                gestionEntrenamiento.startGestionEntrenamiento();
                break;

            case 8:
                gestionRendimiento.startGestionRendimiento();
                break;

            case 9:
                gestionConvocatoria.startGestionConvocatoria();
                break;
            
            default:
                Intro.startIntro();
                break;
        }

    }

}
