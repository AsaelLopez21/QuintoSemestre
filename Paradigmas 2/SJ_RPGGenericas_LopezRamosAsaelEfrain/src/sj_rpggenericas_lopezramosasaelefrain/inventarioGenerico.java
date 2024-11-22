package sj_rpggenericas_lopezramosasaelefrain;
import java.util.ArrayList;
import java.util.List;

public class inventarioGenerico {
    List <String> items;

    public inventarioGenerico() {
    }

    public inventarioGenerico(List<String> items) {
        this.items = items;
    }
    
    public void agregarObjetos(String objeto){
        items.add(objeto);
    }
    
    public void usarObjeto(){
        
    }   
}
