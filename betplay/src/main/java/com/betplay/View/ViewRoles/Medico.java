package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.viewSecundarias.gestionLesiones;

public class Medico {

    public static void startMedico (){

         int decision ;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("\n-------------------");
            System.out.println("   M É D I C O");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");

            System.out.println("1. Gestion de lesiones.");
            System.out.println("2. Cerrar sesion");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");

            decision = CheckInt.check(true);

            switch (decision) {
                case 1:
                    gestionLesiones.startGestionLesiones();
                    break;
    
                case 2:
                    System.out.println("Sesion Cerrada");
                    System.out.print("Presiona entrer para salir: ");
                    scanner.nextLine();
                    Intro.startIntro();
                    
                    break;
    
            }
    
            
        } while (decision != 3);

                

        
    }

}
