/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Clientesbd {

    public List<clientes> obtenerclientes() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM ejercicio.persona;";
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
}
