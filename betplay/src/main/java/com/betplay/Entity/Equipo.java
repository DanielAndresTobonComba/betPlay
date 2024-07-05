package com.betplay.Entity;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Equipo {

    //private int id;
    public String nombre, ciudad, nombreEstadio, nombreEntrenador;
    
    /*COMENTARIO: Se decide no incluir Lista de entrenadores; más bien se establece el nombre del entrenador como atributo
    
    */
    // Podrian ser listas de objetos?
    //public List<String> lstEntrenadores;
    public Hashtable<Integer, Jugador> lstJugadores;
    public Hashtable<Integer, Partidos> lstPartidos;
    public Hashtable<Integer, Entrenamiento> lstEntrenamientos;
    
    public Equipo() {

        this.lstEntrenamientos = new Hashtable<>();
    }

    

    public Equipo(String nombre, String ciudad, String nombreEstadio, String nombreEntrenador,
            Hashtable<Integer, Jugador> lstJugadores, Hashtable<Integer, Partidos> lstPartidos,
            Hashtable<Integer, Entrenamiento> lstEntrenamientos) {
                
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.nombreEstadio = nombreEstadio;
        this.nombreEntrenador = nombreEntrenador;
        this.lstJugadores = lstJugadores;
        this.lstPartidos = lstPartidos;
        this.lstEntrenamientos = lstEntrenamientos;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public Hashtable<Integer, Jugador> getLstJugadores() {
        return lstJugadores;
    }

    public void setLstJugadores(Hashtable<Integer, Jugador> lstJugadores) {
        this.lstJugadores = lstJugadores;
    }

    public Hashtable<Integer, Partidos> getLstPartidos() {
        return lstPartidos;
    }

    public void setLstPartidos(Hashtable<Integer, Partidos> lstPartidos) {
        this.lstPartidos = lstPartidos;
    }

    public Hashtable<Integer, Entrenamiento> getLstEntrenamientos() {
        return lstEntrenamientos;
    }

    public void setLstEntrenamientos(Hashtable<Integer, Entrenamiento> lstEntrenamientos) {
        this.lstEntrenamientos = lstEntrenamientos;
    }

    
    
    
    

    
    

}

