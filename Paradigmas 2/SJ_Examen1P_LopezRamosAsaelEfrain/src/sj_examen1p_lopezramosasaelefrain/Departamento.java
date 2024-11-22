//SJ_Lopez Ramos Asael Efrain 501

package sj_examen1p_lopezramosasaelefrain;
import java.util.ArrayList;
import java.util.List;

public class Departamento{
    private String nombreDepartamento;
    private List <Empleado> trabajadores;

    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        trabajadores = new ArrayList<>();
    }
    
    public void agregarTrabajadores(Empleado trabajador){
        trabajadores.add(trabajador);
    }
    
    public List <Empleado> mostrarTrabajadores(){
        return trabajadores;
    }
    
    void calcularEstadisticas(){
        class estadisticas{
            void calcularPromedio(){
                double salarioPromedio=0;
                for(Empleado gente : trabajadores){
                    salarioPromedio+=gente.getSalarioBase();
                }
                System.out.println("Salario promedio: $"+salarioPromedio);
            }

            /*void empleadoMayorSalario(){
                double salarioPromedio=0;
                String nombre;
                for(int i=0;i<trabajadores.size();i++){

                }
                System.out.println("Salario promedio: $"+salarioPromedio);
            }*/
        }
    }

    
}
