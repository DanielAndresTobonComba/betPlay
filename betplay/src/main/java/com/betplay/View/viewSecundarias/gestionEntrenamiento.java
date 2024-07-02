package com.betplay.View.viewSecundarias;

import java.sql.Time;
import java.text.SimpleDateFormat;

import com.betplay.Controller;
import com.betplay.Entity.Actividad;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.Entrenamiento;

import java.util.*;



public class gestionEntrenamiento {

    public static void startGestionEntrenamiento (){

        Actividad actividad =  new Actividad();
        Entrenamiento entrenamiento = new Entrenamiento();

        Scanner scanner = new Scanner(System.in);

        int decision ;

        actividad.setDescripcion("Trote intensivo perras");
        actividad.setDuracion(45);

        int idEquipo = 1;
        String lugar = "Medio campo";

        // Convertir la cadena de fecha a java.util.Date
        String fechaString = "2000-08-04";
        java.sql.Date fecha = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate = dateFormat.parse(fechaString);
            fecha = new java.sql.Date(utilDate.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Convertir la cadena de hora a java.sql.Time
        String horaString = "10:00:00"; // Puedes ajustar la hora según sea necesario
        Time hora = Time.valueOf(horaString);

        

        entrenamiento.setIdEquipo(idEquipo);
        entrenamiento.setFecha(fecha);
        entrenamiento.setHora(hora);
        entrenamiento.setLugar(lugar);

        entrenamiento.getListActividades().add(actividad);

        Controller.getController().controladorEntrenamientos.put(1, entrenamiento);

        System.out.println(entrenamiento.toString());

        


        do {
            System.out.println("\n-------------------");
            System.out.println("   E N T R E N A M I E N T O S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");

            System.out.println("1. Ingresar");
            System.out.println("2. Editar");
            System.out.println("3. Eliminar");
            System.out.println("4. Regresar al menu");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            decision = CheckInt.check(true);
    
            switch (decision) {
                case 1:
                System.out.println("=============================");
                System.out.println("\tCrear Entrenamiento");
                System.out.println("=============================\n");


                    break;
    
                case 2:
                    
                    break;
    
                case 3:
                    
                    break;
    
                case 4:
                System.out.print("Presiona entrer para volver al menu pricipal: ");
                scanner.nextLine();
                return ;
            }
        } while (decision != 4);

       

    }

}
