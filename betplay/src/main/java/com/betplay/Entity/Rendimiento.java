package com.betplay.Entity;

public class Rendimiento {

    // Podríamos contemplar la posibilidad de almacenar los rendimientos en una lista
    //private int id;
    public int idJugador, idPartido, minutosJugados, goles, asistencias, tarjetasAmarillas, tarjetasRojas;

    public Rendimiento() {

    }

    public Rendimiento(/*int id,*/ int idJugador, int idPartido, int minutosJugados, int goles, int asistencias,
            int tarjetasAmarillas, int tarjetasRojas) {
        ///this.id = id;
        this.idJugador = idJugador;
        this.idPartido = idPartido;
        this.minutosJugados = minutosJugados;
        this.goles = goles;
        this.asistencias = asistencias;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
    }
    
    /*public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }*/

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
    public int getMinutosJugados() {
        return minutosJugados;
    }
    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }
    public int getGoles() {
        return goles;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }

    

}
