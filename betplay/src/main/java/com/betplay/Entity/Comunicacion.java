package com.betplay.Entity;

import java.util.ArrayList;
import java.util.Date;

import org.w3c.dom.Text;

public class Comunicacion {

    private int id;
    private String titulo;
    private Text contenido;
    private Date fechaPublicacion;
    private ArrayList<Integer> lstDestinatarios = new ArrayList<>();

}
