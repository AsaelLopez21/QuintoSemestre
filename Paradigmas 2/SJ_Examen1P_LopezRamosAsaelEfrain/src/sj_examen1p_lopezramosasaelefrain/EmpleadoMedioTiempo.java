//SJ_Lopez Ramos Asael Efrain 501
package sj_examen1p_lopezramosasaelefrain;

public class EmpleadoMedioTiempo extends Empleado{

    public EmpleadoMedioTiempo() {
    }

    public EmpleadoMedioTiempo(String nombreEmpleado, int edad, double salarioBase) {
        super(nombreEmpleado, edad, salarioBase*=0.6);
    }
    
    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public void mostrarDetallesEmpleado() {
        System.out.println("Nombre: "+super.getNombreEmpleado());
        System.out.println("Edad: "+super.getEdad());
        System.out.println("Salario: "+super.getSalarioBase());
    }
    
}
