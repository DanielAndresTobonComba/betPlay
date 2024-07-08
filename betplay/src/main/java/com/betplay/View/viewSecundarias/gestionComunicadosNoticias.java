package com.betplay.View.viewSecundarias;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.Comunicacion;
import com.betplay.View.ViewRoles.GuiaRoles;


public class gestionComunicadosNoticias {


    public static void startGestionComunicadosNoticias (String nombreUsuario) {
        Scanner scanner = new Scanner(System.in);


 /*        // Obtener la fecha actual
        Date fechaActual = new Date();
        System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(fechaActual));
        scanner.nextLine(); */

        // Digita la fecha
        String fechaString;
        java.sql.Date fecha = null;

        Comunicacion comunicacion = new Comunicacion();
        int decision;

        //Controller.getController().controladorComunicaciones.put(1, comunicacion);
        



        do {
            
            int idComunicacion;
            String titulo;
            String contenido;

            System.out.println("\n-----------------------------");
            System.out.println("   C O M U N I C A C I Ó N");
            System.out.println("=============================");
            System.out.println("            Menú");
            System.out.println("=============================");
            System.out.println("1. Crear noticia\n");
            System.out.println("2. Crear comunicado\n");
            System.out.println("3. Eliminar noticia\n");  
            System.out.println("4. Eliminar comunicado\n");
            System.out.println("5. Editar noticia\n");
            System.out.println("6. editar comunicado\n");
            System.out.println("7. Crear sanción\n");  
            System.out.println("8. Buscar sanción\n");
            System.out.println("9. Volver al menu");
            System.out.println("------------------------------");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            decision = CheckInt.check();


            switch (decision) {

                case 1:

                    System.out.println("\n===================");
                    System.out.println("   Crear noticia");
                    System.out.println("===================");

                    boolean existe = true;

                    do {
                        
                        System.out.println("\n--> Digita el codigo de la noticia");
                        System.out.println(". . . . . . . . . . . . . . . . . . . .");
                        System.out.print(">>> ");
                        idComunicacion = CheckInt.check();

                        existe = Controller.getController().controladorComunicaciones.containsKey(idComunicacion);

                        if (existe){
                            System.out.println("\n*********************");
                            System.out.println("Este código ya existe\n");
                            System.out.println("*********************");
                            
                        }else{
                            existe = false;
                            
                        }

                    }
                    while (existe);

                        //TITULO Y CONTENIDO DE LA NOTICIA
                        System.out.println("\n________________________");
                        System.out.println("\n  TíTULO DE LA NOTICIA");
                        System.out.println("________________________");

                        System.out.println("\n--> Escriba el título de la noticia");
                        System.out.println(". . . . . . . . . . . . . . . . . . . .");
                        System.out.print(">>> ");

                        titulo = CheckString.check("\nEscriba nuevamente el título.");

                        scanner.nextLine();
                        System.out.println("\n________________________");
                        System.out.println("\n       CONTENIDO");
                        System.out.println("________________________");

                        System.out.println("\n--> Escriba el contenido de la noticia");
                        System.out.println(". . . . . . . . . . . . . . . . . . . .");
                        System.out.print(">>> ");
                        contenido = CheckString.check("\nDigite de nuevo el contenido");
                        scanner.nextLine();


                        // OBTENER LA FECHA DE PUBLICACION
                        System.out.println("\n________________________");
                        System.out.println("\n  FECHA DE PUBLICACIÓN");
                        System.out.println("________________________");

                        
                        System.out.println("\n--> Fecha de publicación (YYYY-MM-DD) ");
                        System.out.println(". . . . . . . . . . . . . . . . . . . .");
                        System.out.print(">>> ");
                        
                        fecha = null;
                        boolean salida = false;

                        while (salida == false) {
                            
                        }
                        try {
                            fechaString = CheckString.check("Digita de nuevo la fecha");
                            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            java.util.Date utilDate = dateFormat.parse(fechaString);
                            fecha = new java.sql.Date(utilDate.getTime());
                            salida = true;
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("\n**************************");
                            System.out.println("Error al insertar la fecha");
                            System.out.println("**************************");
                            //fechaString = CheckString.check("Digita de nuevo la fecha");

                            break;
                        }



                        try {
                            comunicacion.setTitulo(titulo);
                            comunicacion.setContenido(contenido);
                            comunicacion.setFechaPublicacion(fecha);

                            Controller.getController().controladorComunicaciones.put(idComunicacion, comunicacion);
                            System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                            System.out.println(":: Noticia creada y publicada exitosamente ::");
                            System.out.println(":: :: :: :: :: :: :: :: :: :: :: :: :: :: ::");
                            scanner.nextLine();
                            break;

                        } catch (Exception e) {

                            System.out.println("Error: " + e);

                        } finally {

                            comunicacion.setTitulo(null);
                            comunicacion.setContenido(null);
                            comunicacion.setFechaPublicacion(null);
                        }
                
                    break;
    
                case 2:
                
                int cantidadDestinatarios; 

                System.out.println("\n-------------------");
                System.out.println("\tCrear comunicado");
                System.out.println("===================");

                do {
                    
                    System.out.println("Digita el codigo del comunicado");
                    idComunicacion = CheckInt.check();
    
                    existe = Controller.getController().controladorComunicaciones.containsKey(idComunicacion);
    
                    if (existe){
                        System.out.println("El codigo ya esta en uso");
                        
                    }else{
                        existe = false;
                        
                    }
    
                }
                while (existe);
    
                    //TITULO Y CONTENIDO DE LA NOTICIA
    
                    System.out.println("Titulo del comunicado");
                    titulo = CheckString.check("\nDigite de nuevo el titulo.");
                    scanner.nextLine();
    
                    System.out.println("Contenido");
                    contenido = CheckString.check("\nDigita de nuevo el contenido");
                    scanner.nextLine();
    
    
                    // OBTENER LA FECHA DE PUBLICACION
    
                    System.out.println("Digita la fecha en este formato yyyy-MM-dd ");
                    fechaString = CheckString.check("Digita de nuevo la fecha");
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
    
                    try {
                        comunicacion.setTitulo(titulo);
                        comunicacion.setContenido(contenido);
                        comunicacion.setFechaPublicacion(fecha);
    
                        Controller.getController().controladorComunicaciones.put(idComunicacion, comunicacion);
                        System.out.println("Noticia creada y publicada exitosamente ");
                        scanner.nextLine();

                        System.out.println("Digita la cantidad de equipos destinatarios");
                        cantidadDestinatarios = CheckInt.check();
    
                        for (int i = 0; i < cantidadDestinatarios; i++) {
    
                            int codigo;
    
                            do {
    
                                existe = false;
                                System.out.println("Codigo del equipo");
                                codigo = CheckInt.check();
                                existe = Controller.getController().controladorEquipos.containsKey(codigo);
        
                                if (!existe){
                                    System.out.println("El codigo del equipo no existe");
                                    
                                }else{
                                    existe = true;
                                    
                                }
                                
                            } while (existe);
    
                            
                            comunicacion.getLstDestinatarios().add(codigo);
                            
    
    
                        }

                        break;


    
                    } catch (Exception e) {
    
                        System.out.println("Error: " + e);
    
                    } finally {
    
                        comunicacion.setTitulo(null);
                        comunicacion.setContenido(null);
                        comunicacion.setFechaPublicacion(null);
                    }
                    
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
    
                System.out.print("Presiona entrer para volver al menu pricipal: ");
                scanner.nextLine();
                /* String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                GuiaRoles.entrarVista(rol, nombreUsuario); */
                break ;
    
                
              
    
            }
    
            
        } while (decision != 9);

        

        
    }

}
