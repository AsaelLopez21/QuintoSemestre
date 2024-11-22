/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utilidades.texto;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Alumnos
 */
public class StringManipulator {
    
    
    public void verificarAlfanumerica(String cadena){
        if(StringUtils.isAlphanumeric(cadena)){
            System.out.println("La cadena: "+cadena+", es alfanumerica");
        }else{
            System.out.println("La cadena: "+cadena+", no es alfanumerica");
        }
    }
    
    public void repetirCadena(int numeroRep, String cadena){
        String cadenaRepetida = StringUtils.repeat(cadena, numeroRep);
        System.out.println("Repetir cadena: "+cadena+", "+numeroRep+" veces");
        System.out.println(cadenaRepetida);
    }
    
    public void eliminarEspacios(String cadena){
        String sinEspacios = StringUtils.deleteWhitespace(cadena);
        System.out.println("Cadena sin espacios: "+sinEspacios);
    }
    
    public void cadenaInversa(String cadena){
        String cadenaInversa = StringUtils.reverse(cadena);
        System.out.println("Cadena revertida: "+cadenaInversa);
    }
    
}
