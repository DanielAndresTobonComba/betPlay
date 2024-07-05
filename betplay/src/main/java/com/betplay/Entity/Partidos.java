package com.betplay.Entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partidos {

    //private int id;
    public int idEquipoLocal, idEquipoVisitante, golesVisitante, golesLocal, idEstadio;
    public Date fecha;
    public Time hora;
    public List<Gol> lstGoles;
    public List<Tarjeta> lstTarjetas;
    public List<Incidente> lstIncidentes;

    public Partidos() {
        lstGoles = new ArrayList<>();
        lstTarjetas = new ArrayList<>();
        lstIncidentes = new ArrayList<>();
    }

    public Partidos(int idEquipoLocal, int idEquipoVisitante, int golesVisitante, int golesLocal, int idEstadio,
            Date fecha, Time hora) {
        this.idEquipoLocal = idEquipoLocal;
        this.idEquipoVisitante = idEquipoVisitante;
        this.golesVisitante = golesVisitante;
        this.golesLocal = golesLocal;
        this.idEstadio = idEstadio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getIdEquipoLocal() {
        return idEquipoLocal;
    }

    public void setIdEquipoLocal(int idEquipoLocal) {
        this.idEquipoLocal = idEquipoLocal;
    }

    public int getIdEquipoVisitante() {
        return idEquipoVisitante;
    }

    public void setIdEquipoVisitante(int idEquipoVisitante) {
        this.idEquipoVisitante = idEquipoVisitante;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
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

    public List<Gol> getLstGoles() {
        return lstGoles;
    }

    public void setLstGoles(List<Gol> lstGoles) {
        this.lstGoles = lstGoles;
    }

    public List<Tarjeta> getLstTarjetas() {
        return lstTarjetas;
    }

    public void setLstTarjetas(List<Tarjeta> lstTarjetas) {
        this.lstTarjetas = lstTarjetas;
    }

    public List<Incidente> getLstIncidentes() {
        return lstIncidentes;
    }

    public void setLstIncidentes(List<Incidente> lstIncidentes) {
        this.lstIncidentes = lstIncidentes;
    };

    
    


    //private String resultado;

}
