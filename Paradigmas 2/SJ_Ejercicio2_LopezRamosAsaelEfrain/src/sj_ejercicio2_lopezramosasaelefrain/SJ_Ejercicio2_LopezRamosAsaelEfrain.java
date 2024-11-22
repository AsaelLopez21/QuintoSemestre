//SJ_Ejercicio2_LopezRamosAsaelEfrain_501
package sj_ejercicio2_lopezramosasaelefrain;
import java.util.Scanner;

public class SJ_Ejercicio2_LopezRamosAsaelEfrain {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double cos,sen,tan,angulo;
        System.out.println("Ingrese angulo para calcular sus razones: ");
        angulo=entrada.nextDouble();
        
        calculadora operaciones = new calculadora();
        calculadora.trigonometria operacion = operaciones.new trigonometria(angulo);
        
        
    }
    
}
