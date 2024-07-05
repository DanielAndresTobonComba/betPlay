package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Entity.CheckInt;

public class gestionPatrocinios {

    public static void startGestionPatrocinios (){
        int decision ;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n-------------------");
            System.out.println("   P A T R O C I N I O S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
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
                    
                    break;
    
                case 10:
                System.out.print("Presiona entrer para volver al menu pricipal: ");
                scanner.nextLine();
                return;
            }
            
        } while (decision != 10);

        
    }

}
