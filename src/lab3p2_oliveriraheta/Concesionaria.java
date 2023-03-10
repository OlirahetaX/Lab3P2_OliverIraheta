
package lab3p2_oliveriraheta;

import java.util.ArrayList;


public class Concesionaria {
    private String nombre,direccion;
    private int ID;
    private double saldo;
    private ArrayList<Vehiculos> conVehi  = new ArrayList();
    private ArrayList<Cliente> clientes  = new ArrayList();

    public Concesionaria() {
    }

    public Concesionaria(String nombre, String direccion, int ID, int saldo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ID = ID;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Vehiculos> getConVehi() {
        return conVehi;
    }

    public void setConVehi(ArrayList<Vehiculos> conVehi) {
        this.conVehi = conVehi;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre + " / Direccion = " + direccion + " / ID = " + ID + " / Saldo = " + saldo + " / Vehiculos = " + conVehi + " / Clientes = " + clientes ;
    }
    
}
