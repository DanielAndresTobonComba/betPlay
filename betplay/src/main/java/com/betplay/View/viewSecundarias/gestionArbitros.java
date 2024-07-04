package com.betplay.View.viewSecundarias;

import java.util.Scanner;
import java.util.ResourceBundle.Control;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.Intro;
import com.betplay.View.ViewRoles.Arbitro;

public class gestionArbitros {

    public static void startGestionArbitros (){
        int decision ;

        // Falta la clase arbitro

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n---------------------");
            System.out.println("   Á R B I T R O S");
            System.out.println("=====================");
            System.out.println("        Menú");
            System.out.println("=====================");
            //System.out.println("1. Registrar\n");
            System.out.println("1. Editar\n");
            System.out.println("2. Eliminar\n");
            System.out.println("4. Volver al menú");
            System.out.println("---------------------");


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
    
                case 4:
    
                    System.out.print("Presiona entrer para volver al menu pricipal: ");
                    scanner.nextLine();
                    break ;
    
            }
    
            
        } while (decision != 4);

       
    }

}
