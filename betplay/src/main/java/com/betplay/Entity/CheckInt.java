package com.betplay.Entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckInt {
    boolean introPermise = true;
    
    private CheckInt() {}
    
    public static int check(boolean introPermise) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (introPermise == true) {
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
                introPermise = false;
            } catch(InputMismatchException e) {
                System.out.println("\n********************************");
                System.out.println("Debe ingresar un número entero: ");
                System.out.println("********************************\n");
                System.out.println("\n. . . . . . . . . .");
                System.out.println(" Digite la opción");
                System.out.println(". . . . . . . . . . ");
                System.out.print(">>> ");
                scanner.next();
            }
        }
        return opcion;

    }

}
