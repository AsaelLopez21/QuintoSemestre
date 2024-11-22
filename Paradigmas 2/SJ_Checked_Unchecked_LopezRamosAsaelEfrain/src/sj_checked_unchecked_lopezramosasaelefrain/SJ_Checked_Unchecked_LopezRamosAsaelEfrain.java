
package sj_checked_unchecked_lopezramosasaelefrain;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SJ_Checked_Unchecked_LopezRamosAsaelEfrain {

    public static void main(String[] args) {
        
        //ejemplo de checked exception (IOEException)
        try{//intenta capturar una excepcion, se esta leyendo en el buffer un file reader de un archivo.txt
            //en mi codigo cree el archivo txt dentro del proyecto por eso no me muestra error
            //Si cambia el nombre del archivo o elimina el archivo.txt volvera a salir el error
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            //cierra el buffer reader
            reader.close();
        }catch (IOException e){
            //catch maneja una excepcion del tipo IOException
            System.out.println("Ocurrio un erro de IO: "+e.getMessage());
        }
        
        
        //Ejemplo de unchecked exception (NULLPointerExcerption)
        
        //declara una cadena nula
        String texto = "jo";
        //No muestra un error si declara alguna cadena en lugar de null
        
        try{
            System.out.println(texto.length()); //Esto lanza NullPointerException, porque esta queriendo mostrar longitud de algo que es Null
        }catch(NullPointerException e){ //Aqui esta capturando un error de tipo NullPointerException       
            System.out.println("Error: inteno de acceder a una referencia nula.");//Muestra este mensaje de error porque texto es NULL
        }
        
        //No se muestran errores porque leyo el archivo en la carpeta del proyecto y tambien porque inicialize texto con una cadena
    }
    
}
