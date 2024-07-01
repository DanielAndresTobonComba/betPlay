package com.betplay;

import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.ldap.Control;

import com.betplay.Entity.Actividad;
import com.betplay.Entity.Comunicacion;
import com.betplay.Entity.Entrada;
import com.betplay.Entity.Entrenamiento;
import com.betplay.Entity.Equipo;
import com.betplay.Entity.Estadio;
import com.betplay.Entity.Gol;
import com.betplay.Entity.Incidente;
import com.betplay.Entity.Jugador;
import com.betplay.Entity.Lesion;
import com.betplay.Entity.Partidos;
import com.betplay.Entity.Patrocinador;
import com.betplay.Entity.Permiso;
import com.betplay.Entity.Rendimiento;
import com.betplay.Entity.Rol;
import com.betplay.Entity.Tarjeta;
import com.betplay.Entity.Transferencia;
import com.betplay.Entity.Usuario;

public class Controller {
    public static Hashtable <Integer, Equipo> controladorEquipos;
    public static Hashtable<Integer, Actividad> controladorActividades;
    public static Hashtable<Integer, Comunicacion> controladorComunicaciones;
    public static Hashtable<Integer, Entrada> controladorEntradas;
    public static Hashtable<Integer, Entrenamiento> controladorEntrenamientos;
    public static Hashtable<Integer, Estadio> controladorEstadios;
    public static Hashtable<Integer, Gol> controladorGoles;
    public static List<Incidente> controladorIncidentes; 
    public static Hashtable<Integer, Jugador> controladorJugadores;
    public static List<Lesion> controladorLesiones;
    public static Hashtable<Integer, Partidos> controladorPartidos;
    public static Hashtable<Integer, Patrocinador> controladorPatrocinadores;
    public static Hashtable<Integer, Permiso> controladorPermisos;
    public static List<Rendimiento> controladorRendimientos;
    public static Hashtable<Integer, Rol> controladorRoles;
    public static List<Tarjeta> controladorTarjetas;
    public static Hashtable<Integer, Transferencia> controladorTransferencias;
    public static Hashtable<String, Usuario> controladorUsuarios; // La clave va a ser el nombre de usuario
    public static List<String> roles = new ArrayList<>();
    

    
    
    

    private static Controller INSTANCE = new Controller();

    private Controller (){

        //Inicialización de los controladores
        controladorEquipos = new Hashtable<>();
        controladorActividades = new Hashtable<>();
        controladorComunicaciones = new Hashtable<>();
        controladorEntradas = new Hashtable<>();
        controladorEntrenamientos = new Hashtable<>();
        controladorEquipos = new Hashtable<>();
        controladorEstadios = new Hashtable<>();
        controladorGoles = new Hashtable<>();
        controladorIncidentes = new ArrayList<>();
        controladorJugadores  = new Hashtable<>();
        controladorLesiones = new ArrayList<>();
        controladorPartidos = new Hashtable<>();
        controladorPatrocinadores = new Hashtable<>();
        controladorPermisos  = new Hashtable<>();
        controladorRendimientos = new ArrayList<>();
        controladorRoles = new Hashtable<>();
        controladorTarjetas = new ArrayList<>();
        controladorTransferencias = new Hashtable<>();
        controladorUsuarios = new Hashtable<>();
        

        // Definición de los roles
        roles.add("Admin"); // index = 0
        roles.add("Aficionado");// index = 1
        roles.add("Arbitro"); // index = 2
        roles.add("Medico"); // index = 3
        roles.add("Periodista"); // index = 4
        roles.add("Tecnico"); // index = 5
    }

    public static Controller getController()   {
        
        return INSTANCE;
    }

}
