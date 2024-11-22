
package com.mycompany.blackjack;

public class CartaFigura extends Carta{

    public CartaFigura(String palo, String numero) {
        super(palo, numero);
    }

    @Override
    public int getValorNumerico() {
        switch (numero) {
            case "J":
            case "Q":
            case "k":
                return 10; 
            case "A":
                return 11;
            default:
                return 0;
        }
    }
    
}
