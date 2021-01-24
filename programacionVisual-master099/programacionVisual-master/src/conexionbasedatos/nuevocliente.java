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
 * @author Lenovo
 */
public class nuevocliente {

    public boolean crearcliente(clientes Clientes) {
        boolean reguistrar = false;
        Connection con = null;
        Statement stm = null;
String sql = "INSERT INTO clientes (`Nombre`, `Apellido`, `Referencia`, `Domicilio`, `Pais`, `Correo` ,`Cedula`, `Telefono`, `EstadoCivil`,`Edad`,`Sexo` ) VALUES ('" + Clientes.getNombre()+ "', '" + Clientes.getApellido()+ "', '" + Clientes.getReferencia() + "', '" + Clientes.getDomicilio() + "', '" + Clientes.getPais() + "', '" + Clientes.getCorreo() + "', '" + Clientes.getCedula() + "', '" + Clientes.getTelefono() +"', '" + Clientes.getEstadoCivil() + "', '" + Clientes.getEdad() + "', '" + Clientes.getSexo() + "')";
      
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
