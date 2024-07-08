package com.betplay.View.viewSecundarias;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.Actividad;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.Entrenamiento;
import com.betplay.Entity.Equipo;
import com.betplay.View.ViewRoles.GuiaRoles;

import java.util.*;



public class gestionEntrenamiento {

    public static void startGestionEntrenamiento (String nombreUsuario){

        Actividad actividad = new Actividad();
        Entrenamiento entrenamiento = new Entrenamiento();
        Equipo equipo = new Equipo();

        int idEntrenamiento;

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Bucaros");
        equipo2.setCiudad("Bucaramanga");
        equipo2.setNombreEntrenador("Daniel");

        Controller.getController().controladorEquipos.put(1, equipo2);

        Scanner scanner = new Scanner(System.in);

        int decision;
        int codigoEquipo;
        int idActividad;

        actividad.setDescripcion("Trote intensivo perras");
        actividad.setDuracion(25);

        int idEquipo = 1;
        String lugar = "Medio campo";

        String fechaString = "2000-08-04";
        java.sql.Date fecha = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date utilDate = dateFormat.parse(fechaString);
            fecha = new java.sql.Date(utilDate.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }

        String horaString = "10:00:00";
        Time hora = Time.valueOf(horaString);

        entrenamiento.setIdEquipo(idEquipo);
        entrenamiento.setFecha(fecha);
        entrenamiento.setHora(hora);
        entrenamiento.setLugar(lugar);
        entrenamiento.getLstActividades().put(1, actividad);

        equipo = Controller.getController().controladorEquipos.get(1);
        equipo.getLstEntrenamientos().put(1, entrenamiento);

        System.out.println(entrenamiento.toString());

        do {
            System.out.println("\n-------------------");
            System.out.println("   E N T R E N A M I E N T O S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("\n1. Crear");
            System.out.println("\n2. Editar");
            System.out.println("\n3. Eliminar");
            System.out.println("\n4. Regresar al menu");
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

                    System.out.println("\nDigita el codigo del equipo: ");
                    idEquipo = CheckInt.check();
                    equipo = Controller.getController().controladorEquipos.get(idEquipo);



                    if (equipo != null && equipo.getNombreEntrenador().equals(nombreUsuario)) {
                        System.out.println("\nDigita la fecha en este formato yyyy-MM-dd ");
                        fechaString = CheckString.check("Ingrese la fecha de nuevo");
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

                        System.out.println("\nDigita la hora en este formato hora:min:seg");
                        horaString = CheckString.check("Ingrese la hora de nuevo");
                        hora = Time.valueOf(horaString);

                        System.out.println("\nDigita el lugar del entrenamiento");
                        lugar = CheckString.check("Ingrese el lugar de nuevo");


                        // FALTA REVIZAR SI ESTO FUNCIONA
                        boolean existeEntrenamiento;

                        do {

                            System.out.println("Digite el id del entrenamiento");
                            idEntrenamiento = CheckInt.check();
                            existeEntrenamiento = equipo.getLstEntrenamientos().containsKey(idEntrenamiento);
    
                            if (existeEntrenamiento){
    
                                System.out.println("El codigo del entrenamiento ya existe");
    
                            }else {
                                equipo.getLstEntrenamientos().put(idEntrenamiento, entrenamiento);
                            }
                            
                        } while (existeEntrenamiento);

                       
                        

                        entrenamiento = new Entrenamiento();
                        entrenamiento.setIdEquipo(idEquipo);
                        entrenamiento.setFecha(fecha);
                        entrenamiento.setHora(hora);
                        entrenamiento.setLugar(lugar);

                        Controller.getController().controladorEntrenamientos.put(idEntrenamiento, entrenamiento);
                        equipo.getLstEntrenamientos().put(1, entrenamiento);

                        int decisionActividad;
                        do {
                            System.out.println("=============================");
                            System.out.println("\tActividades del entrenamiento");
                            System.out.println("=============================\n");
                            System.out.println("1. Ingresar");
                            System.out.println("2. Regresar al menu");

                            decisionActividad = CheckInt.check();

                            switch (decisionActividad) {
                                case 1:
                                    try {
                                        System.out.println("Ingresa la descripcion de la actividad");
                                        String descripcion = CheckString.check("Digita de nuevo la descripciòn.");
                                        System.out.println("Digite la duracion en minutos");
                                        int duracion = CheckInt.check();

                                        actividad = new Actividad();
                                        actividad.setDescripcion(descripcion);
                                        actividad.setDuracion(duracion);

                                        boolean existe;
                                        do {
                                            System.out.println("Digita el código de la actividad:");
                                            idActividad = CheckInt.check();
                                            existe = entrenamiento.getLstActividades().containsKey(idActividad);
                                            if (existe) {
                                                System.out.println("Ya existe ese código de actividad.");
                                            } else {
                                                entrenamiento.getLstActividades().put(idActividad, actividad);
                                            }
                                        } while (existe);

                                        System.out.println("\nActividad registrada exitosamente");
                                    } catch (Exception e) {
                                        System.out.println("ERROR: " + e);
                                    }
                                    break;

                                case 2:
                                    break;

                                default:
                                    System.out.println("Opcion invalida");
                                    break;
                            }

                        } while (decisionActividad != 2);
                    } else {
                        System.out.println("El codigo del equipo no existe o no puedes actualizar datos de este equipo");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("Digita el codigo del equipo");
                    idEquipo = CheckInt.check();
                    equipo = Controller.getController().controladorEquipos.get(idEquipo);

                    if (equipo != null && equipo.getNombreEntrenador().equals(nombreUsuario)) {
                        System.out.println("Entrenamientos: " + equipo.getLstEntrenamientos());
                        System.out.println("Digita el codigo del entrenamiento");
                        idEntrenamiento = CheckInt.check();

                        if (equipo.getLstEntrenamientos().containsKey(idEntrenamiento)) {
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
                                decision = CheckInt.check();

                                switch (decision) {
                                    case 1:
                                        System.out.println("\nDigita la fecha en este formato yyyy-MM-dd ");
                                        fechaString = CheckString.check("Ingrese la fecha de nuevo");
                                        try {
                                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                            java.util.Date utilDate = dateFormat.parse(fechaString);
                                            fecha = new java.sql.Date(utilDate.getTime());
                                            equipo.getLstEntrenamientos().get(idEntrenamiento).setFecha(fecha);
                                            System.out.println("Fecha actualizada");
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                            System.out.println("Error al insertar la fecha");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Digite el lugar: ");
                                        lugar = CheckString.check("Digita de nuevo el lugar");
                                        equipo.getLstEntrenamientos().get(idEntrenamiento).setLugar(lugar);
                                        System.out.println("Lugar actualizado");
                                        break;
                                    case 3:
                                        System.out.println("\nDigita la hora en este formato hora:min:seg");
                                        horaString = CheckString.check("Ingrese la hora de nuevo");
                                        hora = Time.valueOf(horaString);
                                        equipo.getLstEntrenamientos().get(idEntrenamiento).setHora(hora);
                                        System.out.println("Hora actualizada");
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("Opcion invalida");
                                        break;
                                }

                            } while (decision != 4);

                        } else {
                            System.out.println("El codigo del entrenamiento es incorrecto");
                            scanner.nextLine();
                        }

                    } else {
                        System.out.println("Codigo del equipo no existe o usuario no autorizado");
                        scanner.nextLine();
                    }
                    break;

                case 3:
                    System.out.println("\n-------------------");
                    System.out.println("   E L I M I N A R ");
                    System.out.println("\n-------------------");

                    System.out.println("Digita el id del equipo");
                    codigoEquipo = CheckInt.check();
                    equipo = Controller.getController().controladorEquipos.get(codigoEquipo);

                    if (equipo != null && equipo.getNombreEntrenador().equals(nombreUsuario)) {
                        System.out.println("Digita el id del entrenamiento");
                        idEntrenamiento = CheckInt.check();

                        entrenamiento = Controller.getController().controladorEntrenamientos.get(idEntrenamiento);

                        if (entrenamiento != null) {
                            
                            entrenamiento = Controller.getController().controladorEntrenamientos.remove(idEntrenamiento);

                            if (entrenamiento != null) {
                                System.out.println("Entrenamiento eliminado correctamente");
                            } else {
                                System.out.println("Error al eliminar entrenamiento");
                            }
                        } else {
                            System.out.println("Error al buscar el equipo");
                        }
                    } else {
                        System.out.println("Codigo del equipo no existe o usuario no autorizado");
                    }
                    break;
    
                default:
                    System.out.print("Presiona entrer para volver al menu pricipal: ");
                    scanner.nextLine();
                    String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    break ;
            }
        } while (decision != 4);
    }
}
