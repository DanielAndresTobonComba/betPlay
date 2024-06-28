package com.betplay.View.viewSecundarias;

import java.util.Scanner;


public class gestionReconocimientos {

    public static void startGestionReconocimiento(){
        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Menu premios y reconocimiento");
            System.out.println("1. Agregar reconocimiento a equipos");
            System.out.println("2. Agregar reconocimiento a jugadores");
            System.out.println("3. Editar reconocimiento a equipo");
            System.out.println("4. Editar reconocimiento a jugadores");
            System.out.println("5. Eliminar reconocimiento a equipo");
            System.out.println("6. Eliminar reconocimiento a jugadores");
            

            System.out.print("Opcion: ");
            decision = scanner.nextInt();
            scanner.nextLine();
    
            
        } while (decision != 3);

        switch (decision) {
            case 1:
                
                break;

            case 2:
                
                break;

            case 3:
                
                break;

            case 4:
                
                break;

        }
    }

}
