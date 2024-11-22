package juegopalabras;
import java.util.ArrayList;
import java.util.List;


public class JuegoPalabras {
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> lista = new ArrayList<>();
        lista.add("Juego");
        lista.add("de");
        lista.add("palabras");
        
        System.out.println("Lista original");
        for(String palabras: lista){
            System.out.print(palabras+" ");
        }
        System.out.println("");
        
        int i=2,j=0;
        
        intercambiar<Integer,Integer,List> juegoPalabras = new intercambiar<>(i,j,lista);
        lista = juegoPalabras.intercambiarIndice(i, j, lista);
        
        System.out.println("Lista modificada");
        for(String palabras: lista){
            System.out.print(palabras+" ");
        }

    }
    
}
