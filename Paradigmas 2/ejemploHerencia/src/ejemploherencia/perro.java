package ejemploherencia;

public class perro extends Animal {
    public perro(String nombre){
        super(nombre);//accedemos a llamar al constructor padre
    }
    
    @Override
    public void sonido(){
        System.out.println("´Inserte sonido de ladrido´");
    }
}
