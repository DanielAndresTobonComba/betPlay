package com.betplay.Entity;

import org.w3c.dom.Text;

public class Actividad {

    private int id;
    private Text descripcion;
    private int duracion;
    
    public Actividad() {
    }

    

    public Actividad(int id, Text descripcion, int duracion) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Text getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Text descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    

}

