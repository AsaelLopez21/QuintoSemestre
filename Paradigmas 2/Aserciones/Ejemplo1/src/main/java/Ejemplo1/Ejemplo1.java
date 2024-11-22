package Ejemplo1;

public class Ejemplo1 {
    public static void main(String[] args) {
        int porcentaje=104;
        
        //verificar porcentaje
        assert porcentaje >= 0 && porcentaje<=100: "porcentaje fuera de rango: "+porcentaje;
        System.out.println("El porcentaje es valido "+porcentaje);
    }   
}