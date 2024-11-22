package com.mycompany.blackjack;

public class jugador extends participante{

    public jugador(String nombre, String mano, double puntuacion) {
        super(nombre, mano, puntuacion);
    }
 
    public void tomarCarta(){
        
    }
    
    public void hablar(){
        System.out.println("PAn");
    }
    
}
