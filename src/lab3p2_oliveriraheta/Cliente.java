
package lab3p2_oliveriraheta;

import java.util.ArrayList;


public class Cliente {
    private int id,saldo;
    private String name;
    private ArrayList<Vehiculos> Cvehi  = new ArrayList();

    public Cliente() {
    }

    public Cliente(int id, int saldo, String name) {
        this.id = id;
        this.saldo = saldo;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehiculos> getCvehi() {
        return Cvehi;
    }

    public void setCvehi(ArrayList<Vehiculos> Cvehi) {
        this.Cvehi = Cvehi;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", saldo=" + saldo + ", name=" + name + ", Cvehi=" + Cvehi + '}';
    }
    
    
}
