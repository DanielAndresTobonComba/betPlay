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

    public static void startAdmin(){

        int decision = 0 ;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("   A D M I N I S T R A D O R");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
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
            System.out.println("11. Gestion de premios y reconocimientos");
            System.out.println("12. Regresar al menu principal");   
            
            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            
            
            decision = CheckInt.check(true);

            switch (decision) {

                case 1:
                    gestionUsuarios.startGestionUsuarios();
                    break;
    
                case 2:
    
                    gestionEquipos.startGestioEquipos(); 
                        
                    break;
    
                case 3:
    
                    gestionJugadores.startGestionJugadores();
                    
                    break;
    
                case 4:
    
                    gestionPartidos.startGestionPartidos();
                    
                    break;
    
                case 5:
    
                    gestionArbitros.startGestionArbitros();
                    
                    break;
    
                case 6:
                    gestionEstadios.startGestionEstadios();
                    
                    break;
    
                case 7:
                    gestionPatrocinios.startGestionPatrocinios();
                    
                    break;
    
                case 8:
                    gestionComunicadosNoticias.startGestionComunicadosNoticias();
                    
                    break;
    
                case 9:
                    gestionInformes.startGestionInformes();
                    
                    break;
    
                case 10:
                    gestionMedios.startGestionMedios();
                    break;
    
                case 11:
                    gestionReconocimientos.startGestionReconocimiento();
                    break;
                
                    
                case 12:
                    System.out.println("Sesion Cerrada");
                    System.out.print("Presiona entrer para salir: ");
                    scanner.nextLine();
                    Intro.startIntro();
                    
                break;
    
    
                default:
                System.out.println("Opcion invalida");
                    break;
            }

        } while (decision != 12);

        
        

    }


}


