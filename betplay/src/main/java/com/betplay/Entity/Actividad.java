package com.betplay.Entity;

import org.w3c.dom.Text;

public class Actividad {

    //public int id;
    public Text descripcion;
    public int duracion;
    
    public Actividad() {
    }

    

    public Actividad( Text descripcion, int duracion) {
        //this.id = id;
        this.descripcion = descripcion;
        this.duracion = duracion;
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

