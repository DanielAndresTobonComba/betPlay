package com.betplay.View.viewSecundarias;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.Equipo;
import com.betplay.Entity.Jugador;
import com.betplay.Entity.Partidos;
import com.betplay.View.ViewRoles.GuiaRoles;

public class gestionCalendarios {

    public static void startconsultarCalendario(String nombreUsuario) {

        int decision = 0;
        Partidos partido = new Partidos();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n---------------------------");
            System.out.println("   C A L E N D A R I O S");
            System.out.println("===========================");
            System.out.println("           Menú");
            System.out.println("===========================");
            System.out.println("1. Ingresar rango\n");
            System.out.println("2. Filtro por equipos\n");
            System.out.println("3. Filtro por estadio\n");
            System.out.println("4. Volver al menú");
            System.out.println("---------------------------");

            System.out.println("\n\n. . . . . . . . . .");
            System.out.println(" Digite la opción");
            System.out.println(". . . . . . . . . . ");
            System.out.print(">>> ");
            decision = CheckInt.check();

            switch (decision) {

                case 1:
                    Date fecha;
                    String fechaInicialString;
                    String fechaFinalString;

                    System.out.println("\n================================");
                    System.out.println("   Buscar por rango de fechas");
                    System.out.println("================================");

                    System.out.println("\n--> Fecha inicio (yyyy-MM-dd): ");
                    System.out.println(". . . . . . . . . . . . . . . . . .");
                    System.out.print(">>> ");
                    fechaInicialString = scanner.next();

                    System.out.println("\n\n--> Fecha fin (yyyy-MM-dd): ");
                    System.out.println(". . . . . . . . . . . . . . . . . .");
                    System.out.print(">>> ");
                    fechaFinalString = scanner.next();

                    // Parseo de fechas inicial y final
                    java.sql.Date fechaInicial = null;
                    java.sql.Date fechaFinal = null;

                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                        // Parseo de fecha inicial
                        Date utilFechaInicial = dateFormat.parse(fechaInicialString);
                        fechaInicial = new java.sql.Date(utilFechaInicial.getTime());

                        // Parseo de fecha final
                        Date utilFechaFinal = dateFormat.parse(fechaFinalString);
                        fechaFinal = new java.sql.Date(utilFechaFinal.getTime());

                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }

                    System.out.println("\n================================================");
                    System.out.println("              LISTA DE PARTIDOS");
                    System.out.println("================================================");

                    Set<Integer> setKey = Controller.getController().controladorPartidos.keySet();

                    for (Integer key : setKey) {
                        partido = Controller.getController().controladorPartidos.get(key);
                        Date fechaPartido = partido.getFecha();

                        if (fechaPartido.compareTo(fechaInicial) >= 0 && fechaPartido.compareTo(fechaFinal) <= 0) {
                            // El partido está dentro del rango especificado por el usuario
                            System.out.println(partido); // Aquí puedes imprimir o manejar la información del partido
                        }
                    }

                    break;

                case 2:
                    int idEquipo;
                    Equipo equipo = new Equipo();
                    int idEquipoLocal;
                    int idEquipoVisitante;
                    
                    System.out.println("\n========================");
                    System.out.println("   Buscar por equipos");
                    System.out.println("========================");

                    System.out.println("\n--> Digite el código del equipo");
                    System.out.println(". . . . . . . . . . . . . . . . . .");
                    System.out.print(">>> ");
                    idEquipo = CheckInt.check();

                    equipo = Controller.getController().controladorEquipos.remove(idEquipo) ;

                    if (equipo != null){

                        Hashtable<Integer,Partidos > lstPartidos =  equipo.getLstPartidos();

                        for (Integer key : lstPartidos.keySet()){

                            partido = lstPartidos.get(key); 

                            System.out.println("Id partido" + key);
                            idEquipoLocal = partido.getIdEquipoLocal() ;
                            idEquipoVisitante = partido.getIdEquipoVisitante();

                            equipo = Controller.getController().controladorEquipos.get(idEquipoLocal);
                            System.out.println("Equipo local" + equipo.getNombre());
                            System.out.println("Goles local: " + partido.getGolesLocal() );

                            equipo = Controller.getController().controladorEquipos.get(idEquipoVisitante);
                            System.out.println("Equipo visitante" + equipo.getNombre());
                            System.out.println("Goles visitante: " + partido.getIdEquipoVisitante());

                            

                            

                        }

                    } else {
                        System.out.println("\n**********************************");
                        System.out.println("  El código del equipo no existe\n");
                        System.out.println("**********************************");
                        scanner.nextLine();
                    }

                    
                    break;

                case 3:
                    // Implementar filtro por estadio
                    break;

                case 4:
                    System.out.print("\nPresiona enter para volver al menu principal: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    return;

            }

        } while (decision != 4);

        scanner.close(); // Cerrar el scanner al finalizar el método si no se va a usar más
    }
}
