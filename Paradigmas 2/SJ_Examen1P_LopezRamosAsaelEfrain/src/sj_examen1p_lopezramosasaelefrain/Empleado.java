//SJ_Lopez Ramos Asael Efrain 501
package sj_examen1p_lopezramosasaelefrain;

public abstract class Empleado {
    private String nombreEmpleado;
    private int edad;
    private double salarioBase;

    public Empleado() {
    }
 
    public Empleado(String nombreEmpleado, int edad, double salarioBase) {
        this.nombreEmpleado = nombreEmpleado;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double calcularSalario();
    public abstract void mostrarDetallesEmpleado();

}
