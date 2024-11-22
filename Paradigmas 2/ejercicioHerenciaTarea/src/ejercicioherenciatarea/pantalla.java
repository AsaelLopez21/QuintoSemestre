package ejercicioherenciatarea;

public class pantalla extends dispositivoElectronico{
    private double numHz;
    private double altura;
    private double anchura;
    private String tipoPantalla;

    public pantalla(double numHz, double altura, double anchura, String tipoPantalla, double voltaje, double corriente, String material, double peso) {
        super(voltaje, corriente, material, peso);
        this.numHz = numHz;
        this.altura = altura;
        this.anchura = anchura;
        this.tipoPantalla = tipoPantalla;
    }

    public double getNumHz() {
        return numHz;
    }

    public void setNumHz(double numHz) {
        this.numHz = numHz;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }
    
    
    
    
    
}
