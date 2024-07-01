package com.betplay.Entity;

import com.betplay.Controller;
import com.betplay.View.Intro;

public class ChekUser {

    private ChekUser() {}

    public static boolean verificarUsuario(String usuario, String rol, String password) {

        boolean validacion = false;
        boolean containsKey = Controller.getController().controladorUsuarios.containsKey(usuario);


        if (containsKey == true &&  Controller.getController().controladorUsuarios.get(usuario).getRol().equals(rol) && Controller.getController().controladorUsuarios.get(usuario).getContraseña().equals(password)) {

            validacion = true;
        }
        else {
            
        }

        return validacion;
        

    }

}
