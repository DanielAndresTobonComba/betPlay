package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.View.Intro;

public class iniciarSesion {
    

    private iniciarSesion() {

    }

    public static String getRol () {
        int opcion = 0;
        String rol = "";
        boolean introPermise = true;

        System.out.println("\n-------------------");
        System.out.println("     R O L E S");
        System.out.println("===================");
        System.out.println("       Menú");
        System.out.println("===================");
        System.out.println("1. Administrador\n");
        System.out.println("2. Aficionado\n");
        System.out.println("3. Árbiro\n");
        System.out.println("4. Médico\n");
        System.out.println("5. Periodista\n");
        System.out.println("6. Técnico\n");
        System.out.println("7. Volver");
        System.out.println("-------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");

        opcion = CheckInt.check(introPermise);

        switch (opcion) {
            case 1:
                rol = Controller.getController().roles.get(0);
                break;

            case 2:
                rol = Controller.getController().roles.get(1);
                break;

            case 3:
                rol = Controller.getController().roles.get(2);
                break;

            case 4:
                rol = Controller.getController().roles.get(3);
                break;

            case 5:
                rol = Controller.getController().roles.get(4);
                break;

            
        
            default:
                Intro.startIntro();
                break;
        }
        System.out.println(rol);
        return rol;
    }

    public static String getNombreUsuario() {
        String nombreUsuario = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n. . . . . . . . . . . . . . . .");
        System.out.println(" Ingrese su nombre de usuario");
        System.out.println(". . . . . . . . . . . . . . . .");
        System.out.print(">>> ");
        nombreUsuario = CheckString.check("Ingrese su nombre de usuario");
        return nombreUsuario;
    }

    public static String getPassword() {
        String password = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n. . . . . . . . . . . . .");
                System.out.println(" Ingrese su  contraseña");
                System.out.println(". . . . . . . . . . . . . ");
                System.out.print(">>> ");
                password = CheckString.check("Ingrese su  contraseña");
        return password;
    }



}
