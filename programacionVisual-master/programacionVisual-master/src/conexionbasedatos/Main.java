/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import javax.swing.JOptionPane;

/**
 *
 * @author jonathanfb
 */
public class Main {

    public static void main(String[] args) {
        clientes llamar = new clientes();

        llamar.setIdClientes(2);
        llamar.setNombre("Jonathan Leonardo");
        llamar.setApellido("Ochoa");
        llamar.setReferencia("A una cuadra de la Quinta Bachita");
        llamar.setDomicilio("Loja");
        llamar.setPais("Ecuador");
        llamar.setCorreo("jlochoa@tecnologicoloja.edu.ec");
        llamar.setCedula("1150205969");
        llamar.setTelefono("658686789");
        llamar.setEstadoCivil("Soltero");
        llamar.setEdad("21");
        llamar.setSexo("Masculino");

        nuevocliente cliente = new nuevocliente();

        if (cliente.crearcliente(llamar)) {

            JOptionPane.showMessageDialog(null, "Cliente Guardado ");

        } else {
            JOptionPane.showMessageDialog(null, "Error al querer Guardar Cliente ");
            /*/
       }
        EliminarelCliente Cliente = new EliminarelCliente();
        
          
        if (Cliente.quitarclinete(2)) {

            JOptionPane.showMessageDialog(null, "Cliente Guardado ");

        } else {
            JOptionPane.showMessageDialog(null, "Error al querer Guardar Cliente ");
        /*/
        }
    }
}
/*/
        Modificarelcliente Clientes = new Modificarelcliente();

        if (Clientes.editarcliente(llamar, 2)) {

            JOptionPane.showMessageDialog(null, " El cliente se edito ");

        } else {

            JOptionPane.showMessageDialog(null, "Error al querer modificar Cliente ");
        }
    }*/
