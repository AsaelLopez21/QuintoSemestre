package sj_exc1_lopezramosasaelefrain;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SJ_EXC_LopezRamosAsaelEfrain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int dividendo;
        int divisor;
        
        System.out.println("Ingrese dividendo");
        dividendo = entrada.nextInt();
        
        System.out.println("Ingrese divisor");
        divisor = entrada.nextInt();
        
        division operacion = new division(divisor, dividendo);
        
        
        System.out.println("Resultado: "+operacion.hacerDivision(divisor, dividendo));
        
        
    }
    
}
