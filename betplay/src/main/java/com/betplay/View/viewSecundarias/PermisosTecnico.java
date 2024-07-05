package com.betplay.View.viewSecundarias;

import java.util.List;

import com.betplay.Entity.CheckInt;

public class PermisosTecnico {

    private PermisosTecnico() {}

    public static boolean Permisos (List<Integer> listaPermisos) {
        boolean salida = false;
        int opcion;
        System.out.println("============================");
        System.out.println("          PERMISOS");
        System.out.println("============================");
        System.out.println("1. Gestión del equipo\n");
        System.out.println("2. Gestión de jugadores\n");
        System.out.println("3. Gestión de partidos\n");
        System.out.println("4. Gestión de entrenadores\n");
        System.out.println("5. Gestión de estadisticas\n");
        System.out.println("6. Gestión de informes\n");
        System.out.println("7. Gestión de entrenamientos\n");
        System.out.println("8. Gestión de rendimiento\n");
        System.out.println("9. Gestión de convocatorias\n");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");

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

            case 3:
                listaPermisos.add(opcion);
                break;
            
            case 4:
                listaPermisos.add(opcion);
                break;
            
            case 5:
                listaPermisos.add(opcion);
                break;

            case 6:
                listaPermisos.add(opcion);
                break;
            
            case 7:
                listaPermisos.add(opcion);
                break;
            
            case 8:
                listaPermisos.add(opcion);
                break;
            
            case 9:
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
                break;
        }




        return salida;
    }

}
