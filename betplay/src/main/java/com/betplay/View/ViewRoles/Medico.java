package com.betplay.View.ViewRoles;

import java.util.Scanner;

import com.betplay.View.viewSecundarias.gestionLesiones;

public class Medico {

    public static void startMedico (){

         int decision ;

        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("1. Gestion de lesiones.");
            System.out.println("2. Cerrar sesion");

            System.out.print("Opcion: ");
            decision = scanner.nextInt();
            scanner.nextLine();
    
            
        } while (decision != 3);

                
        switch (decision) {
            case 1:
                gestionLesiones.startGestionLesiones();
                break;

            case 2:
                
                break;

        }
        
    }

}
