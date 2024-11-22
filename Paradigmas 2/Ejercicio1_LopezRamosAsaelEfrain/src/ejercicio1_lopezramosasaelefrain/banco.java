package ejercicio1_lopezramosasaelefrain;
import java.util.ArrayList;

public class banco {

    //Lista de cuentas en el banco
    private ArrayList <cuentas> listaCuentas;
    
    //Constructor clase banco
    public banco(){
        listaCuentas = new ArrayList<>();
    }
    
    //Clase interna cuentas
    class cuentas{
        //Caracteristicas de cada cuenta
        private String nombreCliente;
        private int numeroCuenta;
        private double saldoCuenta;
        private double deudas;
        
        //Constructor para la clase cuenta
        public cuentas(String nombreCliente, int numeroCuenta, double saldoCuenta, double deudas) {
            this.nombreCliente = nombreCliente;
            this.numeroCuenta = numeroCuenta;
            this.saldoCuenta = saldoCuenta;
            this.deudas = deudas;
        }
        
    }
    
    //Agregar una cuenta nueva al banco
    public void agregarCuenta(String nombreCliente, double saldoCuenta){
        int numero = (int) (Math.random()*(99999-10000+1))+100;
        cuentas cuentaNueva = new cuentas(nombreCliente,numero,saldoCuenta,0.0);
        listaCuentas.add(cuentaNueva);
        System.out.println("Informacion de la nueva cuenta:");
        System.out.println("Nombre: "+nombreCliente+"\nNumero de cuenta: "+numero);
        System.out.println("Saldo: "+saldoCuenta+"Deudas: 0");
    }
    
    //Depositar en una cuenta
    public void depositar(double deposito, int numeroCuenta){
        if(listaCuentas.isEmpty()){
            System.out.println("No hay cuentas para depositar");
        }else{
            for(cuentas cuentas: listaCuentas ){
                if(cuentas.numeroCuenta.equals(numeroCuenta)){
                    
                }
            }
        }
    }
    
}
