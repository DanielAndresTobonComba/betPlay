package com.betplay.View.viewSecundarias;

import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.Usuario;
import com.betplay.View.Intro;
import com.betplay.View.ViewRoles.Administrador;
import com.betplay.Controller;

public class RegistrarUsuario {

    private RegistrarUsuario() {}

    public static String setNombreUsuario() {
        String newNombreUsuario = "";

        System.out.println("\n. . . . . . . . . . . . . . . .");
        System.out.println(" Registre su nombre de usuario");
        System.out.println(". . . . . . . . . . . . . . . .");
        System.out.print(">>> ");
        newNombreUsuario = CheckString.check("Registre su nombre de usuario");

        if (Controller.getController().controladorUsuarios.containsKey(newNombreUsuario)) {
            System.out.println("\n: : : : : : : : : : : : : :");
            System.out.println(":  Este usuario ya existe  :");
            System.out.println(": : : : : : : : : : : : : :");
            newNombreUsuario = "";
        }
        else {
            
        }
        return newNombreUsuario;
        
    }

    public static String setNombre() {
        System.out.println("\n. . . . . . . . . . . . . . . .");
        System.out.println(" Registre su nombre");
        System.out.println(". . . . . . . . . . . . . . . .");
        System.out.print(">>> ");
        String nombre = CheckString.check("Ingrese el nombre nuevamente");
        return nombre;
    }

    public static String setEmail() {
        System.out.println("\n. . . . . . . . . . . . . . . .");
        System.out.println(" Registre su email");
        System.out.println(". . . . . . . . . . . . . . . .");
        System.out.print(">>> ");
        String email = CheckString.check("Ingrese el email nuevamente");
        return email;
    }

    /*public static String setPassword() {
        System.out.println("\n. . . . . . . . . . . . . . . .");
        System.out.println(" Registre su contraseña");
        System.out.println(". . . . . . . . . . . . . . . .");
        System.out.print(">>> ");
        String password = CheckString.check("Ingrese la contraseña nuevamente");
        return password;
    }*/

    public static String setRol(){
        int opcion = 0;
        String rol = "";

        System.out.println("\n-------------------");
        System.out.println("     R O L E S");
        System.out.println("===================");
        System.out.println("       Menú");
        System.out.println("===================");
        System.out.println("1. Árbiro\n");
        System.out.println("2. Médico\n");
        System.out.println("3. Periodista\n");
        System.out.println("4. Técnico\n");
        System.out.println("5. Volver");
        System.out.println("-------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");

        opcion = CheckInt.check();

        switch (opcion) {
            case 1:
                rol = Controller.getController().roles.get(2);
                break;

            case 2:
                rol = Controller.getController().roles.get(3);
                break;

            case 3:
                rol = Controller.getController().roles.get(4);
                break;

            case 4:
                rol = Controller.getController().roles.get(5);
                break;

            default:
                Administrador.startAdmin();
                break;
        }
        System.out.println(rol);
        return rol;

    }

    public static boolean Registrar(String nombreUsuario, Usuario nuevoUsuario) {
        boolean verificacionRegistro = false;
        Controller.getController().controladorUsuarios.put(nombreUsuario, nuevoUsuario);
        if (Controller.getController().controladorUsuarios.containsKey(nombreUsuario)) {
            
            verificacionRegistro = true;
        } else {
            
        }

        return verificacionRegistro;
        
    }

    
}
