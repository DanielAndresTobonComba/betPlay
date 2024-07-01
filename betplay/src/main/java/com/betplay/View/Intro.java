package com.betplay.View;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.betplay.View.ViewRoles.seleccionRol;
import com.betplay.View.viewSecundarias.iniciarSesion;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.ChekUser;

public class Intro {

    public static void startIntro (){

        int decision;
        boolean introPermise = true;
        String rol;
        String nombreusuario;
        String contraseña;
        Scanner scanner = new Scanner(System.in);


        //do {
        System.out.println("\n-------------------");
        System.out.println("   B E T P L A Y");
        System.out.println("===================");
        System.out.println("       Menú");
        System.out.println("===================");
        System.out.println("1. Registrar\n");
        System.out.println("2. Iniciar sesión\n");
        System.out.println("3. Salir");
        System.out.println("-------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");
        
        // Validación de la opción ingresada por el usuario
        decision = CheckInt.check(introPermise);
        
     
            
        //} while (decision != 3);

        switch (decision) {
            case 1:
                System.out.println("Registrar");
                break;

            case 2:

                rol = iniciarSesion.getRol(decision);
                nombreusuario = iniciarSesion.getNombreUsuario();
                contraseña = iniciarSesion.getPassword();
                ChekUser.verificarUsuario(nombreusuario, rol, contraseña);
                break;

        
            default:
            System.out.println("CHAO");
                break;
        }

        System.out.println("\nPrograma finalizado");


    }

}
