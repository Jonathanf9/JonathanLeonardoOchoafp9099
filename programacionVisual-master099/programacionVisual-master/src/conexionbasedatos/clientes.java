/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

/**
 *
 * @author jonathanfb
 */
public class clientes {

    private int idClientes;
    private String Nombre;
    private String Apellido;
    private String Referencia;
    private String Domicilio;

    public clientes(String Nombre, String Apellido, String Referencia, String Correo, String Cedula, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Referencia = Referencia;
        this.Correo = Correo;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
    }
    private String Pais;
    private String Correo;
    private String Cedula;
    private String Telefono;
    private String EstadoCivil;
    private String Edad;
    private String Sexo;

    public clientes(int idClientes, String Nombre, String Apellido, String Referencia, String Domicilio, String Pais, String Correo, String Cedula, String Telefono, String EstadoCivil, String Edad, String Sexo) {
        this.idClientes = idClientes;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Referencia = Referencia;
        this.Domicilio = Domicilio;
        this.Pais = Pais;
        this.Correo = Correo;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.EstadoCivil = EstadoCivil;
        this.Edad = Edad;
        this.Sexo = Sexo;
}
    
    
      public clientes() {
    }

    public clientes(int idclientes) {
        this.idClientes = idClientes;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }
   @Override
    public String toString() {
        return "clientes{" + "idClientes=" + idClientes + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Referencia=" + Referencia + ", Domicilio=" + Domicilio + ", Pais=" + Pais + ", Correo=" + Correo +", Cedula=" + Cedula + ", Telefono=" + Telefono + ", EstadoCivil=" + EstadoCivil +", Edad=" + Edad + ", Sexo=" + Sexo +'}';  

}

}

