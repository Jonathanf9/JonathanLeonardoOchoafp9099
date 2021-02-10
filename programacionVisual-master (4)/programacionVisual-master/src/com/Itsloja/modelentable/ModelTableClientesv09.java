/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Itsloja.modelentable;

import com.Itsloja.modelentable.*;
import com.istloja.modelo.Clientes;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jonathanfb
 */
public class ModelTableClientesv09 extends AbstractTableModel {

    public String[] mcolNames = {"Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Telefono"};
    public List<Clientes> clientes;

    public ModelTableClientesv09(List<Clientes> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return mcolNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clientes cliente = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cliente.getCedula();
            case 1:
                return cliente.getNombre();
            case 2:
                return cliente.getApellidos();
            case 3:
                return cliente.getDireccion();
            case 4:
                return cliente.getCorreo();
            case 5:
                return cliente.getTelefono();

        }
        return new String();
    }

    @Override
    public String getColumnName(int column) {
        return mcolNames[column];
    }
}
/*/
    public String[] mcolNames = {"Cedula", "Nombre", "Apellido", "Direccion", "Correo", "Telefono"};
    public List<Clientes> clientes;
    private Registrarelcliente RegistrarClientes09;
    private GestionContable gestioncontableentrada;

    public ModelTableClientes(List<Clientes> clientes, GestionContable gestioncontable) {
        this.clientes = clientes;
        this.gestioncontableentrada = gestioncontableentrada;

    }

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return mcolNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clientes registrar = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return registrar.getCedula();
            case 1:
                return registrar.getNombre();
            case 2:
                return registrar.getApellidos();
            case 3:
                return registrar.getDireccion();
            case 4:
                return registrar.getCorreo();
            case 5:
                return registrar.getTelefono();
        }
        System.out.println("Selec Clientes?" + registrar.toString());

        return new String();

    }

    @Override
    public String getColumnName(int column) {
        return mcolNames[column]; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        gestioncontableentrada.(clientes.get(rowIndex));
        return super.isCellEditable(rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    /*/
