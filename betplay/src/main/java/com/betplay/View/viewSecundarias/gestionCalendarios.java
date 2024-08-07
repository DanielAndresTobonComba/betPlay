package com.betplay.View.viewSecundarias;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

import com.betplay.Controller;
import com.betplay.Entity.CheckInt;
import com.betplay.Entity.Equipo;
import com.betplay.Entity.Estadio;
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
            System.out.println("            Menú");
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

                    System.out.println("\n-------------------");
                    System.out.println("   Buscar por rango");
                    System.out.println("===================");

                    System.out.println("Fecha inicio (yyyy-MM-dd): ");
                    fechaInicialString = scanner.next();

                    System.out.println("Fecha fin (yyyy-MM-dd): ");
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

                    System.out.println("------------------------------------------------");
                    System.out.println("\tLISTA DE PARTIDOS:");
                    System.out.println("------------------------------------------------");

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
                    int idEstadio;

                    Estadio estadio = new Estadio();
                    
                    System.out.println("\n-------------------");
                    System.out.println("   Buscar por equipos");
                    System.out.println("===================");

                    System.out.println("Digite el codigo del equipo");
                    idEquipo = CheckInt.check();

                    equipo = Controller.getController().controladorEquipos.remove(idEquipo) ;

                    if (equipo != null){

                        Hashtable<Integer,Partidos > lstPartidos =  equipo.getLstPartidos();

                        for (Integer key : lstPartidos.keySet()){

                            partido = lstPartidos.get(key); 

                            idEstadio = partido.getIdEstadio();
                            estadio = Controller.getController().controladorEstadios.get(idEstadio);
                            System.out.println("Estadio: " + estadio.getNombre());

                            System.out.println("Fecha: " + partido.getFecha());
                            System.out.println("Hora: " + partido.getHora());

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
                        System.out.println("El codigo del equipo no existe");
                        scanner.nextLine();
                    }

                    
                    break;

                case 3:

                // VOY ACA ESPERAR revizar

                    System.out.println("\n-------------------");
                    System.out.println("   Buscar por estadios");
                    System.out.println("===================");

                    

                    boolean existe = false;


                    do {
                        
                        System.out.println("Digita el codigo del estadio");
                        idEstadio = CheckInt.check();

                        existe = Controller.getController().controladorEstadios.containsKey(idEstadio);

                        if (existe){
                            System.out.println("El estadio no existe");
                            existe = true;
                            
                        }

                    }
                    while (!existe);







                        
                    break;





                case 4:
                    System.out.print("Presiona enter para volver al menu principal: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    String rol = Controller.getController().controladorUsuarios.get(nombreUsuario).idRol;
                    GuiaRoles.entrarVista(rol, nombreUsuario);
                    return;

            }

        } while (decision != 4);

        scanner.close(); // Cerrar el scanner al finalizar el método si no se va a usar más
    }
}
