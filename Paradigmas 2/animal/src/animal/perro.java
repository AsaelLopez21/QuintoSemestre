package animal;

public class perro extends animal2{

    public perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void sonido() {
        System.out.println("El perro "+nombre+" ladra");
    }
}
