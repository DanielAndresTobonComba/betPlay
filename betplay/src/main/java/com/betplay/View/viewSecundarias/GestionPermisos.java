package com.betplay.View.viewSecundarias;

import java.util.ArrayList;
import java.util.List;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.Usuario;

public class GestionPermisos {

    private GestionPermisos() {

    }

    public static void denegarPermisos(Usuario usuario) {
        int opcion;


        System.out.println("\n-------------------");
        System.out.println("  P E R M I S O S");
        System.out.println("===================");
        System.out.println("       Menú");
        System.out.println("===================");
        System.out.println("1. Denegar\n");
        System.out.println("2. Permitir todos\n");
        System.out.println("3. Salir");
        System.out.println("-------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");

        opcion = CheckInt.check();

        switch (opcion) {
            case 1:
                boolean salida = false;
                List<Integer> permisosDenegados = new ArrayList<>();

                /*while (salida) {
                    
                }*/

                break;

            case 2:
                Controller.getController().controladorUsuarios.get(usuario).permisosDenegados.clear();
                System.out.println("\n-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                System.out.println("  Todos los permisos delegados");
                System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
                break;
        
            default:
                break;
        }
    }
}
