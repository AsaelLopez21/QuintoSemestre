package Ejemplo3;

public class Ejemplo3 {
    public static void main(String[] args) {
        String config = "gol";
        
        //Verificar que la variable no sea nula antes de usarla
        assert config != null: "La variable config no ha sidon inicializada";
        System.out.println("Config "+config);
    }
    
}
