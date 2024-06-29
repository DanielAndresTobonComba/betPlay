package com.betplay.Entity;

public class Usuario {

    //private int id;
    private String nombre, email, contraseña;
    private int idRol;

    public Usuario() {
    }
    
    public Usuario(/*int id,*/ String nombre, String email, String contraseña, int idRol) {
        //this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.idRol = idRol;
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

    public int getRol() {
        return idRol;
    }

    public void setRol(int idRol) {
        this.idRol = idRol;
    }

    

}
