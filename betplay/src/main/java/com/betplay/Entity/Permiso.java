package com.betplay.Entity;

import org.w3c.dom.Text;

public class Permiso {

    private int id;
    private Text descripcion;
    public Permiso() {
    }

    

    public Permiso(int id, Text descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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

    
    

}
