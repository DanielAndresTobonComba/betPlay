package com.betplay;

import java.util.ArrayList;
import java.util.List;

import com.betplay.Entity.Usuario;
import com.betplay.View.Intro;




public class Main {
    public static void main(    String[] args) {


        //Registro del Admin
        String usuarioAdmin = "admin123";
        String nombreAdmin = "Administrador";
        String email = "admin@gmail.com";
        String contra = "admin123";
        String rol = Controller.getController().roles.get(0);
        Usuario admin = new Usuario(nombreAdmin, email, contra, rol);
        Controller.getController().controladorUsuarios.put(usuarioAdmin, admin);

        // Iniciazalización del sistema
        Intro.startIntro();



    }
}