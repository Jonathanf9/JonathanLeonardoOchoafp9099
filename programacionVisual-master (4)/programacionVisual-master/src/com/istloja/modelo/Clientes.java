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
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Correo;
    private String Telefono;

    public Clientes(int idCliente, String Cedula, String Nombre, String Apellido, String Direccion, String Correo, String Telefono) {
        this.idCliente = idCliente;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
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
        return Cedula;
    }

    public void setCedula(String cedula) {
        this.Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellidos() {
        return Apellido;
    }

    public void setApellidos(String apellidos) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" + "cedula=" + Cedula + ", nombre=" + Nombre + ", apellidos=" + Apellido + ", direccion=" + Direccion + ", correo=" + Correo + ", telefono=" + Telefono + '}';
    }

    
    
    
    
}
