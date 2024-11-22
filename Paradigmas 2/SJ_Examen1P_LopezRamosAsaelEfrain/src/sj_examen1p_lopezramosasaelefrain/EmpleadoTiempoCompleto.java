//SJ_Lopez Ramos Asael Efrain 501
package sj_examen1p_lopezramosasaelefrain;

public class EmpleadoTiempoCompleto extends Empleado {

    public EmpleadoTiempoCompleto() {
    }

    public EmpleadoTiempoCompleto(String nombreEmpleado, int edad, double salarioBase) {
        super(nombreEmpleado, edad, salarioBase*=0.2);
    } 
    
    @Override
    public void mostrarDetallesEmpleado() {
        System.out.println("Nombre: "+super.getNombreEmpleado());
        System.out.println("Edad: "+super.getEdad());
        System.out.println("Salario: "+super.getSalarioBase());
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
    
}
