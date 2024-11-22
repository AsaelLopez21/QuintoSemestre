//SJ_Lopez Ramos Asael Efrain 501
package sj_examen1p_lopezramosasaelefrain;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SJ_Examen1P_LopezRamosAsaelEfrain {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*Empleado trabajadores[] = new Empleado[4];
        trabajadores[0] = new EmpleadoMedioTiempo("Asael", 19, 5000);
        trabajadores[1] = new EmpleadoMedioTiempo("Efrain", 21, 4000);
        trabajadores[2] = new EmpleadoTiempoCompleto("Lopez", 22, 3000);
        trabajadores[3] = new EmpleadoTiempoCompleto("Ramos", 23, 2000);*/
        int op=12,op2=3,edad=0;
        String nombre;
        double salario=0;
        
        Empleado trabajador = null;
        Departamento RH = new Departamento("Recursos Humanos");
        
        while(op!=0){
            System.out.println("_________Menu_________");
            System.out.println("1. Agregar Empleados");
            System.out.println("2. Mostrar informacion");
            System.out.println("3. Calculo estadisticas");
            System.out.println("0. Salir");
            op=entrada.nextInt();
            
            switch(op){
                case 1:
                    entrada.nextLine();
                    System.out.println("Ingrese tipo empleado:\n1.Tiempo Completo\n2.Medio Tiempo");
                    op2=entrada.nextInt();
                    
                    entrada.nextLine();
                    System.out.println("Ingrese Nombre");
                    nombre=entrada.nextLine();
                    System.out.println("Ingrese Edad");
                    edad=entrada.nextInt();
                    System.out.println("Ingrese Salario");
                    salario=entrada.nextDouble();    
                    
                    if(op2==1){
                        trabajador=new EmpleadoTiempoCompleto(nombre, edad, salario);
                    }if (op==2){
                        trabajador=new EmpleadoMedioTiempo(nombre, edad, salario);
                    }
                    
                    RH.agregarTrabajadores(trabajador);
                break;
                
                case 2:
                    RH.mostrarTrabajadores();
                break;
                
                
                case 3:
                    RH.calcularEstadisticas();
                break;
            }
        }           
    }
}
