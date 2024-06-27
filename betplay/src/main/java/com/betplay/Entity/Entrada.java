package com.betplay.Entity;

import java.util.Date;

public class Entrada {

    private int id; 
    private int idPartido;
    private int idComprador;
    private Date fechaCompra;
    private int cantidadEntrada;
    private float precioTotal;

    //Misma ubicacion para todas las entradas?
    private String ubicacion;

    public Entrada() {
    }

    public Entrada(int id, int idPartido, int idComprador, Date fechaCompra, int cantidadEntrada, float precioTotal,
            String ubicacion) {
        this.id = id;
        this.idPartido = idPartido;
        this.idComprador = idComprador;
        this.fechaCompra = fechaCompra;
        this.cantidadEntrada = cantidadEntrada;
        this.precioTotal = precioTotal;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
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
