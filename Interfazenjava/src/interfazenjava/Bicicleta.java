/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazenjava;

/**
 *
 * @author jonathanfb
 */
public class Bicicleta implements Rueda, Motor {

    public Bicicleta() {

    }

    public void avanzar() {

        System.out.println(" La Bicicleta avanza ");
        System.out.println("\n");

    }

    public void detenerse() {

        System.out.println("La Bicicleta se detiene");
        System.out.println("\n");

    }

    @Override
    public void tipodemotor() {

        System.out.println("La bicicleta tiene un moto" + " 48v14.5AH");
        System.out.println("\n");
    }

}
