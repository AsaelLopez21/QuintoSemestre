package animal;

abstract class animal2 {
    String nombre;
    public abstract void sonido();
    
    public String getNombre(){
        return nombre;
    }
    
    public animal2(String nombre){
        this.nombre=nombre;
    }
}
