/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author luisd
 */
public class Crupier extends Participante{

    public Crupier() {
        super("Crupier");
    }
    
    @Override
    public boolean quieroCarta(){
        return calcularPunuacion() < 17;
    }
}
