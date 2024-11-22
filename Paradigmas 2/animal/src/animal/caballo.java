package animal;

public class caballo extends animal2{

    public caballo(String nombre) {
        super(nombre);
    }
    
    @Override
    public void sonido() {
        System.out.println("El caballo "+nombre+ " relincha");
    }
}
