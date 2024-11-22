package CrearArchivo1;
import java.io.File;
import java.io.IOException;

public class CrearArchivo {

    public static void main(String[] args) {
        String direccion = "C:\\Users\\Alumonos\\Documents\\PractiasParadigmas\\miArchivo.txt";//Definir la ruta y nombre del archivo
        File archivo = new File(direccion);//Definimos un nuevo con ruta y nombre anterior
        
        try {//Manejo de excepciones
            if (archivo.createNewFile()){//Creamos el archivo 
                System.out.println("Archivo creado: " +//si la funcion devuelve true crea archivo correctamente, mostramos mensaje de exito
                archivo.getName());//Obtenemos el nombre para mostrar que creamos el archivo con exito
            }else {
                System.out.println("El archivo ya existe.");//Si recibimos un error en createNewFile mostramos que el archivo ya existe
            }
        }catch (IOException e) {//Capturamos la excepcion, que trata problemas al tratar con archivos
            System.out.println("Ocurrió un error.");//Mostramos un mensaje de error si ocurrio un problema con el manejo del archivo
            e.printStackTrace();//Imprime una traza de pila de la excepcion que se capturo
        }        
    }   
}
