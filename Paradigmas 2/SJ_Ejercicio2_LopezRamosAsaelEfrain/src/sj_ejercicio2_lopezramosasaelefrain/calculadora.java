//SJ_Ejercicio2_LopezRamosAsaelEfrain_501
package sj_ejercicio2_lopezramosasaelefrain;

public class calculadora {
    
    static class trigonometria{
        private double angulo;

        public trigonometria(double angulo) {
            this.angulo = angulo;
        }
        
        double calcularSeno(double anguloCalcularSeno){
            anguloCalcularSeno = Math.toRadians(anguloCalcularSeno);
            double seno = Math.sin(anguloCalcularSeno);
            return seno;
        }
        
        double calcularCoseno(double anguloCalcularCoseno){
            anguloCalcularCoseno = Math.toRadians(anguloCalcularCoseno);
            double coseno = Math.cos(anguloCalcularCoseno);
            return coseno;
        }
                
        double calcularTangente(double anguloCalcularTangente){
            anguloCalcularTangente = Math.toRadians(anguloCalcularTangente);
            double seno = Math.tan(anguloCalcularTangente);
            return seno;
        }
    }
}
