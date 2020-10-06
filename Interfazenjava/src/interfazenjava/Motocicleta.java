/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazenjava;

/**
 *
 * @author jonathan fb
 */
public class Motocicleta implements Rueda, Motor {

    public Motocicleta() {
    }

    public void avanzar() {

        System.out.println("La Motocicleta sigue");
        System.out.println("\n");

    }

    public void detenerse() {

        System.out.println("La Motocicleta la detiene");
        System.out.println("\n");

    }

    @Override
    public void tipodemotor() {
        System.out.println("La motocicleta Kawasaki tiene" + "motor 250cc");
        System.out.println("\n");
    }

}
