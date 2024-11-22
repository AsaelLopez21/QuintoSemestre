package paresvalores;

public class parKV <K,V>{
    private K clave;
    private V valor;

    public parKV() {
    }

    public parKV(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
    }
    
    public K getClave(){
        return clave;
    }
    
    public V getValor(){
        return valor;
    }
}
