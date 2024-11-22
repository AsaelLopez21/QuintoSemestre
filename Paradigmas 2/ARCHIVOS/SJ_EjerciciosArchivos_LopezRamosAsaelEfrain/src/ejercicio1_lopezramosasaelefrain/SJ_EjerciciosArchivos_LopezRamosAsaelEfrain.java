package ejercicio1_lopezramosasaelefrain;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SJ_EjerciciosArchivos_LopezRamosAsaelEfrain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        File registroVentas = new File("ventas.txt");
        int op=-1,id,cantidad;
        double precioUnitario,ingresoTotal;
        
        RegistroVentas registro = new RegistroVentas();
        
        try {//Manejo de excepciones
            if (registroVentas.createNewFile()){
                System.out.println("Archivo ventas creado");
            }else {
                System.out.println("El archivo ya existe.");
            }
        }catch (IOException e) {
            System.out.println("Ocurrió un error.");
            e.printStackTrace();
        }
        
        while(op!=0){
            System.out.println("=== Sistema de Gestión de Ventas ===");
            System.out.println("1.Agregar una venta");
            System.out.println("2.Calcular ingresos totales");
            System.out.println("3.Listar las ventas");
            
            
            switch(op){
                case 1:
                    entrada.nextLine();
                    
                    System.out.println("Agregue ID producto");
                    id = entrada.nextInt();
                    
                    System.out.println("Ingrese la cantidad de productos");
                    cantidad = entrada.nextInt();
                    
                    System.out.println("Ingrese el precio unitario");
                    precioUnitario = entrada.nextDouble();
                    
                    registro.registrarVenta(registroVentas, id, cantidad, precioUnitario);
                break;
                
                case 2:
                    
                break;
                
                case 3:
                    
                break;
                
            }
        }
        
        
        
        
        
        
        
        
        try {//Manejar la escritura en un archivo usando excepciones
            FileWriter escritor = new FileWriter("ventas.txt",true);
            escritor.write("Escribiendo otra cosa");
            escritor.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir.");
            e.printStackTrace();
        }   
    }
    
}
