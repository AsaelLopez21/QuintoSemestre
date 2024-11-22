package ejercicioherenciatarea;


public class teclado extends dispositivoElectronico {
    private String tipoTeclado;
    private double anchura;
    private double altura;
    private String distribucion;

    public teclado(String tipoTeclado, double anchura, double altura, String distribucion, double voltaje, double corriente, String material, double peso) {
        super(voltaje, corriente, material, peso);
        this.tipoTeclado = tipoTeclado;
        this.anchura = anchura;
        this.altura = altura;
        this.distribucion = distribucion;
    }

    public String getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(String tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }
    
    
    
}
