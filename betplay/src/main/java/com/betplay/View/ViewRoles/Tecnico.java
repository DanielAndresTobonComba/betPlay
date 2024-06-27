package com.betplay.View.ViewRoles;

import java.util.Scanner;

public class Tecnico {

    public static void startTecnico (){

        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("\n\tMENU\n");
            System.out.println("1.Gestion del equipo");
            System.out.println("2. Gestion de jugadores");
            System.out.println("3. Gestion de partidos");
            System.out.println("4. Gestion de entrenadores");
            System.out.println("5. Gestion de estadisticas");
            System.out.println("6. Gestion de informes");
            System.out.println("7. Gestion de entrenamientos");
            System.out.println("8. Gestion de Rendimiento");
            System.out.println("9. Gestio de convocatorias");

            System.out.println("10.Cerrar sesion");

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
        
            default:
            System.out.println("Opcion invalida");
                break;
        }

        System.out.println("\nPrograma finalizado");

    }

}
