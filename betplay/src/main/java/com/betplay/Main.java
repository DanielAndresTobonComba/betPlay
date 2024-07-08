package com.betplay;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import com.betplay.Entity.Usuario;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionEntrenamiento;
import com.betplay.View.viewSecundarias.gestionEquipos;
import com.betplay.View.viewSecundarias.gestionComunicadosNoticias;




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

        /*for (Map.Entry hash : Controller.getController().controladorUsuarios.entrySet()) {
           Object key = hash.getKey();
           System.out.println(key);
        }*/
        //Enumeration enu = Controller.getController().controladorUsuarios.;
        
        /*while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }*/
        

        Intro.startIntro();

        /*Set <String> setKey = Controller.getController().controladorUsuarios.keySet();

        for (String key : setKey){
            System.out.println(key);
        }*/
        


    }
}