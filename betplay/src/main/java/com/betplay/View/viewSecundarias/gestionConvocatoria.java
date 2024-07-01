package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;

public class gestionConvocatoria {


    public static void startGestionConvocatoria (){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {

            // aqui el la convocatoria deberia haber una lista de los comvocados?
            System.out.println("\n-------------------");
            System.out.println("   C O N V O C A T O R I A S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Crear ");
            System.out.println("2. Editar");
            System.out.println("3. Eliminar");
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
                    return ;
    
            }
            
        } while (decision != 4);

        

        
    }
}
