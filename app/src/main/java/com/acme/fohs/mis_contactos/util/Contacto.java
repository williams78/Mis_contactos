package com.acme.fohs.mis_contactos.util;

/**
 * Created by fohs11691 on 20/04/2016.
 */
public class Contacto {

    private String nombre, telefono, correo, direccion;

    public Contacto(String nombre, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    //<editor-fold desc="GETTERS METHODS">
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }
    //</editor-fold>


    //<editor-fold desc="SETTERS METHOD">
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //</editor-fold>


}
