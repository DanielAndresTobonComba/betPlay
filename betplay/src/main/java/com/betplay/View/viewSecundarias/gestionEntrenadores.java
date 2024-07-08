package com.betplay.View.viewSecundarias;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Set;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.CheckString;
import com.betplay.Entity.Equipo;
import com.betplay.Entity.Usuario;
import com.betplay.View.ViewRoles.GuiaRoles;

public class gestionEntrenadores {

    public static void startGestionEntrenadores (String nombreUsuario) {

        int decision ;
        String llaveEntrenador;
        Usuario entrenador;
        

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n-----------------------------");
            System.out.println("   E N T R E N A D O R E S");
            System.out.println("=============================");
            System.out.println("            Menú");
            System.out.println("=============================");
            //System.out.println("1. Agregar\n");
            System.out.println("1. Editar\n");
            System.out.println("2. Eliminar");
            System.out.println("3. Regresar al menu");
            System.out.println("-----------------------------");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            decision = CheckInt.check();

            
        switch (decision) {
            case 1:
           
            
            
            System.out.println("\n-------------------");
            System.out.println("\tEditar entrenador");
            System.out.println("===================");


            System.out.println("Digita el usuario del entrenador");
            llaveEntrenador = CheckString.check("Digita de nuevo");

            entrenador = Controller.getController().controladorUsuarios.get(llaveEntrenador);

            if (entrenador != null  && entrenador.getRol().equals("Tecnico" )&& llaveEntrenador.equals(nombreUsuario)) {

                do {    
                    String nombre;
                    String contraseña;
                    String email;
                    Equipo equipo = new Equipo();
                    String nombreNuevo;
                    
                    
                                System.out.println("\n-------------------");
                                System.out.println("   E D I T A R ");
                                System.out.println("===================");
                                System.out.println("       Menú");
                                System.out.println("===================");
                                System.out.println("1. Nombre");
                                System.out.println("2. Email");
                                System.out.println("3. Contraseña");
                                System.out.println("4. Regresar");
                                System.out.println("\n\n. . . . . . . . . .");
                                System.out.println(" Digite la opción");
                                System.out.println(". . . . . . . . . . ");
                                System.out.print(">>> ");
                                decision = CheckInt.check();

                                switch (decision) {
                                    case 1:
                                        
                                        nombreNuevo = CheckString.check("Digita de nuevo el nombre");
                                        

                                        Set<Integer> lstKeysEquipos = Controller.getController().controladorEquipos.keySet();

                                        for (Integer key : lstKeysEquipos){

                                            equipo = Controller.getController().controladorEquipos.get(key);

                                            if (equipo.getNombreEntrenador().equals(entrenador.getNombre())){

                                                entrenador.setNombre(nombreNuevo);
                                                equipo.setNombreEntrenador(nombreNuevo);

                                            }else {
                                                System.out.println("Error al modificar el nombre del entrenador");
                                            }
                                            
                                        }


                                        /* Set<String> lstKeys = Controller.getController().controladorUsuarios.keySet(); 

                                        for (String llave : lstKeys){

                                            entrenador =  Controller.getController().controladorUsuarios.get(llave);

                                        } */
                                        
                                        break;
                                    case 2:
                                        email = CheckString.check("Digita de nuevo el email"); 
                                        entrenador.setEmail(email);
                                       
                                    case 3:
                                        contraseña = CheckString.check("Digita de nuevo la contraseña");
                                        entrenador.setContraseña(contraseña);
                            
                                    default:
                                        
                                        System.out.println("Saliendo del menu");
                                        System.out.println("Presiona entrer para salir");
                                        scanner.nextLine();
                                        break;
                                }

                            } while (decision != 4);

            } else {

                System.out.println("El entrenador no existe o no tienes permisos");
                scanner.nextLine();

            }
                break;

            case 2:

                System.out.println("\n-------------------");
                System.out.println("   E L I M I N A R ");
                System.out.println("\n-------------------");

                System.out.println("Digita el usuario de entrenador");
                llaveEntrenador = CheckString.check("Digita de nuevo el usuario ");

                entrenador = Controller.getController().controladorUsuarios.remove(llaveEntrenador);
                

                if (entrenador != null  && entrenador.getRol() == "Tecnico" && llaveEntrenador.equals(nombreUsuario)) {
                    System.out.println("Entrenador eliminado correctamente");

                    System.out.println("Usuario: " + llaveEntrenador +  "\nNombre: " + entrenador.getNombre() + "\nEmail: " + entrenador.getEmail() + "\nContraseña: " + entrenador.getContraseña() + "\nRol: " + entrenador.getRol());
                    
                }else {
                    System.out.println("Error al eliminar el entrenador");
                    System.out.println("Presiona enter para salir");
                    scanner.nextLine();
                }
                
                break;

            case 3:
                System.out.println("Saliendo del programa");
                System.out.print("Presiona entrer para volver al menu pricipal: ");
                scanner.nextLine();
                String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                GuiaRoles.entrarVista(rol, nombreUsuario);
                    
                break;



        }
    
            
        } while (decision != 3);

    }

}
