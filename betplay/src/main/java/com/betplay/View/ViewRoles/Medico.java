package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionLesiones;

public class Medico {

    public static void startMedico (String nombreUsuario){

        int decision ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n----------------------");
        System.out.println("     M É D I C O");
        System.out.println("======================");
        System.out.println("        Menú");
        System.out.println("======================");
        System.out.println("1. Gestion de lesiones\n");
        System.out.println("0. Cerrar sesión");
        System.out.println("----------------------");

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
                    Medico.startMedico(nombreUsuario);
                }
                else {
                    gestionLesiones.startGestionLesiones();
                }
                
                break;

            
            default:
                Intro.startIntro();
                break;

        }
        
    }

}
