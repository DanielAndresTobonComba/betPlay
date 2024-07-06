package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionArbitros;
import com.betplay.View.viewSecundarias.gestionComunicadosNoticias;
import com.betplay.View.viewSecundarias.gestionEquipos;
import com.betplay.View.viewSecundarias.gestionEstadios;
import com.betplay.View.viewSecundarias.gestionInformes;
import com.betplay.View.viewSecundarias.gestionJugadores;
import com.betplay.View.viewSecundarias.gestionMedios;
import com.betplay.View.viewSecundarias.gestionPartidos;
import com.betplay.View.viewSecundarias.gestionPatrocinios;
import com.betplay.View.viewSecundarias.gestionReconocimientos;
import com.betplay.View.viewSecundarias.gestionUsuarios;


 

public class Administrador {

    public static void startAdmin(String nombreUsuario){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        System.out.println("\n------------------------------------");
        System.out.println("      A D M I N I S T R A D O R");
        System.out.println("====================================");
        System.out.println("               Menú");
        System.out.println("====================================");
        System.out.println("1. Gestión de usuarios\n");
        System.out.println("2. Gestión de equipos\n");
        System.out.println("3. Gestión de jugadores\n");
        System.out.println("4. Gestión de partidos\n");
        System.out.println("5. Gestión de árbitros\n");
        System.out.println("6. Gestión de estadios\n");
        System.out.println("7. Gestión de patrocinios de la liga\n");
        System.out.println("8. Gestión de comunicados y noticias\n");
        System.out.println("9. Gestión de informes\n");
        System.out.println("10. Gestión de medios\n");
        System.out.println("11. Premios y reconocimientos\n");
        System.out.println("0. Cerrar sesión");  
        System.out.println("------------------------------------");

        System.out.println("\n\n. . . . . . . . . .");
        System.out.println(" Digite la opción");
        System.out.println(". . . . . . . . . . ");
        System.out.print(">>> ");
        
        // Validación de la opción ingresada por el usuario
        decision = CheckInt.check();

        

        
        switch (decision) {
            case 1:

                gestionUsuarios.startGestionUsuarios();
                    
                break;

            case 2:

                gestionJugadores.startGestionJugadores(nombreUsuario);
                
                break;

            case 3:

                gestionPartidos.startGestionPartidos(nombreUsuario);
                
                break;

            case 4:

                gestionArbitros.startGestionArbitros();
                
                break;

            case 5:
                gestionEstadios.startGestionEstadios();
                
                break;

            case 6:
                gestionPatrocinios.startGestionPatrocinios();
                
                break;

            case 7:
                gestionComunicadosNoticias.startGestionComunicadosNoticias(nombreUsuario);
                
                break;

            case 8:
                gestionInformes.startGestionInformes(nombreUsuario);
                
                break;

            case 9:
                gestionMedios.startGestionMedios(nombreUsuario);
                break;

            case 10:
                gestionReconocimientos.startGestionReconocimiento(nombreUsuario);
                break;

            case 11:
                
                
                break;
        
            default:
                Intro.startIntro();
                break;
        }


    }


}


