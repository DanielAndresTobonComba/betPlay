package com.betplay.View.viewSecundarias;

import java.util.Hashtable;

import java.util.Scanner;


import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.Equipo;
import com.betplay.Entity.Jugador;
import com.betplay.View.ViewRoles.GuiaRoles;

public class gestionEquipos {


    public static void startGestioEquipos (String nombreUsuario){

    
        int decision ;
        int codigoEquipo;

        Scanner scanner = new Scanner(System.in);

        Equipo equipo = new Equipo();

        Jugador jugador = new Jugador();

        jugador.setNombre("Daniel");
        jugador.setEdad(23);
        jugador.setEstado("Activo");
        jugador.setNacionalidad("Colombiano");
    
        Controller.getController().controladorJugadores.put(1, jugador);

        
        

        //do {
            System.out.println("\n----------------------------");
            System.out.println("       E Q U I P O S");
            System.out.println("============================");
            System.out.println("           Menú");
            System.out.println("============================");
            System.out.println("1. Registrar equipo\n");
            System.out.println("2. Editar equipo\n");
            System.out.println("3. Eliminar equipo\n");
            System.out.println("4. Tranferencia de jugadores\n");
            System.out.println("5. Equipamiento\n");
            System.out.println("6. Buscar equipo\n");
            System.out.println("7. Regresar al menú");
            System.out.println("-----------------------------");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            decision = CheckInt.check();
            
            switch (decision) {
                case 1:
                    RegistraEquipo.Registrar(nombreUsuario);
                    break;
    
                case 2:

                    System.out.println("\n==============================");
                    System.out.println("       MODIFICAR EQUIPO");
                    System.out.println("==============================\n");

                    System.out.println("\n--> Ingrese el código del equipo:");
                    System.out.println(". . . . . . . . . . . . . . . . . . .");
                    System.out.print("\n>>> ");
                    codigoEquipo = CheckInt.check();

            
                    if (Controller.getController().controladorEquipos.get(codigoEquipo) == null) {
                        System.out.println("\n****************************************");
                        System.out.println("No existe equipo con el código ingresado");
                        System.out.println("****************************************");
                        System.out.println("\nPresione cualquier tecla para salir...");
                        System.out.print(">>> ");
                        scanner.nextLine();
                        break;
                    } 

                    int choice2;

                    do {
                        System.out.println("\n.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                        System.out.println("  ¿Qué dato deseas actualizar?");
                        System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
                        System.out.println("1. Nombre del equipo\n");
                        System.out.println("2. Ciudad\n");
                        System.out.println("3. Entrenador\n");
                        System.out.println("4. Estadio\n");
                        System.out.println("5. Salir");
                        System.out.println("---------------------------------");

                        System.out.println("\n\n. . . . . . . . . .");
                        System.out.println(" Digite la opción");
                        System.out.println(". . . . . . . . . . ");
                        System.out.print(">>> ");
                        

                        choice2 = CheckInt.check();

                        switch (choice2) {
                            case 1:
                                System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                System.out.println("--> Ingrese el nuevo nombre: ");
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                System.out.print(">>> ");
                                equipo.setNombre(scanner.nextLine());
                                break;

                            case 2:
                                System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                System.out.println("--> Ingrese la nueva ciudad: ");
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                System.out.print(">>> ");
                                equipo.setCiudad(scanner.nextLine());
                                break;

                            case 3:
                                System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=====");
                                System.out.println("--> Ingresa el nuevo entrenador: ");
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=====");
                                System.out.print(">>> ");
                                equipo.setNombreEntrenador(scanner.nextLine());
                                break;

                            case 4:
                                System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                System.out.println("--> Ingresa el nuevo estadio: ");
                                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                                System.out.print(">>> ");
                                equipo.setNombreEntrenador(scanner.nextLine());
                                break;

                            default:
                                System.out.println("\n**************************************");
                                System.out.println("X Opción inválida, inténtelo de nuevo!");
                                System.out.println("**************************************");
                                break;
                        }
                    } while (choice2 != 5);
                        
                    break;
    
                case 3:

                    System.out.println("\n===============================");
                    System.out.println("        ELIMINAR EQUIPO");
                    System.out.println("=================================");
                    System.out.println("--> Ingrese el código del equipo: ");
                    System.out.print("\n>>> ");
                    codigoEquipo = CheckInt.check();

                    equipo = Controller.getController().controladorEquipos.remove(codigoEquipo) ;

                    if (equipo != null) {
                        // equipo.getLstJugadores().add(jugador);
                        
                        System.out.println("\n:: :: :: :: :: :: :: :: :: :: :: ::");
                        System.out.println(":: El equipo ha sido eliminado.  ::");
                        System.out.println(":: :: :: :: :: :: :: :: :: :: :: ::\n");

                        System.out.println("______________________________");
                        System.out.println("Nombre: " + equipo.getNombre() ); 
                        System.out.println("Ciudad: " +  equipo.getCiudad()); 
                        System.out.println("Entrenador: " + equipo.getNombreEntrenador() ); 
                        System.out.println("Estadio: " + equipo.getNombreEstadio() ); 
                        System.out.println("______________________________");
                        
                        
                        System.out.println("\n------------------------------------------------");
                         System.out.println("        LISTA DE TODOS LOS JUGADORES");
                        System.out.println("------------------------------------------------");

                        // USAR GPT PARA ARREGLAR LA IMPRESION

                        System.out.printf("\n%-20s %-10s %-15s %-10s\n", "Nombre", "Edad", "Nacionalidad", "Estado");
                         System.out.println("-------------------------------------------------------------");

                        Hashtable<Integer, Jugador> jugadores = equipo.getLstJugadores();

                        for (Integer claveJugador : jugadores.keySet()) {
                            jugador = jugadores.get(claveJugador);
                            System.out.println("Clave del jugador: " + claveJugador);
                            System.out.println("Nombre del jugador: " + jugador.getNombre());
                            System.out.println("Edad del jugador: " + jugador.getEdad());
                            System.out.println("Posición del jugador: " + jugador.getPosicion());
                            
                        }

                        scanner.nextLine();
                        

                    } else {
                        System.out.println("\n****************************************");
                        System.out.println("No existe equipo con el código ingresado");
                        System.out.println("****************************************");
                        System.out.println("\nPresione cualquier tecla para salir...");
                        System.out.print(">>> ");
                        scanner.nextLine();
                        scanner.nextLine();
                       
                    }

                    
                    break;

                    
    
                case 4:
                    // Como sera la tranferencia? 
                    break;
                
                
                case 5:
                    // No hay atributo para el equipamiento
                    break;

                case 6:

                    System.out.println("\n=================================");
                    System.out.println("          BUSCAR EQUIPO");
                    System.out.println("=================================");
                    System.out.println("--> Ingrese el código del equipo: ");
                    System.out.print("\n>>> ");
                    codigoEquipo = CheckInt.check();
                    scanner.nextLine();

                    if(Controller.getController().controladorEquipos.get(codigoEquipo) != null) {
                        System.out.println("\n________________________________");
                        System.out.println("Nombre: " + equipo.getNombre() ); 
                        System.out.println("Ciudad: " +  equipo.getCiudad()); 
                        System.out.println("Entrenador: " + equipo.getNombreEntrenador() ); 
                        System.out.println("Estadio: " + equipo.getNombreEstadio() );
                        System.out.println("________________________________");

                        System.out.println("\n------------------------------------------------");
                        System.out.println("              LISTA DE JUGADORES:");
                       System.out.println("------------------------------------------------");


                       System.out.printf("\n%-20s %-10s %-15s %-10s\n", "Nombre", "Edad", "Nacionalidad", "Estado");
                        System.out.println("-------------------------------------------------------------");


                        Hashtable<Integer, Jugador> jugadores = equipo.getLstJugadores();

                        if (jugadores != null){

                            for (Integer claveJugador : jugadores.keySet()) {
                                jugador = jugadores.get(claveJugador);
                                System.out.println("Clave del jugador: " + claveJugador);
                                System.out.println("Nombre del jugador: " + jugador.getNombre());
                                System.out.println("Edad del jugador: " + jugador.getEdad());
                                System.out.println("Posición del jugador: " + jugador.getPosicion());
                                
                            }

                        }
                
                        
                        
                        
                    }

                    System.out.println("\nPresione cualquier tecla para salir...");
                    System.out.print(">>> ");
                    scanner.nextLine();
                    
                    break;
    
                default:
                    System.out.println("\nPresione cualquier tecla para volver al menú");
                    System.out.print(">>> ");
                    scanner.nextLine();
                    String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    break;
                    
    
            }
            
        //} while (decision != 7);
      
    }

}
