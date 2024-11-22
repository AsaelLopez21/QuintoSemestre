package ListarArchivos5;
import java.io.File;

public class ListarArchivos {

    public static void main(String[] args) {
        File directorio = new File(".");//Crear variable de tipo file con direcctorio actual
        String[] archivos = directorio.list();//Arreglo para guardar los nombres de los directorios usando  nombres que devuelve list()
        
        System.out.println("Archivos en el directorio actual:");
        
        for (String archivo : archivos) {//Usar un ciclo for para mostrar los nombres guardados en el string[] archivos
            System.out.println(archivo);//mostrar los nombres de los archivos
        }
    }
    
}
