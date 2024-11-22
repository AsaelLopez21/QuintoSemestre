public class asercion2 {

    public static void main(String[] args) {
	System.out.println("Hola mundo");		
        char operacion = 'X';
        switch (operacion) {
            case '+':
                System.out.println("Suma");
            break;
            case '-':
                System.out.println("Resta");
            break;
            
            default:
                assert false : "Operación no reconocida: " + operacion;
            break;
        }
    }
    
}