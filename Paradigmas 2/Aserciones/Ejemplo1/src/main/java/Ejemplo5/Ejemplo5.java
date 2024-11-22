package Ejemplo5;

public class Ejemplo5 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        System.out.println("Saldo antes del retiro "+cuenta.getSaldo());
        cuenta.retirar(400);
        System.out.println("Saldo despues del retiro "+cuenta.getSaldo());
        cuenta.retirar(1000);
        System.out.println("Saldo despues del retiro "+cuenta.getSaldo());
        
    }
    
}
