package sj_rpggenericas_lopezramosasaelefrain;

public class HabilidadGenerica {
    private String nombreHabilidad;
    private String tipoHabilidad;
    private double poder;
    
    public double ejecutarHabilidad(){
        System.out.println("Da�o de "+poder+"XP");
        return poder;
    }
    
}
