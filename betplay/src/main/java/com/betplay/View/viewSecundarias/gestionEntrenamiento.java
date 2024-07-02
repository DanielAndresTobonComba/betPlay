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

        int decision = 0 ;
        int decision2 = 0;
        int codigoEquipo ;

        // Crear un entrenamiento con una actividad
        
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
            decision = CheckInt.check();
    
            switch (decision) {

                case 1:

                System.out.println("=============================");
                System.out.println("\tCrear Entrenamiento");
                System.out.println("=============================\n");

                
                System.out.print("Codigo del equipo: ");
                codigoEquipo = CheckInt.check();
                scanner.nextLine();


                // Convertir la cadena de fecha a java.util.Date
                System.out.println("Digita la fecha en este formato yyyy-MM-dd ");
                
                fechaString = "2000-08-04";
                fecha = null;

                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date utilDate = dateFormat.parse(fechaString);
                    fecha = new java.sql.Date(utilDate.getTime());
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error al insertar la fecha");
                    break;
                }

                // Convertir la cadena de hora a java.sql.Time
                System.out.println("Digita la hora en este formato hora:minutos:seg");
                horaString = scanner.nextLine();
                hora = Time.valueOf(horaString);

                System.out.println("Digita el lugar del entrenamiento");
                lugar = scanner.nextLine();

                

                do {    

                    
                    String descripcion = "";
                    int duracion = 0;

                    System.out.println("Actividades del entrenamiento");
                    System.out.println("1. Ingresar");
                    System.out.println("2. Editar"); 
                    System.out.println("3. Eliminar"); 
                    System.out.println("4. Regresar al menu");

                    decision2 = CheckInt.check();


                    switch (decision2) {
                        case 1:

                        try {

                            System.out.println("Ingresa la descripcion de la actividad");
                            descripcion = scanner.nextLine();
    
                            System.out.println("Digite la duracion en minutos");
                            duracion = scanner.nextInt();
    
                            actividad.setDescripcion(descripcion);
                            actividad.setDuracion(duracion);
    
                            entrenamiento.getListActividades().add(actividad); 
    
                            System.out.println("Actividad registrada exitosamente");
                            
                        } catch (Exception e) {
                            System.out.println("ERROR: " + e );
                        }
                        
                       
                            
                            break;
                    
                        default:
                            break;
                    }
                    
                } while (decision2 != 4);

                

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
