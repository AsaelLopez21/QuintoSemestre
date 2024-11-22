/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.utilidades.texto;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
/**
 *
 * @author Alumnos
 */
public class Prin {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op=18,numRep;
        String cadena;
        StringManipulator manipular = new StringManipulator();
        
        while(op!=0){
            System.out.println("___________MENU___________");
            System.out.println("1.Verificar si su cadena es alfanumerica");
            System.out.println("2.Repetir cadena N veces");
            System.out.println("3.Eliminar los espacios en blanco de una cadena");
            System.out.println("4.Repetir las palabras de una cadena");
            System.out.println("0.Salir");
            op=entrada.nextInt();
            
            switch(op){
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese su cadena:");
                    cadena=entrada.nextLine();
                    manipular.verificarAlfanumerica(cadena);
                break;
                
                case 2:
                    entrada.nextLine();
                    System.out.println("Ingrese su cadena:");
                    cadena=entrada.nextLine();
                    
                    System.out.println("Ingrese numero repeticiones");
                    numRep = entrada.nextInt();
                    manipular.repetirCadena(numRep, cadena);
                break;
                
                case 3:
                    entrada.nextLine();
                    System.out.println("Ingrese su cadena:");
                    cadena=entrada.nextLine();
                    manipular.eliminarEspacios(cadena);
                break;
                
                case 4:
                    entrada.nextLine();
                    System.out.println("Ingrese su cadena:");
                    cadena=entrada.nextLine();
                    manipular.cadenaInversa(cadena);
                break;
                
                default:
                    System.out.println("Opcion incorrecta");
                break;
                
            }
        }
        
    }
    
}
