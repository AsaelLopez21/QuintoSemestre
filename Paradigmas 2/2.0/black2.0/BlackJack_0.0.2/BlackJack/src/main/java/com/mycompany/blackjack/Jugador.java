package com.mycompany.blackjack;

public class Jugador extends Participante{
    private String estado;
    public Jugador(String nombre) {
        super(nombre);
        this.estado = "Jugando";
    }
    
    @Override
    public boolean quieroCarta(){
        return true;
    }
    
    public void setEstado(){
        this.estado = "no jugando";
    }
    
    public String getEstado(){
        return this.estado;
    }
}
