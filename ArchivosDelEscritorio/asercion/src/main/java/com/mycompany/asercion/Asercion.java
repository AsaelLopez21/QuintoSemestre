package com.mycompany.asercion;

public class Asercion {

    public static void main(String[] args) {
        int porcentaje = -5; // Cambia este valor para probar
        // Verificar que el porcentaje esté entre 0 y 100
        assert porcentaje >= 0 && porcentaje <= 100 : "Porcentaje fuera de rango: " +porcentaje;
        System.out.println("El porcentaje es válido: " + porcentaje);
    }
}
