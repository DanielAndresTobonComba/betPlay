package com.betplay.Entity;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Partidos {

    private int id;
    private int idEquipoLocal;
    private int idEquipoVisitante;
    public int golesVisitante;
    public int golesLocal;
    private Date fecha;
    private Time hora;
    private int idEstadio;

    // Puede ser goles del local y otra lista goles del visitante? a su vez listas de objetos?
    private ArrayList<Gol> lstGoles = new ArrayList<>();

    // Puede ser una lista de objetos?
    private ArrayList<Integer> lstTarjetas = new ArrayList<>();

    // Lst objetos?
    private ArrayList<Integer> lstIncidentes = new ArrayList<>();

    private String resultado;

}
