/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author amara
 */
public class Carro implements Cloneable{
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    
    @Override
    public Carro clone(){
        try {
            return (Carro) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar objeto.");
        }
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro: " + " modelo = " + modelo + ", cor = " + cor + ", ano = " + ano;
    }
}
