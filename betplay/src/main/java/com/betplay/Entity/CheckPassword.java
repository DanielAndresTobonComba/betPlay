package com.betplay.Entity;

import java.io.Console;

public class CheckPassword {

    private CheckPassword() {}

    public static String check() {
        String pwdString = "";
        Console newConsole = System.console();
        boolean verificacion = true;
        while (verificacion == true) {
            char [] pwd = newConsole.readPassword("\n. . . . . . . . . . . . . . . .\nEscriba su contraseña\n. . . . . . . . . . . . . . . .\n>>> ");
            for (char letter : pwd) {
                pwdString += letter;
            }

            if ("".equals(pwdString.trim())) {
                System.out.println("\n********************************");
                System.out.println("No se permiten entradas vacías ");
                System.out.println("********************************");
            } else  {
                verificacion = false;
            }
        }
        
        return pwdString;
    }
}
