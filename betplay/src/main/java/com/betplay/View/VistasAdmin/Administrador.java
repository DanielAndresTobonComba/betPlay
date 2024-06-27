package com.betplay.View.VistasAdmin;

import java.util.Scanner;

public class Administrador {

    public static void star(){

        int desicion ;

        Scanner scanner = new Scanner(System.in);

        do {
            
            System.out.println("1. Registro de usuarios");
            System.out.println("2. Gestion de Equipos");
            System.out.println("3. Gestion de jugadores");
            System.out.println("4. Gestion de partidos");
            System.out.println("5. Gestion de arbitros");
            System.out.println("6. Gestion de estadios");
            System.out.println("7. Gestion de patrocinios");
            System.out.println("8. Getion de sanciones");
            System.out.println("9. Gestion de comunicados y noticias");
            System.out.println("10. Regresar al menu principal");
            
            System.out.print("Opcion: ");
            desicion = scanner.nextInt();

        } while (desicion != 10);
    }


}
