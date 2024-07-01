package com.betplay;

import com.betplay.Entity.Usuario;
import com.betplay.View.Intro;
import com.betplay.View.ViewRoles.Administrador;



public class Main {
    public static void main(String[] args) {

        // System.out.println(Controller.getController().controladorActividades);
        
        // Intro menu = new Intro();
        // menu.startIntro();

        //Registro del Admin
        String usuarioAdmin = "admin123";
        String nombreAdmin = "Administrador";
        String email = "admin@gmail.com";
        String contra = "admin123";
        String rol = Controller.getController().roles.get(0);
        Usuario admin = new Usuario(nombreAdmin, email, contra, rol);
        Controller.getController().controladorUsuarios.put(usuarioAdmin, admin);

        System.out.println(Controller.getController().controladorUsuarios.get("admin123").getRol());
        System.out.println(Controller.getController().controladorUsuarios.get("admin123").getContraseña());




        Intro.startIntro();



    }
}