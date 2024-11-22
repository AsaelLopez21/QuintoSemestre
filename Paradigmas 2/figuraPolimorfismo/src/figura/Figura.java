/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

/**
 *
 * @author Alumnos
 */
public class Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        figura2 Cuadrado = new Cuadrado(4);
        
        circulo circulo1 = new circulo(5);
        
        triangulo figura3 = new triangulo(4);
        // Polimorfismo: podemos almacenar objetos de Cuadrado y
        //Circulo en una referencia de tipo Figura
        figura2[] figuras = {Cuadrado, circulo1,figura3};
        // Dibujar cada figura usando polimorfismo
        for (figura2 figura2 : figuras) {
            figura2.dibujar();
        }
    }
            
}
    

