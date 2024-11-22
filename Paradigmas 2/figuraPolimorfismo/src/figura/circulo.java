/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author Alumnos
 */
public class circulo extends figura2{
    private int radio;
    // Constructor de la clase Circulo
    public circulo(int radio) {
        this.radio = radio;
    }
    // Implementación del método abstracto dibujar()
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio: " + radio); 
    }
    public int getRadio() {
        return radio; 
    }
}
