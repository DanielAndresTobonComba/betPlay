package com.betplay.View.viewSecundarias;

import java.sql.Time;
import java.text.SimpleDateFormat;

import com.betplay.Controller;
import com.betplay.Entity.Actividad;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.Entrenamiento;
import com.betplay.Entity.Equipo;

import java.util.*;



public class gestionEntrenamiento {

    public static void startGestionEntrenamiento (){
        String nombreEntrenador = "Daniel";
        Actividad actividad =  new Actividad();
        Entrenamiento entrenamiento = new Entrenamiento();
        Equipo equipo = new Equipo();

        Scanner scanner = new Scanner(System.in);

        int decision = 0 ;
        int decision2 = 0;
        int codigoEquipo = 0 ;

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


                // Convertir la cadena de fecha a java.util.Date
                System.out.println("\nDigita la fecha en este formato yyyy-MM-dd ");
                fechaString = CheckString.check("Ingrese la fecha de nuevo") ;
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
                System.out.println("\nDigita la hora en este formato hora:min:seg");
                horaString = CheckString.check("Ingrese la hora de nuevo");
                hora = Time.valueOf(horaString);

                System.out.println("\nDigita el lugar del entrenamiento");
                lugar = CheckString.check("Ingrese el lugar de nuevo");


                System.out.println("\nDigita el codigo del equipo: ");
                idEquipo = CheckInt.check();
                scanner.nextLine();

                equipo = Controller.getController().controladorEquipos.get(idEquipo); 


                if (equipo != null && equipo.getNombreEntrenador().equals(nombreEntrenador) ){

                    entrenamiento.setIdEquipo(idEquipo);
                    entrenamiento.setFecha(fecha);
                    entrenamiento.setHora(hora);
                    entrenamiento.setLugar(lugar);

                    Controller.getController().controladorEntrenamientos.put(codigoEquipo, entrenamiento);
                }else {
                    System.out.println("El codigo del equipo no existe o no puedes actualizar datos de este equipo");
                }

                do {    

                    
                    String descripcion = "";
                    int duracion = 0;

                    System.out.println("Actividades del entrenamiento");
                    System.out.println("1. Ingresar");
                    System.out.println("2. Regresar al menu");

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

                        case 2: 
                            
                            break;
                    
                        default:
                        System.out.println("Opcion invalida");
                            break;
                    }
                    
                } while (decision2 != 4);

                

                    break;
    
                case 2:

                    int desicion2 = 0 ;

                            do {

                                System.out.println("\n-------------------");
                                System.out.println("   E D I T A R ");
                                System.out.println("===================");
                                System.out.println("       Menú");
                                System.out.println("===================");

                                System.out.println("1. Fecha");
                                System.out.println("2. Lugar");
                                System.out.println("3. Hora");
                                System.out.println("4. Regresar");
                    
                                System.out.println("\n\n. . . . . . . . . .");
                                System.out.println(" Digite la opción");
                                System.out.println(". . . . . . . . . . ");
                                System.out.print(">>> ");
                                decision2 = CheckInt.check();

                                switch (decision2) {
                                    case 1:

                                    System.out.println("\nDigita la fecha en este formato yyyy-MM-dd ");
                                    fechaString = CheckString.check("Ingrese la fecha de nuevo") ;
                                    fecha = null;
                    
                                    try {
                                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                        java.util.Date utilDate = dateFormat.parse(fechaString);
                                        fecha = new java.sql.Date(utilDate.getTime());
                                        entrenamiento.setFecha(fecha);
                                        System.out.println("Fecha actualizada");
                                        scanner.nextLine();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        System.out.println("Error al insertar la fecha");
                                        break;
                                    }
                                        break;
                                    case 2:

                                        System.out.println("Digite el lugar: ");
                                        lugar = CheckString.check("Digita de nuevo el lugar"); 
                                        entrenamiento.setLugar(lugar);
                                        System.out.println("Lugar actualizado");
                                        scanner.nextLine();
                                        
                                        break;

                                    case 3:
                                        System.out.println("\nDigita la hora en este formato hora:min:seg");
                                        horaString = CheckString.check("Ingrese la hora de nuevo");
                                        hora = Time.valueOf(horaString);
                                        entrenamiento.setHora(hora);
                                        System.out.println("Hora actualizada");
                                        scanner.nextLine();

                                        break;

                                    default:
                                        System.out.println("Digite invalido");
                                        scanner.nextLine();
                                        break;
                                }
                                
                            } while (desicion2 != 4);
                    
                    break;
    
                case 3:

                System.out.println("\n-------------------");
                System.out.println("   E L I M I N A R ");
                System.out.println("\n-------------------");

                System.out.println("Digita el id del entrenamiento");
                int idEntrenamiento = CheckInt.check();

                entrenamiento = Controller.getController().controladorEntrenamientos.get(idEntrenamiento);
                

                if (entrenamiento != null && equipo.getNombreEntrenador().equals(nombreEntrenador)){

                    entrenamiento = Controller.getController().controladorEntrenamientos.remove(idEntrenamiento);

                    if (entrenamiento != null){

                        System.out.println("Entrenamiento eliminado correctamente");
                        scanner.nextLine();


                    }else {
                        System.out.println("Error al eliminar entrenamiento");
                        
                    }

                } else {

                    System.out.println("Error al buscar el equipo");
                    scanner.nextLine();
                }   

                
                    break;
    
                case 4:
                System.out.print("Presiona entrer para volver al menu pricipal: ");
                scanner.nextLine();
                return ;
            }
        } while (decision != 4);

       

    }

}
