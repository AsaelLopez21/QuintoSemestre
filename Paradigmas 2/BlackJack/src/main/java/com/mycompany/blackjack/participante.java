package com.mycompany.blackjack;


public class participante {
    private String nombre;
    private Carta[] mano;
    private double puntuacion;

    public participante(String nombre, Carta[] mano, double puntuacion) {
        this.nombre = nombre;
        this.mano = mano;
        this.puntuacion = puntuacion;
    }

    
    
    public double calcularPuntuacion(){
        
        return 6.5;
    }
    
    
}
