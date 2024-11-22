package Ejemplo5;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        assert saldoInicial >= 0 :"Saldo inicial no puede ser negativo: "+saldoInicial;
        this.saldo = saldoInicial;
    }
    
    public void retirar(double cantidad){
        assert cantidad > 0: "La cantidad a retirar debe ser positiva: "+cantidad;
        saldo -= cantidad;
        
        //Verificar saldo no negativo
        assert saldo >= 0 :"Saldo negativo despues de retirar: "+saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}
