package Ejemplo4;

public class Ejemplo4 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        
        int indice = 2;
        
        assert indice >= 0 && indice < numeros.length:"Indice fuera de rango: "+indice;
        System.out.println("El valor en el indice "+indice+" es: "+numeros[indice]);
    }
    
}
