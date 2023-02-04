
package lab3p2_oliveriraheta;

public class Carro extends Vehiculos{
    private int puertas;
    private String descripcionMotor;
    private double veloMax;

    public Carro() {
        super();
    }

    public Carro(int puertas, String descripcionMotor, double veloMax, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        super(color, marca, modelo, anioFab, precio, llantas);
        this.puertas = puertas;
        this.descripcionMotor = descripcionMotor;
        this.veloMax = veloMax;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getDescripcionMotor() {
        return descripcionMotor;
    }

    public void setDescripcionMotor(String descripcionMotor) {
        this.descripcionMotor = descripcionMotor;
    }

    public double getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(double veloMax) {
        this.veloMax = veloMax;
    }

    @Override
    public String toString() {
        return "\n                 -> [Carro] " + " Puertas = " + puertas + " / Descripcion DEL Motor = " + descripcionMotor + " / Velocidad Maxima = " + veloMax;
    }
    
    
}
