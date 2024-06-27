package com.betplay.Entity;

import java.util.Date;

public class Patrocinador {

    private int id; 
    private String nombre;
    private String tipoPatrocinio;
    private float monto;
    private Date fechaInicio;
    private Date fechafin;
    public Patrocinador() {
    }
    public Patrocinador(int id, String nombre, String tipoPatrocinio, float monto, Date fechaInicio, Date fechafin) {
        this.id = id;
        this.nombre = nombre;
        this.tipoPatrocinio = tipoPatrocinio;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoPatrocinio() {
        return tipoPatrocinio;
    }
    public void setTipoPatrocinio(String tipoPatrocinio) {
        this.tipoPatrocinio = tipoPatrocinio;
    }
    public float getMonto() {
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechafin() {
        return fechafin;
    }
    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    
    
}
