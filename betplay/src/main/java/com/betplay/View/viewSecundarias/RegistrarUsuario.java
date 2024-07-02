package com.betplay.View.viewSecundarias;

import com.betplay.Entity.CheckString;
import com.betplay.Entity.Usuario;
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
