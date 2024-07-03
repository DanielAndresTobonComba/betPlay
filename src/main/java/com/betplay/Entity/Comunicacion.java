package com.betplay.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.w3c.dom.Text;

public class Comunicacion {

    //private int id;
    private String titulo;
    private Text contenido;
    private Date fechaPublicacion;
    private List<Integer> lstDestinatarios;

    public Comunicacion() {
        lstDestinatarios = new ArrayList<>();
    }
    public Comunicacion(/*int id,*/ String titulo, Text contenido, Date fechaPublicacion,
            ArrayList<Integer> lstDestinatarios) {
        //this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.lstDestinatarios = lstDestinatarios;
    }
    /*public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }*/

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Text getContenido() {
        return contenido;
    }
    public void setContenido(Text contenido) {
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
