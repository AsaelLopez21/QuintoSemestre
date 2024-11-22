package juegopalabras;
import java.util.ArrayList;
import java.util.List;

public class intercambiar <I,J,L >{

    private I indiceI;
    private J indiceJ;
    private  L lista;
    
    public intercambiar() {
    }

    public intercambiar(I indiceI, J indiceJ, L lista) {
        this.indiceI = indiceI;
        this.indiceJ = indiceJ;
        this.lista = lista;
    }
    
    public L intercambiarIndice(I indiceI, J indiceJ, L listaX){
        //lista = listas;
        J aux = indiceJ;
        indiceJ = (J) indiceI;
        indiceI = (I) aux;
        
        int I = (int) indiceI;
        int J = (int) indiceJ;
        
        
        List<String> listaCopia = (List<String>) listaX;
        
        String auxS = listaCopia.get(J);
        listaCopia.set(J,listaCopia.get(I));
        listaCopia.set(I, auxS);

        return (L) listaCopia;
    }   
}
