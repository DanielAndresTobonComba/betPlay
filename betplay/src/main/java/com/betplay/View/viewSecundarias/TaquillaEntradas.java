package com.betplay.View.viewSecundarias;

import java.util.Map;

import com.betplay.Controller;

public class TaquillaEntradas {

    public static void Comprar(String nombreUsuario) {

        System.out.println("\n============================");
        System.out.println("    PARTIDOS PROGRAMADOS");
        System.out.println("============================");
        for (Map.Entry partido : Controller.getController().controladorPartidos.entrySet()) {
            Object key =  partido.getKey();
            int intKey = (Integer) key;
            int keyEquipoLocal = Controller.getController().controladorPartidos.get(intKey).idEquipoLocal;
            int keyEquipoVisitante = Controller.getController().controladorPartidos.get(intKey).idEquipoVisitante;
            String nombreEquipoLocal = Controller.getController().controladorEquipos.get(keyEquipoLocal).nombre;
            String nombreEquipoVisitante = Controller.getController().controladorEquipos.get(keyEquipoVisitante).nombre;
            System.out.println( key + ". " + nombreEquipoLocal + " vs " + nombreEquipoVisitante + "\n"  );
        }
        System.out.println("0. Salir");
        System.out.println("----------------------------");
        ventaEntradas.startVentaEntradas(nombreUsuario);
    }
}
