package MoverRenombrar6;
import java.io.File;

public class MoverRenombrar {

    public static void main(String[] args) {
        File archivo = new File("miArchivo.txt");//Crear variable de tipo file 
        
        File nuevoArchivo = new File("nuevoNombre.txt");//Crear otra variable con otro nombre para cambiar
        
        if (archivo.renameTo(nuevoArchivo)) {//usar la funcion rename de archivo para cambiar nombre a: nuevoArchivo
            System.out.println("Archivo renombrado a: " + nuevoArchivo.getName());//Si no hay problemas mostrar mensaje de confirmacion
        } else {
            System.out.println("No se pudo renombrar el archivo.");//Si no mostrar mensaje de error
        } 
    }
    
}
