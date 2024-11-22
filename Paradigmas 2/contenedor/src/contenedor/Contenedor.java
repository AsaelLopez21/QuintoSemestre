package contenedor;

public class Contenedor {

    public static void main(String[] args) {
        contenedor2 c = new contenedor2();
        contenedor2.Interna i = c.new Interna();
        i.mostrar();
    }
    
}
