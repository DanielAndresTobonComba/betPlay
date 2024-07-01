package com.betplay.View.viewSecundarias;
import java.util.Scanner;

import com.betplay.Entity.CheckInt;

public class gestionPartidos {

    public static void startGestionPartidos (){

        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("   P A R T I D O S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Programar");
            System.out.println("2. Modificar");
            System.out.println("3. Eliminar");
            // System.out.println("4. Registrar resultados"); // Revizar que datos va a tener como goles tarjetas etc.
            System.out.println("4. Regresar al menu");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");

            decision = CheckInt.check(true);
            
            switch (decision) {
                case 1:
                    
                    break;
    
                case 2:
                    
                    break;
    
                case 3:
                    
                    break;
    
                case 4:
                System.out.print("Presiona entrer para volver al menu pricipal: ");
                scanner.nextLine();
                return;
    
            }
            
        } while (decision != 4);

        
        
    }

}
