package com.betplay.View.viewSecundarias;

import com.betplay.Entity.CheckString;

public class RegistrarUsuario {

    private RegistrarUsuario() {}

    public static String setNombreUsuario() {
        String newNombreusuario = "";

        System.out.println("\n. . . . . . . . . . . . . . . .");
        System.out.println(" Registre su nombre de usuario");
        System.out.println(". . . . . . . . . . . . . . . .");
        System.out.print(">>> ");
        newNombreusuario = CheckString.check("Registre su nombre de usuario");

        if (Controller.getController().controladorUsuarios.containsKey(newNombreusuario)) {

        }
        return newNombreusuario;
        
    }
}
