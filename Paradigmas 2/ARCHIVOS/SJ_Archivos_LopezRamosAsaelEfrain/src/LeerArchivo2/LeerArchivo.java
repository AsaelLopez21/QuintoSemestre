package LeerArchivo2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivo {
    public static void main(String[] args) {
        try {//Usar excepciones para leer el archivo por si ocurre alguna excepcion
            File archivo = new File("miArchivo.txt");//Definir el nombre del archivo
            Scanner lector = new Scanner(archivo); //Crear un scanner para leer los datos de un archivo
            
            while (lector.hasNextLine()) {//Mientras el lector tenga una linea para leer hacer lo siguiente
                String linea = lector.nextLine();//Crear un string que almacene la letra que esta leyendo el scanner
                System.out.println(linea);//Imprimir el string que se esta leyendo
            }
            lector.close();//cerrar el scanner despues de leer el archivo
        } catch (FileNotFoundException e) {//Capturamos la excepcion si no se encontro el archivo
            System.out.println("Archivo no encontrado.");//Imprimir el error de la excepcion
            e.printStackTrace();//Imprimir la traza de pila
        }
        
    }
    
}
