package com.betplay.View;

import java.util.Scanner;

import com.betplay.View.ViewRoles.GuiaRoles;
import com.betplay.View.viewSecundarias.RegistrarUsuario;
import com.betplay.View.viewSecundarias.iniciarSesion;
import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckPassword;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.ChekUser;
import com.betplay.Entity.Usuario;

public class Intro {

    public static void startIntro (){

        int decision;
        String rol;
        String nombreUsuario;
        String contraseña;
        boolean validacionUsuario;
        String nuevoNombreUsuario;
        String nuevoNombre;
        String nuevoEmail;
        String nuevaContraseña;
        boolean validacionRegistro = false;
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
        decision = CheckInt.check();
        
     
            
        //} while (decision != 3);

        switch (decision) {
            case 1:
                nuevoNombreUsuario = RegistrarUsuario.setNombreUsuario();
                    if ("".equals(nuevoNombreUsuario)) {
                        Intro.startIntro();
                    } else {
                        
                        nuevoNombre = RegistrarUsuario.setNombre();
                        nuevoEmail = RegistrarUsuario.setEmail();
                        nuevaContraseña =CheckPassword.check();
                        Usuario newUsuario = new Usuario(nuevoNombre, nuevoEmail, nuevaContraseña, "Aficionado");
                        
                        validacionRegistro = RegistrarUsuario.Registrar(nuevoNombreUsuario, newUsuario);

                        if (validacionRegistro == true) {
                            System.out.println("\n____________________________________");
                            System.out.println("\nRol:\t" + Controller.getController().controladorUsuarios.get(nuevoNombreUsuario).getRol());
                            System.out.println("User:\t" + nuevoNombreUsuario);
                            System.out.println("Nombre:\t"+ nuevoNombre);
                            System.out.println("Email:\t" + nuevoEmail);
                            System.out.println("____________________________________\n");
                            System.out.println("\n: : : : : : : : : : : :");
                            System.out.println(":  Registro exitoso  :");
                            System.out.println(": : : : : : : : : : : :");

                            Intro.startIntro();

                        } else {
                            System.out.println("\n: : : : : : : : : : : :");
                            System.out.println(":  FALLÓ al registrar!  :");
                            System.out.println(": : : : : : : : : : : :");

                            Intro.startIntro();

                        }
                        
                        
                    }
                
                
                break;

            case 2:

                rol = iniciarSesion.getRol();
                if ("".equals(rol)) {

                }
                else {
                    nombreUsuario = iniciarSesion.getNombreUsuario();
                    contraseña = iniciarSesion.getPassword();
                    validacionUsuario = ChekUser.verificarUsuario(nombreUsuario, rol, contraseña);
                    if (validacionUsuario == true) {

                        System.out.println("\n_________________________");
                        System.out.println("\n   B I E N V E N I D O  ");
                        System.out.println("_________________________\n");
                        GuiaRoles.entrarVista(rol, nombreUsuario);

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
