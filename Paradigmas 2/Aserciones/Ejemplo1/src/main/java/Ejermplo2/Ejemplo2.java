package Ejermplo2;

public class Ejemplo2 {
    public static void main(String[] args) {
        String nombre = "A";
        
        //Verificar longitud de al menos 3 caracteres
        
        assert nombre != null && nombre.length() >= 3:"Nombre corto o nulo: "+nombre;
        System.out.println("nombre valido");
    }
    
}
