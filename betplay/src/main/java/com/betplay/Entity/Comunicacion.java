package com.betplay.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.w3c.dom.Text;

public class Comunicacion {

    //private int id;
    private String titulo;
    private String contenido;
    private Date fechaPublicacion;
    private List<Integer> lstDestinatarios;

    public Comunicacion() {
        lstDestinatarios = new ArrayList<>();
    }

    

    public Comunicacion(String titulo, String contenido, Date fechaPublicacion, List<Integer> lstDestinatarios) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.lstDestinatarios = lstDestinatarios;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public List<Integer> getLstDestinatarios() {
        return lstDestinatarios;
    }

    public void setLstDestinatarios(List<Integer> lstDestinatarios) {
        this.lstDestinatarios = lstDestinatarios;
    }
   
    
    

}
