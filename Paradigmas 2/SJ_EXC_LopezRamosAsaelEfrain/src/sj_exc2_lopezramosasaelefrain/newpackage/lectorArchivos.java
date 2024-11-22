package sj_exc2_lopezramosasaelefrain.newpackage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lectorArchivos {
    public void leerContenido(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"));
            String archivo;
            System.out.println("Informacion del archivo:");
            while((archivo = reader.readLine())!=null){
                System.out.println(archivo);
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }catch (IOException e){
            System.out.println("Ocurrio un erro de IO: "+e.getMessage());
        }
    };
}


