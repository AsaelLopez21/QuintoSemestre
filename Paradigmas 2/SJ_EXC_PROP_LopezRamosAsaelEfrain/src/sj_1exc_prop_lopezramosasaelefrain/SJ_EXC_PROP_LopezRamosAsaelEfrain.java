package sj_1exc_prop_lopezramosasaelefrain;

public class SJ_EXC_PROP_LopezRamosAsaelEfrain {

    public static void main(String[] args) {
        int[] calificaciones = {10,9,8,8,9,9,10};
        
        SistemaCalificaciones promedios = new SistemaCalificaciones();
        
        double promedio;
        
        try{
            promedio = promedios.obtenerPromedio(calificaciones);
            System.out.println("Promedio de arreglo con numeros: "+ promedio);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        int[] calificaciones2 = {};
        
        try{
            promedio = promedios.obtenerPromedio(calificaciones2);
            System.out.println("Promedio de arreglo con numeros: "+ promedio);
        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        
        
        
    }
    
}
