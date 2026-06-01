/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author amara
 */
public class Main {

    public static void main(String[] args){
        Carro carroOriginal = new Carro("Civic", "Preto", 2024);
        
        Carro carroClone = (Carro) carroOriginal.clone();
        carroClone.setCor("Branco");
        
        System.out.println("Original: ");
        System.out.println(carroOriginal);
        
        System.out.println("\nClone: ");
        System.out.println(carroClone);
    }
}
