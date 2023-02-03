
package lab3p2_oliveriraheta;


public class Vehiculos {
    protected String color,marca,modelo;
    protected int anioFab,precio,llantas;

    public Vehiculos() {
    }

    public Vehiculos(String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.anioFab = anioFab;
        this.precio = precio;
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public int getPrecio() {
        return precio;
    }

    public int getLlantas() {
        return llantas;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", anioFab=" + anioFab + ", precio=" + precio + ", llantas=" + llantas + '}';
    }
    

}