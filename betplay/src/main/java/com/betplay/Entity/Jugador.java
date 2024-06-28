package com.betplay.Entity;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    //private int id; 
    public int edad, numCamiseta, idEquipo;
    public String nombre, posicion, nacionalidad, estado;
    
     // Podria ser una lista de objetos ?
    public List<Lesion> lstLesiones; 
    public List<Rendimiento> lstRendimientos;

    public Jugador () {
        lstLesiones = new ArrayList<>();
        lstRendimientos = new ArrayList<>();
    }

    public Jugador(int edad, int numCamiseta, int idEquipo, String nombre, String posicion, String nacionalidad,
            String estado) {
        this.edad = edad;
        this.numCamiseta = numCamiseta;
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.estado = estado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Lesion> getLstLesiones() {
        return lstLesiones;
    }

    public void setLstLesiones(List<Lesion> lstLesiones) {
        this.lstLesiones = lstLesiones;
    }

    public List<Rendimiento> getLstRendimientos() {
        return lstRendimientos;
    }

    public void setLstRendimientos(List<Rendimiento> lstRendimientos) {
        this.lstRendimientos = lstRendimientos;
    }

    

    

}

