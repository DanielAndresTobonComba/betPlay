package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;


public class gestionReconocimientos {

    public static void startGestionReconocimiento(){
        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("   R E C O N O C I M I E N T O ");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("Menu premios y reconocimiento");
            System.out.println("1. Agregar reconocimiento a equipos");
            System.out.println("2. Agregar reconocimiento a jugadores");
            System.out.println("3. Editar reconocimiento a equipo");
            System.out.println("4. Editar reconocimiento a jugadores");
            System.out.println("5. Eliminar reconocimiento a equipo");
            System.out.println("6. Eliminar reconocimiento a jugadores");
            System.out.println("7. Regresar al menu");
            

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            
            decision = CheckInt.check();
    
            
            switch (decision) {
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
                    System.out.print("Presiona entrer para volver al menu pricipal: ");
                    scanner.nextLine();
                    return;
                    
    
            }

        } while (decision != 7);

       
    }

}
