package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckPassword;
import com.betplay.Entity.Usuario;
import com.betplay.View.ViewRoles.Administrador;

public class gestionUsuarios {

    public static void startGestionUsuarios (){

        int decision ;
        boolean verificacion;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n-----------------------");
        System.out.println("   GESTIONAR USUARIOS");
        System.out.println("=======================");
        System.out.println("         Menú");
        System.out.println("=======================");
        System.out.println("1. Registrar usuario\n");
        System.out.println("2. Modificar usuario\n");
        System.out.println("3. Eliminar usuario\n");
        System.out.println("3. Gestionar Permisos\n");
        System.out.println("4. Volver");
        System.out.println("------------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");
        
        // Validación de la opción ingresada por el usuario
        decision = CheckInt.check();



        switch (decision) {
            case 1:
                String nombreUsuario = RegistrarUsuario.setNombreUsuario();
                if ("".equals(nombreUsuario)) {
                    startGestionUsuarios();
                } else {
                    Usuario nuevoUsuario = new Usuario();
                    String rol = RegistrarUsuario.setRol();
                    String nombre = RegistrarUsuario.setNombre();
                    String email = RegistrarUsuario.setEmail();
                    String password = CheckPassword.check();
                    nuevoUsuario.setRol(rol);
                    nuevoUsuario.setNombre(nombre);
                    nuevoUsuario.setEmail(email);
                    nuevoUsuario.setContraseña(password);
                    //System.out.println(Controller.getController().controladorUsuarios.get(nombreUsuario).permisosDenegados.size());
                    verificacion = RegistrarUsuario.Registrar(nombreUsuario, nuevoUsuario);
                    System.out.println(verificacion);

                    if (verificacion = true) {
                        GestionPermisos.denegarPermisos(nombreUsuario);
                        System.out.println("\n____________________________________");
                        System.out.println("\nRol:\t" + Controller.getController().controladorUsuarios.get(nombreUsuario).getRol());
                        System.out.println("User:\t" + nombreUsuario);
                        System.out.println("Nombre:\t"+ nombre);
                        System.out.println("Email:\t" + email);
                        System.out.println("____________________________________\n");
                        System.out.println("\n: : : : : : : : : : : :");
                        System.out.println(":  Registro exitoso  :");
                        System.out.println(": : : : : : : : : : : :");

                        startGestionUsuarios();

                    } else {
                        System.out.println("\n: : : : : : : : : : : :");
                        System.out.println(":  FALLÓ al registrar!  :");
                        System.out.println(": : : : : : : : : : : :");
                        startGestionUsuarios();
                    }



                }
                
                
                break;

                case 2:
                    
                    break;
                
                case 3:
                    
                    break;


            default:
                Administrador.startAdmin();
                break;

        }
    }

}
