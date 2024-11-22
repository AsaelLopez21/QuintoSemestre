package EscribirArchivo3;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {

    public static void main(String[] args) {
        
        try {//Manejar la escritura en un archivo usando excepciones
            FileWriter escritor = new FileWriter("miArchivo.txt");
            escritor.write("Este es el contenido del archivo.\nOtra línea de texto.");
            escritor.close();
            System.out.println("Se escribió correctamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir.");
            e.printStackTrace();
        }
    }
    
}
