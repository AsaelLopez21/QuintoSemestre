/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author Alumnos
 */
public class Cuadrado extends figura2{
    private int lado;
    // Constructor de la clase Cuadrado
        public Cuadrado(int lado) {
        this.lado = lado;
    }
    // Implementación del método abstracto dibujar()
        
    @Override
    public void dibujar() {
    System.out.println("Dibujando un cuadrado con lado de longitud: " + lado);
    }
    public int getLado() {
        return lado;
    }
}
