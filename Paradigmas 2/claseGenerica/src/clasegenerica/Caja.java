/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasegenerica;

public class Caja<T> {
    private T contenido;

    public Caja(T contenido) {
        this.contenido = contenido;
    }

    public Caja() {
    }

    public void agregarContenido(T contenido) {
        this.contenido = contenido;
    }
    
    public T obtenerContenido() {
        return contenido;
    }
}
