package com.betplay.view.ViewRoles;

import java.util.Scanner;

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
                
                break;

            case 2:
                
                break;

            case 3:
                
                break;

            case 4:
                
                break;

            case 5:
                
                break;

            case 6:
                
                break;

            case 7:
                
                break;

            case 8:
                
                break;

            case 9:
                
                break;

            case 10:
                
                break;

            case 11:
                
                break;
        
            default:
            System.out.println("Opcion invalida");
                break;
        }

    }


}


