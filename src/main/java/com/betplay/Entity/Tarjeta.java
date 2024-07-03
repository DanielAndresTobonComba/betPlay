package com.betplay.Entity;

public class Tarjeta {

    //Las tarjetas serán puestas en una lista dentro del controlador
    public int id, idJugador, idPartido, minuto;
    public String tipoTarjeta;

    public Tarjeta() {}

    public Tarjeta(int id, int idJugador, int idPartido, String tipoTarjeta, int minuto) {
        this.id = id;
        this.idJugador = idJugador;
        this.idPartido = idPartido;
        this.tipoTarjeta = tipoTarjeta;
        this.minuto = minuto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    

    

}
