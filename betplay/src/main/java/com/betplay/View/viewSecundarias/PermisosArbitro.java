package com.betplay.View.viewSecundarias;

import java.util.List;

import com.betplay.Entity.CheckInt;

public class PermisosArbitro {

    private PermisosArbitro() {}

    public static boolean Permisos(List<Integer> listaPermisos) {
        boolean salida = false;
        int opcion;

        
        System.out.println("\n====================================");
        System.out.println("             PERMISOS");
        System.out.println("====================================");
        System.out.println("1. Gestion de resultados\n");
        System.out.println("2. Gestion de incidentes y sanciones\n");
        System.out.println("0. Salir");
        System.out.println("------------------------------------");

        System.out.println("\n\n. . . . . . . . . . . . . . . .");
        System.out.println(" Digite el permiso a denegar");
        System.out.println(". . . . . . . . . . . . . . . .");
        System.out.print(">>> ");

        opcion = CheckInt.check();

        switch (opcion) {
            case 1:
                listaPermisos.add(opcion);
                break;

            case 2:
                listaPermisos.add(opcion);
                break;

            default:
                int confirmacion;
                System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                System.out.println("¿Confirmar permisos denegados?");
                System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
                System.out.println("1. Sí, denegar permisos.");
                System.out.println("0. No, salir sin denegar.");
                System.out.print(">>> ");
                confirmacion = CheckInt.check();
                switch (confirmacion) {
                    case 1:
                        System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                        System.out.println("  Se han denegado permisos al usuario.");
                        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                        
                        break;
                
                    default:
                        System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                        System.out.println("  Denegación de permisos CANCELADA.");
                        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                        listaPermisos.clear();
                        break;
                }
                salida = true;
        }

        return salida;
    }

}