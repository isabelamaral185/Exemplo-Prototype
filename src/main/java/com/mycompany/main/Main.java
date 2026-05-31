/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author amara
 */
public class Main {

    public static void main(String[] args) {
        CarroPrototipo prototypeCar = (CarroPrototipo) new Carro("Sedan", "Preto", 2022);

        CarroPrototipo car1 = prototypeCar.clone();
        ((Carro) car1).setCor("Vermelho");

        CarroPrototipo car2 = prototypeCar.clone();
        ((Carro) car2).setAno(2023);

        System.out.println("Carro 1: " + car1.toString());
        System.out.println("Carro 2: " + car2.toString());
    }
}
