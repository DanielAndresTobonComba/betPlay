package com.betplay.View.viewSecundarias;

import java.util.Scanner;

public class gestionRendimiento {


    public static void startGestionRendimiento (){

        int decision ;

        Scanner scanner = new Scanner(System.in);


        do {


            System.out.println("1. Ingresar");
            System.out.println("2. Consultar");
            System.out.println("3. Regresar al menu");

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
