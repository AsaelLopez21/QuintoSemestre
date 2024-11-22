package ejemploherencia;


public class EjemploHerencia {

    public static void main(String[] args) {
        Animal cachorro= new perro("Firulais");
        
        System.out.println("Nombre perro: " + cachorro.nombre());
        cachorro.sonido();
        
        
    }
    
}
