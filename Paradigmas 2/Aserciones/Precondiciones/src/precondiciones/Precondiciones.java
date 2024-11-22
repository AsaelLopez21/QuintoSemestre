package precondiciones;

public class Precondiciones {
    public static void main(String[] args) {
        Calcular area = new Calcular();
        int areaI;
        areaI = area.calcularArea(4, -3);
        System.out.println("Area de la figura: "+areaI);
    }
    
}
