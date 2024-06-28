package com.betplay.Entity;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    //private int id;
    public String nombre, ciudad, nombreEstadio, nombreEntrenador;
    
    /*COMENTARIO: Se decide no incluir Lista de entrenadores; más bien se establece el nombre del entrenador como atributo
    
    */
    // Podrian ser listas de objetos?
    //public List<String> lstEntrenadores;
    public List<Jugador> lstJugadores;
    public List<Partidos> lstPartidos;
    

    public   Equipo () {
        lstJugadores = new ArrayList<>();
        lstPartidos = new ArrayList<>();
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


    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }


    public void setLstJugadores(List<Jugador> lstJugadores) {
        this.lstJugadores = lstJugadores;
    }


    public List<Partidos> getLstPartidos() {
        return lstPartidos;
    }


    public void setLstPartidos(List<Partidos> lstPartidos) {
        this.lstPartidos = lstPartidos;
    }

    

    
    

}

