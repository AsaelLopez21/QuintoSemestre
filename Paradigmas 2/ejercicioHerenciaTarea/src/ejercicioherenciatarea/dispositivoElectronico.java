package ejercicioherenciatarea;

public class dispositivoElectronico {
    private double voltaje;
    private double corriente;
    private String material;
    private double peso;

    public dispositivoElectronico(double voltaje, double corriente, String material, double peso) {
        this.voltaje = voltaje;
        this.corriente = corriente;
        this.material = material;
        this.peso = peso;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public double getCorriente() {
        return corriente;
    }

    public void setCorriente(double corriente) {
        this.corriente = corriente;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
