package com.betplay.Entity;

import java.util.ArrayList;
import java.util.List;

public class Rol {

    //private int id;
    public String nombre;
    public List<Permiso> lstPermisos ;

    public Rol () {
        lstPermisos = new ArrayList<>();
    }

    public Rol(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Permiso> getLstPermisos() {
        return lstPermisos;
    }

    public void setLstPermisos(List<Permiso> lstPermisos) {
        this.lstPermisos = lstPermisos;
    }

    

    

}

