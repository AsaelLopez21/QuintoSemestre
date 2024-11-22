/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author luisd
 */
public class CartaNumerica extends Carta{

    public CartaNumerica(String palo, String numero) {
        super(palo, numero);
    }
    
    @Override
    public int getValorNumerico() {
        return Integer.parseInt(numero);
    }
    
    
}
