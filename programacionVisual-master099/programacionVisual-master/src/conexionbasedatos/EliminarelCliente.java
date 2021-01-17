/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author jonathanfb
 */
public class EliminarelCliente {
     public boolean quitarclinete(int idClientes){
       
     boolean reguistrar = false;
     
        Connection con = null;
        Statement stm = null;

        String sql =   "DELETE FROM clientes WHERE idClientes = '" + idClientes +"'";

        try {
            Conexion conexion = new Conexion();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            reguistrar = true;
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return reguistrar;
}
}

