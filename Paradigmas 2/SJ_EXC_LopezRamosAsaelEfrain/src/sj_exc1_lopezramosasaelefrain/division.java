package sj_exc1_lopezramosasaelefrain;
import java.lang.ArithmeticException;
import java.util.InputMismatchException;

public class division {
    private int divisor;
    private int dividendo;

    public division() {
    }

    public division(int divisor, int dividendo) {
        this.divisor = divisor;
        this.dividendo = dividendo;
    }



    public float hacerDivision(int divisor, int dividendo){
        float resultado=0;
        try{
            if(divisor == 0){
                throw new ArithmeticException("Error No puedes dividir por cero");
            }
            resultado = (float)dividendo/divisor;
        }catch(ArithmeticException ex){
            System.out.println("Error: "+ex.getMessage());
            resultado=0;
        }catch(InputMismatchException ime){
            System.out.println("Ingrese numeros");
        }    
        return resultado;
    }
    
    
       
}
