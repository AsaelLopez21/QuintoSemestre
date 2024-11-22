package ejemploherencia;

public class Animal {
    private String nombre;
    private String genero;
    private String sonido;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void sonido(){
        System.out.println("Hace sonido: ");
    }
    
    public String nombre(){
        return nombre;
    }
}
