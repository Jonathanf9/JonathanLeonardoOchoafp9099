/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;

import com.istloja.modelo.Clientes;
import java.sql.Connection;
import java.sql.Statement;
import com.istloja.conexionbd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johnp
 */
public class Clientebd {

    // Registrar persona en la base de datos.
    public boolean registrarCliente(Clientes clientes) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos.
        Connection con = null;
        //INSERT INTO `ejercicio`.`persona` (`idpersona`, `cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`) VALUES ('1', '1104268899', 'John', 'Solano', 'Loja', 'jpsolanoc@gmail.com', '072587392');
        String sql = "INSERT INTO `bdejercicio1`.`clientesproyecto09` (`idCliente`, `Cedula`, `Nombre`, `Apellido`, `Direccion`, `Correo`, `Telefono`) VALUES('" + String.valueOf(clientes.getIdCliente()) + "', '" + clientes.getCedula() + "', '" + clientes.getNombre() + "', '" + clientes.getApellidos() + "', '" + clientes.getDireccion() + "', '" + clientes.getCorreo() + "', '" + clientes.getTelefono() + "');";
        try {
            //Es una instancia de la conexion previamente creada.
            Conexion conexion = new Conexion();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }

    //ACtualizar la persona e la base de datos.
    public boolean actualizar(Clientes clientes) {
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "UPDATE `bdejercicio1`.`clientesproyecto09` SET `Cedula` = '" + clientes.getCedula() + "', `Nombre` = '" + clientes.getNombre() + "', `Apellido` = '" + clientes.getApellidos() + "', `Direccion` = '" + clientes.getDireccion() + "', `Correo` = '" + clientes.getCorreo() + "', `Telefono` = '" + clientes.getTelefono() + "' WHERE (`idCliente` = '" + clientes.getIdCliente() + "');";
        try {
            Conexion con = new Conexion();
            connect = con.conectarBaseDatos();
            //Puente entre la conexion y el codigo
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }

    //Eliminar una persona en base al ID de la persona seleccionada de la base de datos.
    public boolean eliminar(Clientes clientes) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `bdejercicio1`.`clientesproyecto09` WHERE (`idCliente` = '" + String.valueOf(clientes.getIdCliente()) + "');";
        try {
            connect = new Conexion().conectarBaseDatos();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }

    //Sirve para traer todos los registros de persona de la base de datos 
    public List<Clientes> obtenerClientes() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.clientesproyecto09;";
        List<Clientes> listaclientes = new ArrayList<Clientes>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Clientes c = new Clientes();
                c.setIdCliente(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
                listaclientes.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return listaclientes;
    }

    //Metodo para buscar una persona por cedula
    public Clientes getClientesCedula(String Cedula) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        Clientes c = null;
        String sql = "SELECT * FROM bdejercicio1.clientesproyecto09 where cedula like " + Cedula + ";";
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new Clientes();
                c.setIdCliente(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }

    public Clientes getclientescelular(String Telefono) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        Clientes c = null;
        String sql = "SELECT * FROM bdejercicio1.clientesproyecto09 where Telefono like " + Telefono + ";";
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {

                c = new Clientes();
                c.setIdCliente(rs.getInt(1));
                c.setCedula(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApellidos(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCorreo(rs.getString(6));
                c.setTelefono(rs.getString(7));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }

}
