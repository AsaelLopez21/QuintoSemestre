package com.mycompany.blackjack;

public class Participante {
    protected Carta[] mano;
    protected String nombre;
    protected int cartasEnMano;
    
    public Participante(String nombre){
        this.nombre = nombre;
        this.mano = new Carta[11];
        this.cartasEnMano = 0;
    }
    
    public void recibirCarta(Carta carta){
        if(cartasEnMano < mano.length && carta != null){
            mano[cartasEnMano++] = carta;
        }
    }
    
    public int calcularPunuacion(){
        int puntuacion = 0;
        for(int i=0;i<cartasEnMano;i++){
            if(mano[i] != null){
                puntuacion += mano[i].getValorNumerico();
            }
            
        }
        return puntuacion;
    }
    public boolean quieroCarta(){
        return false;
    };

    public Carta[] getMano() {
        return mano;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCartasEnMano() {
        return cartasEnMano;
    }
    
    
}
