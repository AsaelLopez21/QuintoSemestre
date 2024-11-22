package sj_1exc_prop_lopezramosasaelefrain;

public class SistemaCalificaciones {
    
    public double calcularPromedio(int[] calificaciones){
        if(calificaciones.length==0){
            throw new IllegalArgumentException("La lista de calificaciones esta vacia");
        }
        double promedio=0;
        for(int i=0;i<calificaciones.length;i++){
            promedio=promedio+calificaciones[i];
        }
        return promedio/calificaciones.length;
    }
    
    public double validarCalificaciones(int[] calificaciones){
        return calcularPromedio(calificaciones);
    }
    
    public double obtenerPromedio(int[] calificaciones){
        return validarCalificaciones(calificaciones);
    }
    
}
