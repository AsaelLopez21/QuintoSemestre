/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author Alumnos
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       calculadora2 calc = new calculadora2();
        System.out.println("Suma de dos enteros: " + calc.sumar(10, 20));
        System.out.println("Suma de tres enteros: " + calc.sumar(10, 20, 30));
        System.out.println("Suma de dos decimales: " + calc.sumar(10.5, 20.5));
    }
    
}
