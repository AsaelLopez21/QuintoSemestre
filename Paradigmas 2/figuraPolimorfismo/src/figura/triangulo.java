/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

/**
 *
 * @author Alumnos
 */
public class triangulo extends figura2 {
    private int lado;
    
    //Constructor
    public triangulo(int lado){
        this.lado=lado;
    }
    
    @Override
    
    public void dibujar(){
        System.out.println("Dibujando un triangulo con lados de longitud: "+lado);
    }
    
    public int getLado(){
        return lado;
    }
}
