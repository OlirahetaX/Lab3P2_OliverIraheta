
package lab3p2_oliveriraheta;


public class Bus extends Vehiculos{
    private int pasajeros;
    private String tipo;

    public Bus() {
        super();
    }

    public Bus(int pasajeros, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        super(color, marca, modelo, anioFab, precio, llantas);
        this.pasajeros = pasajeros;
        setTipo(pasajeros);
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
        setTipo(pasajeros);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(int pasajeros) {
        if (pasajeros<51) {
            tipo = "Rapidito";
        }else{
            tipo = "De Ruta";
        } 
    }

    @Override
    public String toString() {
        return "\n                 -> [BUS] Pasajeros = " + pasajeros + " / Tipo = " + tipo ;
    }
    
}
