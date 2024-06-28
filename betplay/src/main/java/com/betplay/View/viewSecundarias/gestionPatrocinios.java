package com.betplay.View.viewSecundarias;

import java.util.Scanner;

public class gestionPatrocinios {

    public static void startGestionPatrocinios (){
        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Menu patrocinios");
            System.out.println("1. Crear ");
            System.out.println("2. Editar");
            System.out.println("3. Eliminar");
            System.out.println("4. Agregar patrocinios a equipo");
            System.out.println("5. Agregar patrocinios a la liga");
            System.out.println("6. Editar patrocinios a equipo");
            System.out.println("7. Editar patrocinios a la liga");
            System.out.println("8. Eliminar patrocinios a equipo");
            System.out.println("9. Eliminar patrocinios a la liga");
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
