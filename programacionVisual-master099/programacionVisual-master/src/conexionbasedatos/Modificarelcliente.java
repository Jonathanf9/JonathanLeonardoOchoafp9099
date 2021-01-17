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
public class Modificarelcliente {
    
    public boolean editarcliente(clientes cliente,int idClientes){
       
     boolean reguistrar = false;
        Connection con = null;
        Statement stm = null;

        String sql =   "UPDATE clientes SET Nombre = '" + cliente.getNombre()+"', Apellido = '" + cliente.getApellido()+ "', Referencia = '" + cliente.getReferencia()+"', Domicilio = '" + cliente.getDomicilio()+"', Pais = '" + cliente.getPais()+"', Correo = '" + cliente.getCorreo()+"', Cedula = '"  +cliente.getCedula()+"', Telefono = '"  +cliente.getTelefono()+"', EstadoCivil = '"  +cliente.getEstadoCivil()+"', Edad = '" +cliente.getEdad()+"', Sexo = '" +cliente.getSexo()+     "' WHERE idClientes = '" + idClientes + "'";

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