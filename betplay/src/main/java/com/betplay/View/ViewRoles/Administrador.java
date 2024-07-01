package com.betplay.View.ViewRoles;

import java.util.Scanner;

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


 

public class Administrador {

    public static void startAdmin(){

        int desicion ;

        Scanner scanner = new Scanner(System.in);

        do {
            
            System.out.println("1. Registro de usuarios");
            System.out.println("2. Gestion de equipos");
            System.out.println("3. Gestion de jugadores");
            System.out.println("4. Gestion de partidos");
            System.out.println("5. Gestion de arbitros");
            System.out.println("6. Gestion de estadios");
            System.out.println("7. Gestion de patrocinios de la liga");
            System.out.println("8. Gestion de comunicados y noticias");
            System.out.println("9. Gestion de informes.");
            System.out.println("10. Gestion de medios");
            System.out.println("11.Gestion de premios y reconocimientos");
            System.out.println("12. Regresar al menu principal");   
            
            System.out.print("Opcion: ");
            desicion = scanner.nextInt();

        } while (desicion != 11);

        
        switch (desicion) {
            case 1:

                gestionEquipos.startGestioEquipos(); 
                    
                break;

            case 2:

                gestionJugadores.startGestionJugadores();
                
                break;

            case 3:

                gestionPartidos.startGestionPartidos();
                
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
                gestionComunicadosNoticias.startGestionComunicadosNoticias();
                
                break;

            case 8:
                gestionInformes.startGestionInformes();
                
                break;

            case 9:
                gestionMedios.startGestionMedios();
                break;

            case 10:
                gestionReconocimientos.startGestionReconocimiento();
                break;

            case 11:
                Intro.startIntro();
                
                break;
        
            default:
            System.out.println("Opcion invalida");
                break;
        }

    }


}


