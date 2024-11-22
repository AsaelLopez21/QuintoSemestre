package EliminarArchivo4;
import java.io.File;

public class EliminarArchivo {

    public static void main(String[] args) {
        File archivo = new File("miArchivo.txt");//Crear variable de tipo file
        if (archivo.delete()) {//Usar la funcion del archivo para elimiar un archivo
            System.out.println("El archivo fue eliminado: " +archivo.getName());//si devolvio true y se elimino correctamente mostrar el mensaje
        } else {
            System.out.println("No se pudo eliminar el archivo.");//Si no se elimino mostrar un mensaje de error
        }
    }
    
}
