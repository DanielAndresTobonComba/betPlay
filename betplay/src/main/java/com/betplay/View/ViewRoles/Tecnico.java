package com.betplay.View.ViewRoles;

import java.util.Scanner;

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

        do {

            System.out.println("\n\tMENU\n");
            System.out.println("1.Gestion del equipo");
            System.out.println("2. Gestion de jugadores");
            System.out.println("3. Gestion de partidos");
            System.out.println("4. Gestion de entrenadores");
            System.out.println("5. Gestion de estadisticas");
            System.out.println("6. Gestion de informes");
            System.out.println("7. Gestion de entrenamientos");
            System.out.println("8. Gestion de rendimiento");
            System.out.println("9. Gestio de convocatorias");

            System.out.println("10.Cerrar sesion");

            System.out.print("Opcion: ");
            decision = scanner.nextInt();
            scanner.nextLine();
     
            
        } while (decision != 3);

 
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
            
            case 10:
                
                break;
        }

    }

}
