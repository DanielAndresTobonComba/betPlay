package com.betplay.View.viewSecundarias;

import java.util.Map;

import com.betplay.Controller;

public class AgendaPartidos {

    public static void Agendar (String nombreUsuario) {

        if (Controller.getController().controladorEquipos.size() == 0) {

            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            System.out.println(" No hay equipos registrados  ");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
            gestionPartidos.startGestionPartidos(nombreUsuario);

        } else if (Controller.getController().controladorEquipos.size() == 1) {

            System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("  No hay suficientes equipos para registrar un partido");
            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            gestionPartidos.startGestionPartidos(nombreUsuario);

        } else {

            System.out.println("\n===============================");
            System.out.println("      EQUIPOS REGISTRADOS");
            System.out.println("===============================");
            for (Map.Entry equipo : Controller.getController().controladorEquipos.entrySet()) {
                Object key =  equipo.getKey();
                int intKey = (Integer) key;
                String nombreEquipo = Controller.getController().controladorEquipos.get(intKey).nombre;
                System.out.println( intKey + ". " + nombreEquipo + "\n"  );
            }
            System.out.println("0. Salir");
            System.out.println("--------------------------------");

            gestionPartidos.startGestionPartidos(nombreUsuario);

        }

        

    }

}
