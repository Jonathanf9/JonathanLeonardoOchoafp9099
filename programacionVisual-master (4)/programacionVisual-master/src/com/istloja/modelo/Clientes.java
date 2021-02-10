/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

/**
 *
 * @author johnp
 */
public class Clientes {
    
    private int idCliente;
    private String cedula;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String correo;
    private String telefono;

    public Clientes(int idCliente, String cedula, String nombre, String apellidos, String direccion, String correo, String telefono) {
        this.idCliente = idCliente;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    

    public Clientes() {
    }

    public Clientes(int idCliente) {
        this.idCliente= idCliente;
    }

    
    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }

    
    
    
    
}
