package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;

public class gestionLesiones {


    public static void startGestionLesiones (){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("\n-------------------");
            System.out.println("   L E S I O N E S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Ingresar");
            System.out.println("2. Editar");
            System.out.println("3. Eliminar");
            System.out.println("4. Regresar al menu");

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
                System.out.print("Presiona entrer para volver al menu pricipal: ");
                scanner.nextLine();
                return;
    
            }

        } while (decision != 4);

       
    }


}
