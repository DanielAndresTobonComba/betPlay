package com.betplay.Entity;

import org.w3c.dom.Text;

public class Incidente {

    //Los incidentes se guardarán dentro de una lista del controlador    
    //private int id;
    public int idPartido, minuto;
    public Text descripcion;
    

    
    public Incidente() {}

    public Incidente(/*int id, */int idPartido, Text descripcion, int minuto) {
        //this.id = id;
        this.idPartido = idPartido;
        this.descripcion = descripcion;
        this.minuto = minuto;
    }

    /*public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }*/
    
    public int getIdPartido() {
        return idPartido;
    }
    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }
    public Text getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(Text descripcion) {
        this.descripcion = descripcion;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    
}
