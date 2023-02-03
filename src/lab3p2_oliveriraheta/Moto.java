
package lab3p2_oliveriraheta;


public class Moto extends Vehiculos{
    private String desplazamientoMotor;
    private boolean electrica;

    public Moto() {
    }

    public Moto(String desplazamientoMotor, boolean electrica, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        super(color, marca, modelo, anioFab, precio, llantas);
        this.desplazamientoMotor = desplazamientoMotor;
        this.electrica = electrica;
    }

    public String getDesplazamientoMotor() {
        return desplazamientoMotor;
    }

    public void setDesplazamientoMotor(String desplazamientoMotor) {
        this.desplazamientoMotor = desplazamientoMotor;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return "Moto{" + "desplazamientoMotor=" + desplazamientoMotor + ", electrica=" + electrica + '}';
    }
    
}
