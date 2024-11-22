package CopiarArchivo7;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopiarArchivo {

    public static void main(String[] args) {
        Path origen = Paths.get("miArchivo.txt");//Crear archivo path con ruta para miArchivo
        Path destino = Paths.get("copiaArchivo.txt");//Crea otro path para la direccion destino
        
        try {//Usar excepciones para el manejo de compia
            Files.copy(origen, destino);//Usar files.copy para copiar contenido de arhivo origen a archivo destino
            System.out.println("Archivo copiado a: " + destino);//Si sale correctamente mostrar mensaje con la ruta a la que se copio
        } catch (IOException e) {//Tratar excepcion del tipo IOExcepction
            System.out.println("No se pudo copiar el archivo.");//Mostrar mensaje que no se puedo copiar el archivo
            e.printStackTrace();//mostrar error usando la traza de pila
        }

    }
    
}
