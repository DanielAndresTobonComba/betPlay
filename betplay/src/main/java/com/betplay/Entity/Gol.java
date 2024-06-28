package com.betplay.Entity;

public class Gol {

    //private int id;
    public int idJugador, idEquipo, minuto, idPartido;
    

    public Gol() {

    }



    public Gol(int idJugador, int idEquipo, int minuto, int idPartido) {

        this.idJugador = idJugador;
        this.idEquipo = idEquipo;
        this.minuto = minuto;
        this.idPartido = idPartido;
    }





    public int getIdJugador() {
        return idJugador;
    }


    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }


    public int getIdEquipo() {
        return idEquipo;
    }


    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }


    public int getMinuto() {
        return minuto;
    }


    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }


    public int getIdPartido() {
        return idPartido;
    }


    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    
    
    

    

}
