package com.betplay.View.viewSecundarias;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.Equipo;

public class RegistraEquipo {

    public static void Registrar(String nombreUsuario) {

        System.out.println("\n================================");
        System.out.println("        REGISTRAR EQUIPO");
        System.out.println("================================\n");

        System.out.println("\n--> Codigo del equipo: ");
        System.out.println(". . . . . . . . . . . .");
        System.out.print(">>> ");
        int codigoEquipo = CheckInt.check();

        
        if(Controller.getController().controladorEquipos.containsKey(codigoEquipo)){
            System.out.println("\n******************************");
            System.out.println("El código del equipo ya existe");
            System.out.println("******************************\n");
            gestionEquipos.startGestioEquipos(nombreUsuario);
            //scanner.nextLine();

            //return;

        } else {
            System.out.println("\n\n--> Nombre del equipo: ");
            System.out.println(". . . . . . . . . . . .");
            System.out.print(">>> ");
            String nombreEquipo = CheckString.check("Digita de nuevo el nombre");
                        

            System.out.println("\n\n--> Nombre del estadio: ");
            System.out.println(". . . . . . . . . . . .");
            System.out.print(">>> ");
            String nombreEstadio = CheckString.check("Digita de nuevo el estadio");

            System.out.println("\n\n--> Nombre de la ciudad: ");
            System.out.println(". . . . . . . . . . . .");
            System.out.print(">>> ");
            String ciudad = CheckString.check("Digita de nuevo la ciudad");

            System.out.println("\n\n--> Nombre del entrenador: ");
            System.out.println(". . . . . . . . . . . .");
            System.out.print(">>> ");
            String nombreEntrenador = CheckString.check("Digita de nuevo el entrenador");
            Equipo equipo = new Equipo();
            equipo.setNombre(nombreEquipo);
            equipo.setNombreEstadio(nombreEstadio);
            equipo.setNombreEntrenador(nombreEntrenador);
            equipo.setCiudad(ciudad);

            Controller.getController().controladorEquipos.put(codigoEquipo, equipo);

            if (Controller.getController().controladorEquipos.containsKey(codigoEquipo)) {

                System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: ::");
                System.out.println("::  Equipo registrado exitosamente! ::");
                System.out.println(":: :: :: :: :: :: :: :: :: :: :: :: ::");
                gestionEquipos.startGestioEquipos(nombreUsuario);

            } else {

                System.out.println("\n*******************************");
                System.out.println("*      Falló al registrar     *");
                System.out.println("*******************************");
                gestionEquipos.startGestioEquipos(nombreUsuario);

            }
            //scanner.nextLine();

        }
        

    }

}
