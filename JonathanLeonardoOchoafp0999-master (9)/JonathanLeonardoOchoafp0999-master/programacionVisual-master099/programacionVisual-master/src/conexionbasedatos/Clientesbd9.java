/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import java.sql.Connection;
import java.sql.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johnp
 */
public class Clientesbd9 {

    // Registrar persona en la base de datos.
    public boolean crearcliente(clientes Clientes) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos.
        Connection con = null;
        //INSERT INTO `ejercicio`.`persona` (`idpersona`, `cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`) VALUES ('1', '1104268899', 'John', 'Solano', 'Loja', 'jpsolanoc@gmail.com', '072587392');
        String sql = "INSERT INTO clientes (`Nombre`, `Apellido`, `Referencia`, `Domicilio`, `Pais`, `Correo` ,`Cedula`, `Telefono`, `EstadoCivil`,`Edad`,`Sexo` ) VALUES ('" + Clientes.getNombre() + "', '" + Clientes.getApellido() + "', '" + Clientes.getReferencia() + "', '" + Clientes.getDomicilio() + "', '" + Clientes.getPais() + "', '" + Clientes.getCorreo() + "', '" + Clientes.getCedula() + "', '" + Clientes.getTelefono() + "', '" + Clientes.getEstadoCivil() + "', '" + Clientes.getEdad() + "', '" + Clientes.getSexo() + "')";
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
    public boolean editarcliente(clientes Clientes) {
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "UPDATE `bdejercicio1`.`clientes` SET `Cedula` = '" + Clientes.getCedula() + "', `Nombre` = '" + Clientes.getNombre() + "', `Apellido` = '" + Clientes.getApellido() + "', `Referencia` = '" + Clientes.getReferencia() + "', `Correo` = '" + Clientes.getCorreo() + "', `Telefono` = '" + Clientes.getTelefono() + "', `Domicilio` = '" + Clientes.getDomicilio() + "', `Pais` = '" + Clientes.getPais() + "', `EstadoCivil` = '" + Clientes.getEstadoCivil() + "', `Edad` = '" + Clientes.getEdad() + "', `Sexo` = '" + Clientes.getSexo() + "' WHERE (`idPersona` = '" + Clientes.getIdClientes() + "');";

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
    public boolean quitarclinete(clientes Clientes) {
        Connection connect = null;
        Statement stm = null;
        boolean registrar = false;
        String sql = "DELETE FROM clientes WHERE idClientes=" +String.valueOf(Clientes.getIdClientes());
        try {
            connect = new Conexion().conectarBaseDatos();
            stm = connect.createStatement();
            stm.execute(sql);
            registrar= true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }

    //Sirve para traer todos los registros de persona de la base de datos 
    public List<clientes> obtenerclientes() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejercicio1.clientes;";
        List<clientes> listaclientes = new ArrayList<clientes>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                clientes c = new clientes();
                c.setIdClientes(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setReferencia(rs.getString(4));
                c.setDomicilio(rs.getString(5));
                c.setPais(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setCedula(rs.getString(8));
                c.setTelefono(rs.getString(9));
                c.setEstadoCivil(rs.getString(10));
                c.setEdad(rs.getString(11));
                c.setSexo(rs.getString(12));
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
    public clientes getclienteCedula(String Cedula) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        clientes c = null;

        String sql = "SELECT * FROM bdejercicio1.clientes where Cedula like " + Cedula + ";";

        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new clientes();
                c.setIdClientes(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setReferencia(rs.getString(4));
                c.setDomicilio(rs.getString(5));
                c.setPais(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setCedula(rs.getString(8));
                c.setTelefono(rs.getString(9));
                c.setEstadoCivil(rs.getString(10));
                c.setEdad(rs.getString(11));
                c.setSexo(rs.getString(12));
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return c;
    }

    public clientes getclientescelular(String Telefono) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        clientes c = null;
        String sql = "SELECT * FROM bdejercicio1.clientes where Telefono like " + Telefono + ";";
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                c = new clientes();
                c.setIdClientes(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setReferencia(rs.getString(4));
                c.setDomicilio(rs.getString(5));
                c.setPais(rs.getString(6));
                c.setCorreo(rs.getString(7));
                c.setCedula(rs.getString(8));
                c.setTelefono(rs.getString(9));
                c.setEstadoCivil(rs.getString(10));
                c.setEdad(rs.getString(11));
                c.setSexo(rs.getString(12));
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
