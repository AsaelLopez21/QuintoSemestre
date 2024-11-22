package ejercicio1_lopezramosasaelefrain;
import java.io.File;

public class RegistroVentas {
    private int id_Producto;
    private int cantidadVendida;
    private double precioUnidad;
    
    public RegistroVentas(){
    }

    public RegistroVentas(int id_Producto, int cantidadVendida, double precioUnidad) {
        this.id_Producto = id_Producto;
        this.cantidadVendida = cantidadVendida;
        this.precioUnidad = precioUnidad;
    }
    
    public void registrarVenta(File registroVentas, int id_Producto, int cantidadVendida, double precioUnidad){
        
    }
    
    public double calcularIngresos(File registroVentas){
        double ingresos=0;
        
        
        
        return ingresos;
    }
    
    
}
