package com.betplay.View;

import java.util.Scanner;

import com.betplay.View.ViewRoles.GuiaRoles;
import com.betplay.View.viewSecundarias.iniciarSesion;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.ChekUser;

public class Intro {

    public static void startIntro (){

        int decision;
        boolean introPermise = true;
        String rol;
        String nombreusuario;
        String contraseña;
        boolean validacionUsuario;
        String nuevoUsuario;
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
                System.out.println();
                
                
                break;

            case 2:

                rol = iniciarSesion.getRol();
                if ("".equals(rol)) {

                }
                else {
                    nombreusuario = iniciarSesion.getNombreUsuario();
                    contraseña = iniciarSesion.getPassword();
                    validacionUsuario = ChekUser.verificarUsuario(nombreusuario, rol, contraseña);
                    if (validacionUsuario == true) {

                        System.out.println("\n_________________________");
                        System.out.println("\n   B I E N V E N I D O  ");
                        System.out.println("_________________________\n");
                        GuiaRoles.entrarVista(rol);

                    } else {
                        System.out.println("\n: : : : : : : : : : : :");
                        System.out.println(":  Usuario Incorrecto  :");
                        System.out.println(": : : : : : : : : : : :");
                        Intro.startIntro();
                    }
                }
                
                break;
        
            default:
            System.out.println("CHAO");
            scanner.close();
                break;
        }

        


    }

}
