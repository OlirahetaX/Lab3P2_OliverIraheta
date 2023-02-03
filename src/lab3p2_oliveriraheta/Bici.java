
package lab3p2_oliveriraheta;


public class Bici extends Vehiculos{
    private String descripcion,tipo;
    private double radioRueda;

    public Bici() {
    super();
   }

    public Bici(String descripcion, String tipo, double radioRueda, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        super(color, marca, modelo, anioFab, precio, llantas);
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.radioRueda = radioRueda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getRadioRueda() {
        return radioRueda;
    }

    public void setRadioRueda(double radioRueda) {
        this.radioRueda = radioRueda;
    }

    @Override
    public String toString() {
        return "Bici{" + "descripcion=" + descripcion + ", tipo=" + tipo + ", radioRueda=" + radioRueda + '}';
    }
    
     
}
