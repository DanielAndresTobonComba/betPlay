package com.betplay.Entity;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Entrenamiento {
    //id, 
    public int  idEquipo;
    public Date fecha;
    public Time hora;
    public String lugar;
    public Hashtable<Integer, Actividad> lstActividades;
    public Hashtable<Integer, Jugador> lstJugadoresConvocados;

    

    public Entrenamiento() {

        this.lstActividades = new Hashtable<>();
        this.lstJugadoresConvocados = new Hashtable<>();
    }



    public Entrenamiento(int idEquipo, Date fecha, Time hora, String lugar,
            Hashtable<Integer, Actividad> lstActividades, Hashtable<Integer, Jugador> lstJugadoresConvocados) {

        this.idEquipo = idEquipo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.lstActividades = lstActividades;
        this.lstJugadoresConvocados = lstJugadoresConvocados;
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



    public Hashtable<Integer, Actividad> getLstActividades() {
        return lstActividades;
    }



    public void setLstActividades(Hashtable<Integer, Actividad> lstActividades) {
        this.lstActividades = lstActividades;
    }



    public Hashtable<Integer, Jugador> getLstJugadoresConvocados() {
        return lstJugadoresConvocados;
    }



    public void setLstJugadoresConvocados(Hashtable<Integer, Jugador> lstJugadoresConvocados) {
        this.lstJugadoresConvocados = lstJugadoresConvocados;
    }



    @Override
    public String toString() {
        return "Entrenamiento [idEquipo=" + idEquipo + ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar
                + ", getLstActividades()=" + getLstActividades() + ", getLstJugadoresConvocados()="
                + getLstJugadoresConvocados() + "]";
    }

    

   

    
    

}
