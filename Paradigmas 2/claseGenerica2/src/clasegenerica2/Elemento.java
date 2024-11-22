/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasegenerica2;

/**
 *
 * @author Alumnos
 */
public class Elemento <T> {
    private T material;
    private String titulo;
    
    public Elemento(T material, String titulo) {
        this.material = material;
        this.titulo = titulo;
    }

    public Elemento() {
    }
    
    public T obtenerMaterial() {
        return material;
    }
    
    public String obtenerTitulo() {
        return titulo;
    }
    
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Material: " +
        material.getClass().getSimpleName());
    }
    
}
