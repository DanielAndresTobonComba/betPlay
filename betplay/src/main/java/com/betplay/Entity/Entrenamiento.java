package com.betplay.Entity;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Entrenamiento {
    //id, 
    public int  idEquipo;
    public Date fecha;
    public Time hora;
    public String lugar;
    public List<Actividad> listActividades;
    public List<Jugador> listJugadoresConvocados;

    public Entrenamiento () {
        listActividades = new ArrayList<>();
        listJugadoresConvocados = new ArrayList<>();
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Actividad> getListActividades() {
        return listActividades;
    }

    public void setListActividades(List<Actividad> listActividades) {
        this.listActividades = listActividades;
    }

    public List<Jugador> getListJugadoresConvocados() {
        return listJugadoresConvocados;
    }

    public void setListJugadoresConvocados(List<Jugador> listJugadoresConvocados) {
        this.listJugadoresConvocados = listJugadoresConvocados;
    }

    @Override
    public String toString() {
        return "Entrenamiento [idEquipo=" + idEquipo + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar
                + ", getListActividades()=" + getListActividades() + ", getListJugadoresConvocados()="
                + getListJugadoresConvocados() + "]";
    }

    

    

}
