package com.betplay.View.viewSecundarias;

import java.util.Scanner;


public class gestionComunicadosNoticias {


    public static void startGestionComunicadosNoticias () {

        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Menu Partidos");
            System.out.println("1. Crear noticia");
            System.out.println("2. Crear comunicado");
            System.out.println("3. Eliminar noticia");  
            System.out.println("4. Eliminar comunicado");
            System.out.println("5. Editar noticia");
            System.out.println("6. editar comunicado");
            System.out.println("7. Crear sancion");  
            System.out.println("8. Buscar sancion");
            System.out.println("10. Regresar al menu");
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
