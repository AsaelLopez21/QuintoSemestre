/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blackjack;

import java.util.Random;

public class Barajas {
   private Carta[] baraja;
   private int numeroCartasRestantes;
   public Barajas(){
       
       this.baraja = new Carta[52];
       
       String[] palos = {"Corazones","Picas","Trebol","Diamantes"};
       String[] valores ={"1","2","3","4","5","6","7","8","9","J","Q","K","A"};
       
       int index = 0;
       for(int i =0; i< palos.length;i++){
           for(int j=0;j< valores.length;j++){
               if(valores[j].equals("J") || valores[j].equals("Q") || valores[j].equals("K") || valores[j].equals("A")){
                   this.baraja[index] = new CartaFigura(palos[i], valores[j]);
               }else{
                   this.baraja[index] = new CartaNumerica(palos[i], valores[j]);
               }
               index++;
           }
       }
       numeroCartasRestantes = 52;
   }
   
   public void barajar(){
       Random random = new Random();
       
       for(int i=0;i<baraja.length;i++){
           int index = random.nextInt(i+1);
           Carta cartaTemp = this.baraja[index];
           this.baraja[index] = this.baraja[i];
           this.baraja[i] = cartaTemp;
       }
       numeroCartasRestantes = 52;
   }
   
   public Carta sacarCarta(){
       if(numeroCartasRestantes == 0){
           return null;
       }
       this.numeroCartasRestantes -= 1;
       return this.baraja[numeroCartasRestantes];
   }
   
}
