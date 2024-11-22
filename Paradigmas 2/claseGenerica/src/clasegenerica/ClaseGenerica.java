/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasegenerica;

/**
 *
 * @author Alumnos
 */
public class ClaseGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Caja<String> cajaDeTexto = new Caja<String>();
//        cajaDeTexto.agregarContenido("Hola");
//        String contenido = cajaDeTexto.obtenerContenido();
//        System.out.println("Contenido: "+contenido);
//        //
//        Caja<String> contenedorString = new Caja<>("Hola"); 
//        String elementoString = contenedorString.obtenerContenido();
//        System.out.println(elementoString);
//        //Imprime: Hola
        
//Parte 2
        Caja<Integer> cajaDeNumero = new Caja<>(21);
        System.out.println("Contenido entero: "+cajaDeNumero.obtenerContenido());
        
        Caja<Double> cajaDeDoble = new Caja<>(21.21);
        System.out.println("Contenido doble: "+cajaDeDoble.obtenerContenido());
        
    }
    
}
