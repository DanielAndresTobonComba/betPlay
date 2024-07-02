package com.betplay.Entity;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    //private int id;
    public String nombre, email, contraseña, idRol;
    private List<Integer> permisosDenegados;

    public Usuario() {
    }
    
    public Usuario(/*int id,*/ String nombre, String email, String contraseña, String idRol) {
        //this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.idRol = idRol;
        permisosDenegados = new ArrayList<>();
    }

    /*public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return idRol;
    }

    public void setRol(String idRol) {
        this.idRol = idRol;
    }

    

}
