package com.betplay.View.viewSecundarias;

import java.util.ArrayList;
import java.util.List;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.Usuario;
import com.betplay.View.ViewRoles.Administrador;
import com.betplay.View.ViewRoles.GuiaPermisos;

public class GestionPermisos {

    private GestionPermisos() {

    }

    public static void denegarPermisos(String nombreUsuario) {
        int opcion;


        System.out.println("\n-------------------");
        System.out.println("  P E R M I S O S");
        System.out.println("===================");
        System.out.println("       Menú");
        System.out.println("===================");
        System.out.println("1. Denegar permisos\n");
        System.out.println("2. Permitir todos\n");
        System.out.println("0. Salir");
        System.out.println("-------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");

        opcion = CheckInt.check();

        switch (opcion) {
            case 1:
                boolean salida = false;
                List<Integer> permisosDenegadosAgregados = new ArrayList<>();

                while (salida == false) {
                    salida = GuiaPermisos.menuPermisos(nombreUsuario, permisosDenegadosAgregados);
                }

                break;

            case 2:
                if (Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.size() == 0 ) {
                    System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                    System.out.println("  Todos los permisos permitidos.");
                    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                } else {
                    Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.clear();
                    System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                    System.out.println("  Todos los permisos permitidos.");
                    System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                };
                
                break;
        
            default:
            if (Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.size() == 0) {
                System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                System.out.println("  Todos los permisos permitidos.");
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
            } else {
                
                System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                System.out.println("  No se han realizado cambios.");
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
            };
                break;
        }
    }
}
