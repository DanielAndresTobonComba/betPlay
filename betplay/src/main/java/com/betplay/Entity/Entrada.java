package com.betplay.Entity;

import java.util.Date;

public class Entrada {

    //private int id; 
    public int idPartido;
    public int Comprador;
    public Date fechaCompra;
    public int cantidadEntrada;
    public float precioTotal;
    public String ubicacion;

    public Entrada() {}

    public Entrada(/*int id,*/ int idPartido, int Comprador, Date fechaCompra, int cantidadEntrada, float precioTotal,
            String ubicacion) {
        //this.id = id;
        this.idPartido = idPartido;
        this.Comprador = Comprador; //Vamos a poner el número de cédula del comprador
        this.fechaCompra = fechaCompra;
        this.cantidadEntrada = cantidadEntrada;
        this.precioTotal = precioTotal;
        this.ubicacion = ubicacion;
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

    public int getIdComprador() {
        return Comprador;
    }

    public void setIdComprador(int idComprador) {
        this.Comprador = idComprador;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidadEntrada() {
        return cantidadEntrada;
    }

    public void setCantidadEntrada(int cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
}
