package com.betplay.Entity;

import java.util.Date;

public class Lesion {
    // Las lesiones se guardarán en una lista dentro del controlador
    public int id, idJugador;
    public String tipoLesion, gravedad;
    public Date fechaInicio, fechaFin;

    public Lesion () {}

    public Lesion(int id, int idJugador, String tipoLesion, String gravedad, Date fechaInicio, Date fechaFin) {
        this.id = id;
        this.idJugador = idJugador;
        this.tipoLesion = tipoLesion;
        this.gravedad = gravedad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getTipoLesion() {
        return tipoLesion;
    }

    public void setTipoLesion(String tipoLesion) {
        this.tipoLesion = tipoLesion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    
}
