package com.betplay.Entity;

import com.betplay.Controller;

public class ChekUser {

    private ChekUser() {}

    public static void verificarUsuario(String usuario, String rol, String password) {

        boolean validacion;
        boolean containsKey = Controller.getController().controladorUsuarios.containsKey(usuario);


        if (containsKey == true &&  Controller.getController().controladorUsuarios.get(usuario).getRol().equals(rol) && Controller.getController().controladorUsuarios.get(usuario).getContraseña().equals(password)) {
            System.out.println("El usuario es válido");
        }
        else {
            System.out.println("Pailas");
        }

        

    }

}
