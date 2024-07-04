package com.betplay.View.viewSecundarias;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.View.ViewRoles.GuiaRoles;

public class gestionCalendarios {

    public static void startconsultarCalendario(String nombreUsuario){


        int decision = 0 ;

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("\n---------------------------");
            System.out.println("   C A L E N D A R I O S");
            System.out.println("===========================");
            System.out.println("            Menú");
            System.out.println("===========================");
            System.out.println("1. Ingresar rango\n");
            System.out.println("2. Filtro por equipos\n");
            System.out.println("3. Filtro por estadio\n");
            System.out.println("4. Volver al menú");
            System.out.println("---------------------------")

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
                String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                GuiaRoles.entrarVista(rol, nombreUsuario);
                return;
                
                
    
            }
            
        } while (decision != 4);

       
        
    }

}
