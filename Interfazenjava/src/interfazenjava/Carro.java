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
public class Carro implements Rueda, Motor {

    public Carro() {

    }

    public void avanzar() {

        System.out.println("El carro avanza");
        System.out.println("\n");

    }

    public void detenerse() {
        System.out.println("El carro se avanza");
        System.out.println("\n");

    }

    public void tipodemotor() {
        System.out.println(" El carro camaro tiene un motor " + " 2.0 turbo de 275 CV , version Zl1");
        System.out.println("\n");

    }

}
