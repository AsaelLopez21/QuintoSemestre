
package ejercicioherenciatarea;


public class mouse extends dispositivoElectronico{
    private String tipoMouse;
    private double tiempoRespuesta;
    private String tipoSensor;

    public mouse(String tipoMouse, double tiempoRespuesta, String tipoSensor, double voltaje, double corriente, String material, double peso) {
        super(voltaje, corriente, material, peso);
        this.tipoMouse = tipoMouse;
        this.tiempoRespuesta = tiempoRespuesta;
        this.tipoSensor = tipoSensor;
    }

    public String getTipoMouse() {
        return tipoMouse;
    }

    public void setTipoMouse(String tipoMouse) {
        this.tipoMouse = tipoMouse;
    }

    public double getTiempoRespuesta() {
        return tiempoRespuesta;
    }

    public void setTiempoRespuesta(double tiempoRespuesta) {
        this.tiempoRespuesta = tiempoRespuesta;
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }
    
    
}
