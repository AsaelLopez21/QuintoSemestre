/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

/**
 *
 * @author alumnos
 */
public class Carta {
    private String palo;
    private String numero;
    
    public Carta(String palo,String numero){
        this.palo = palo;
        this.numero = numero;
    }
    
    public String mostrarValor(){
        return numero +" "+palo;
    }
    public String getNumeroCarta(){
        return this.numero;
    }
    
}
