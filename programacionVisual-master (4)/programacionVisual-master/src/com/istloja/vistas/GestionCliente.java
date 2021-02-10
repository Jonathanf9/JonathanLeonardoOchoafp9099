/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.vistas;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class GestionCliente extends JFrame {

    private JPanel panelTitulo = new JPanel();
    private JPanel panelcuerpo = new JPanel();
    private JPanel panelbotones = new JPanel();

    public GestionCliente() {
        //Mostrar Pantalla
        this.show();
        //Titulo de la venta
        this.setTitle("Ventana");
        //Tamanio Inicial de la venta
        this.setSize(400, 600);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        //Se agregar un layout distribuir los componentes.
        panelTitulo.setLayout(new FlowLayout());

        JLabel label = new JLabel(" REGISTRO DE CLIENTES.");
        /*/JButton button = new JButton();  
        
        button.setText("REGISTRAR CLIENTES");  
/*/
        JTextField txtDato = new JTextField("Digitar Datos Clientes");

        panelTitulo.add(label);
        // panel.add(button);
        panel.add(txtDato);
        //Agrege el panel al Jframe
        panel.add(panelTitulo);
        panelcuerpo.setLayout(new GridLayout(6, 2));
        panelcuerpo.add(new JLabel("Nombres:"));
        panelcuerpo.add(new JTextField("Jonathan Leonardo"));
        panelcuerpo.add(new JLabel("Apellidos:"));
        panelcuerpo.add(new JTextField("Ochoa"));
        panelcuerpo.add(new JLabel("Direccion:"));
        panelcuerpo.add(new JTextField("av Calera baja"));
        panelcuerpo.add(new JLabel("Correo:"));
        panelcuerpo.add(new JTextField("jlochoa@tecnologicoloja.edu.ec"));
        panelcuerpo.add(new JLabel("Cedula:"));
        panelcuerpo.add(new JTextField("1150205999"));
        panelcuerpo.add(new JLabel("Telefono:"));
        panelcuerpo.add(new JTextField("297343"));
        panel.add(panelcuerpo);
        //JButton button = new JButton();
        //panel.add(button);
        panelbotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelbotones.add(new JButton("Agregar"));
        panelbotones.add(new JButton("Editar"));
        panelbotones.add(new JButton("Eliminar"));
        panelbotones.add(new JButton("Presentar ultimo registro"));
        panel.add(panelbotones);

        this.add(panel);
        //centra la pantalla
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(360, 450));
        //Fin al programa.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
