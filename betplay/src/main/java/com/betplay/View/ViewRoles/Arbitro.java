package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.View.viewSecundarias.gestionComunicadosNoticias;
import com.betplay.View.viewSecundarias.gestionPartidos;
import com.betplay.View.viewSecundarias.gestionResultados;

public class Arbitro {

    
    public static void startArbitro(){


        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("1. Gestion de resultados");
            System.out.println("2. Gestion de incidentes y sanciones");
            System.out.println("3. Cerrar sesion");

            System.out.print("Opcion: ");
            decision = scanner.nextInt();
            scanner.nextLine();
    
            
        } while (decision != 3);


        switch (decision) {
            case 1:
                gestionResultados.startGestionResultados();
                break;

            case 2:
                gestionComunicadosNoticias.startGestionComunicadosNoticias();
                break;

            case 3:
                
                break;

        }


    }

}
