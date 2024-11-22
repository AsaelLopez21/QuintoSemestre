package precondiciones;

public class Calcular {
    public int calcularArea(int largo, int ancho){
        assert largo > 0 : "Largo no puede ser negativo";
        assert ancho > 0 : "Ancho no puede ser negativo";
        
        return largo*ancho;
    }
}
