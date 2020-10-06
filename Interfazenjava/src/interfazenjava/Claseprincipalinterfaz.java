/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazenjava;

import java.util.ArrayList;

/**
 *
 * @author jonathanfb
 */
public class Claseprincipalinterfaz {

    public static void main(String[] args) {

        Carro Camaro = new Carro();
        Camaro.avanzar();
        Camaro.detenerse();
        Camaro.tipodemotor();

        Motocicleta Kawasaki = new Motocicleta();
        Kawasaki.avanzar();
        Kawasaki.detenerse();
        Kawasaki.tipodemotor();

        Bicicleta Atherthon = new Bicicleta();
        Atherthon.avanzar();
        Atherthon.detenerse();
        Atherthon.tipodemotor();

        ArrayList<Rueda> Ruedas = new ArrayList<Rueda>();
        Ruedas.add(Camaro);
        Ruedas.add(Kawasaki);
        Ruedas.add(Atherthon);

        for (Rueda rueda : Ruedas) {
            rueda.avanzar();
            rueda.detenerse();
            
            
           /*
            
           
            ArrayList<Motor> Motores = new ArrayList<Motor>();
            Ruedas.add(Camaro);
            Ruedas.add(Kawasaki);
            Ruedas.add(Atherthon);

            for (Motor motor : Motores) {
                motor.tipodemotor();
           */
            }

        }
}