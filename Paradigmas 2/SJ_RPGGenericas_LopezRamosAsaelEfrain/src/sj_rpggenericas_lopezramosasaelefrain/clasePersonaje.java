package sj_rpggenericas_lopezramosasaelefrain;
import java.util.ArrayList;
import java.util.List;


public class clasePersonaje <T>{
    private String nombrePersonaje;
    private double vida;
    private double ataque;
    List <String> habilidades;

    public clasePersonaje() {
    }

    public clasePersonaje(String nombre, double vida, double ataque, List<String> habilidades) {
        this.nombrePersonaje = nombrePersonaje;
        this.vida = vida;
        this.ataque = ataque;
        this.habilidades = habilidades;
    }
    
    public double recibirDaño(double ataqueContra){
        return vida-ataqueContra;
    }
    
    public double usarHabilidad(List<String> listaHabilidades){
        
        return ataque+12;
    }
    
    public void agregarHabilidad(String habilidad){
        habilidades.add(habilidad);
    }
    
}
