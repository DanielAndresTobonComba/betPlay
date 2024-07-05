package com.betplay.Entity;

import java.util.Date;

public class Transferencia {

    //private int id;
    public int idJugador, idEquipoOrigen, idEquipoDestino;
    public float monto;
    public String tipoTransferencia;
    public Date fechaTransferencia;

    public Transferencia() {}

    public Transferencia(int idJugador, int idEquipoOrigen, int idEquipoDestino, float monto, String tipoTransferencia,
            Date fechaTransferencia) {
        this.idJugador = idJugador;
        this.idEquipoOrigen = idEquipoOrigen;
        this.idEquipoDestino = idEquipoDestino;
        this.monto = monto;
        this.tipoTransferencia = tipoTransferencia;
        this.fechaTransferencia = fechaTransferencia;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public int getIdEquipoOrigen() {
        return idEquipoOrigen;
    }

    public void setIdEquipoOrigen(int idEquipoOrigen) {
        this.idEquipoOrigen = idEquipoOrigen;
    }

    public int getIdEquipoDestino() {
        return idEquipoDestino;
    }

    public void setIdEquipoDestino(int idEquipoDestino) {
        this.idEquipoDestino = idEquipoDestino;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getTipoTransferencia() {
        return tipoTransferencia;
    }

    public void setTipoTransferencia(String tipoTransferencia) {
        this.tipoTransferencia = tipoTransferencia;
    }

    public Date getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(Date fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }
    
    

}
