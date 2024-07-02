package com.betplay.View.viewSecundarias;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.Equipo;
import com.betplay.Entity.Jugador;

public class gestionEquipos {


    public static void startGestioEquipos (){

    
        int decision ;

        int codigoEquipo;
        String nombreEquipo; 
        String ciudad;
        String nombreEstadio;
        String nombreEntrenador; 

        Scanner scanner = new Scanner(System.in);

        Equipo equipo = new Equipo();

        Jugador jugador = new Jugador();

        jugador.setNombre("Daniel");
        jugador.setEdad(23);
        jugador.setEstado("Activo");
        jugador.setNacionalidad("Colombiano");
    
        Controller.getController().controladorJugadores.put(1, jugador);

        
        

        do {
            System.out.println("\n-------------------");
            System.out.println("   E Q U I P O S");
            System.out.println("===================");
            System.out.println("       Menú");
            System.out.println("===================");
            System.out.println("1. Agregar");
            System.out.println("2. Editar");
            System.out.println("3. Eliminar");
            System.out.println("4. Tranferencia de jugadores");
            System.out.println("5. Equipamiento");
            System.out.println("6. Buscar equipo");
            System.out.println("7. Regresar al menu");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            decision = CheckInt.check();
            
            switch (decision) {
                case 1:

                    System.out.println("=============================");
                    System.out.println("\tCrear Equipo");
                    System.out.println("=============================\n");

                    System.out.print("Codigo del equipo: ");
                    codigoEquipo = CheckInt.check();


                    System.out.print("Nombre del equipo ");
                    nombreEquipo = scanner.nextLine();

                    System.out.print("Nombre del estadio: ");
                    nombreEstadio = scanner.nextLine();

                    System.out.print("Nombre de la ciudad: ");
                    ciudad = scanner.nextLine();

                    System.out.print("Nombre del entrenador: ");
                    nombreEntrenador = scanner.nextLine();


                    if(Controller.getController().controladorEquipos.get(codigoEquipo) != null){
                        System.out.println("El codigo del equipo ya existe");
                        System.out.println("Presiona entrer para salir.");
                        scanner.nextLine();

                        return;
                    } else {

                        equipo.setNombre(nombreEquipo);
                        equipo.setNombreEstadio(nombreEstadio);
                        equipo.setNombreEntrenador(nombreEntrenador);
                        equipo.setCiudad(ciudad);

                        Controller.getController().controladorEquipos.put(codigoEquipo, equipo);

                        System.out.println("Equipo ingresado exitosamente");
                        scanner.nextLine();

                    }
                    
                    break;
    
                case 2:

                    System.out.println("=============================\n");
                    System.out.println("\tModificar Equipo");
                    System.out.println("=============================\n");

                    System.out.print("Ingrese el codigo del equipo: ");
                    codigoEquipo = CheckInt.check();

            
                    if (Controller.getController().controladorEquipos.get(codigoEquipo) == null) {
                        System.out.println("No se encontró un equipo con el código proporcionado.");
                        scanner.nextLine();
                        return;
                    } 

                    int choice2;

                    do {
                        System.out.println("Qué dato deseas actualizar?");
                        System.out.println("1. Nombre del equipo");
                        System.out.println("2. Ciudad");
                        System.out.println("3. Entrenador");
                        System.out.println("4. Estadio");
                        System.out.println("5. Salir");
                        System.out.print("\nOpcion: ");

                        choice2 = CheckInt.check();
                        scanner.nextLine(); // Para manejar el salto de línea después de nextInt()

                        switch (choice2) {
                            case 1:
                                System.out.print("Ingrese el nuevo nombre: ");
                                equipo.setNombre(scanner.nextLine());
                                break;
                            case 2:
                                System.out.print("Ingrese la nueva ciudad: ");
                                equipo.setCiudad(scanner.nextLine());
                                break;

                            case 3:
                                System.out.println("Ingresa el nuevo entrenador: ");
                                equipo.setNombreEntrenador(scanner.nextLine());
                                break;

                            case 4:
                                System.out.println("Ingresa el nuevo estadio: ");
                                equipo.setNombreEntrenador(scanner.nextLine());
                                break;

                            default:
                                System.out.print("Opción inválida, inténtelo de nuevo.");
                        }
                    } while (choice2 != 5);
                        
                    break;
    
                case 3:

                    System.out.println("=============================\n");
                    System.out.println("\tEliminar Equipo");
                    System.out.println("=============================\n");

                    System.out.print("Ingrese el codigo del equipo: ");
                    codigoEquipo = CheckInt.check();

                    equipo = Controller.getController().controladorEquipos.remove(codigoEquipo) ;

                    

                    if (equipo != null) {
                        equipo.getLstJugadores().add(jugador);
                        
                        System.out.println("=============================");
                        System.out.println("El equipo ha sido eliminado.");
                        System.out.println("=============================\n");

                        System.out.println("Nombre: " + equipo.getNombre() ); 
                        System.out.println("Ciudad: " +  equipo.getCiudad()); 
                        System.out.println("Entrenador: " + equipo.getNombreEntrenador() ); 
                        System.out.println("Estadio: " + equipo.getNombreEstadio() ); 
                        
                        
                        System.out.println("------------------------------------------------");
                         System.out.println("\tLISTA DE TODOS LOS JUGADORES:");
                        System.out.println("------------------------------------------------");

                       
/*                        Set<Integer> keys = Controller.getController().controladorEquipos.keySet();

                        ArrayList<Integer> lstKeyArrayList = new ArrayList<>(keys);  */

/*                         Set <String> setKey = Controller.getController().controladorEquipos.get(codigoEquipo).lstJugadores.forEach((j) -> System.out.println(j.keySet())); */

                        System.out.printf("%-20s %-10s %-15s %-10s\n", "Nombre", "Edad", "Nacionalidad", "Estado");
                         System.out.println("-------------------------------------------------------------");

                         for (Jugador j : equipo.getLstJugadores()) {
                        System.out.printf("%-20s %-10d %-15s %-10s\n",                   
                                j.getNombre(), 
                                j.getEdad(), 
                                j.getNacionalidad(), 
                                j.getEstado());
                        
                        }
                        


                       // equipo.getLstPartidos();

                        scanner.nextLine();
                        

                    } else {
                        System.out.println("No exite equipo con el codigo ingresado");
                        System.out.println("Oprime entrer para salir");
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

                    System.out.println("=============================\n");
                    System.out.println("\tBuscar Equipo");
                    System.out.println("=============================\n");

                    System.out.print("Codigo del equipo: ");
                    codigoEquipo = scanner.nextInt();
                    scanner.nextLine();

                    if(Controller.getController().controladorEquipos.get(codigoEquipo) != null) {
                        System.out.println("Nombre: " + equipo.getNombre() ); 
                        System.out.println("Ciudad: " +  equipo.getCiudad()); 
                        System.out.println("Entrenador: " + equipo.getNombreEntrenador() ); 
                        System.out.println("Estadio: " + equipo.getNombreEstadio() ); 

                        System.out.println("------------------------------------------------");
                        System.out.println("\tLISTA DE JUGADORES:");
                       System.out.println("------------------------------------------------");


                       System.out.printf("%-20s %-10s %-15s %-10s\n", "Nombre", "Edad", "Nacionalidad", "Estado");
                        System.out.println("-------------------------------------------------------------");

                        for (Jugador j : equipo.getLstJugadores()) {
                       System.out.printf("%-20s %-10d %-15s %-10s\n", 
                               j.getNombre(), 
                               j.getEdad(), 
                               j.getNacionalidad(), 
                               j.getEstado());
                       
                       }
                        
                    }

                    System.out.println("Presiona entrer para salir");
                    scanner.nextLine();
                    
                    break;
    
                case 7:
                    System.out.print("Presiona entrer para volver al menu pricipal: ");
                    scanner.nextLine();
                    return;
                    
    
            }
            
        } while (decision != 6);

      
    }

}
