package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;


public class gestionComunicadosNoticias {


    public static void startGestionComunicadosNoticias () {

        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("   C O M U N I C A C I Ó N");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("Menu Partidos");
            System.out.println("1. Crear noticia");
            System.out.println("2. Crear comunicado");
            System.out.println("3. Eliminar noticia");  
            System.out.println("4. Eliminar comunicado");
            System.out.println("5. Editar noticia");
            System.out.println("6. editar comunicado");
            System.out.println("7. Crear sancion");  
            System.out.println("8. Buscar sancion");
            System.out.println("9. Regresar al menu");

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
                    
                    break;
    
                case 8:
                    
                    break;
    
                case 9:
    
                System.out.print("Presiona entrer para volver al menu pricipal: ");
                scanner.nextLine();
                return ;
    
                
              
    
            }
    
            
        } while (decision != 9);

        

        
    }

}
