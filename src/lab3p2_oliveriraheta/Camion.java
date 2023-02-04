
package lab3p2_oliveriraheta;


public class Camion extends Vehiculos{
    private double maxCarga,altura;
    private boolean retro;

    public Camion() {
        super();
    }

    public Camion(double maxCarga, double altura, boolean retro, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        super(color, marca, modelo, anioFab, precio, llantas);
        this.maxCarga = maxCarga;
        this.altura = altura;
        this.retro = retro;
    }

    public double getMaxCarga() {
        return maxCarga;
    }

    public void setMaxCarga(double maxCarga) {
        this.maxCarga = maxCarga;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isRetro() {
        return retro;
    }

    public void setRetro(boolean retro) {
        this.retro = retro;
    }

    @Override
    public String toString() {
        return "\n                 -> [CAMION]" + " Max Carga = " + maxCarga + " / Altura = " + altura + " / Retro = " + retro;
    }

    
    
    
}
