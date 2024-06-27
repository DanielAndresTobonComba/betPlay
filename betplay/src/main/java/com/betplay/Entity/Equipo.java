package com.betplay.Entity;

import java.util.ArrayList;

public class Equipo {

    private int id;
    private int nombre;
    private String ciudad; 
    private int idEstadio;
    private int idEntrenador;
    
    // Podrian ser listas de objetos?
    private ArrayList<Integer> lstEntrenadores = new ArrayList<>();
    private ArrayList<Integer> lstJugadores = new ArrayList<>();
    private ArrayList<Integer> lstPartidos = new ArrayList<>();

    
    

}

