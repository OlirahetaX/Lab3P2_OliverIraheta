package lab3p2_oliveriraheta;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_OliverIraheta {

    static ArrayList<Vehiculos> vehiculoss = new ArrayList();
    static ArrayList<Cliente> clientess = new ArrayList();
    static ArrayList<Concesionaria> concesionariass = new ArrayList();

    static Scanner rm = new Scanner(System.in);

    public static void main(String[] args) {
        int x = 0;
        while (x != 5) {
            System.out.println("""
                               1- Concesionaria
                               2- Clientes
                               3- Vehiculos
                               4- Compra/Venta Clientes
                               5- Salir""");

            rm = new Scanner(System.in);
            x = rm.nextInt();

            switch (x) {
                case 1 ->
                    conse();
                case 2 ->
                    cliente();
                case 3 ->
                    vehi();
                case 4 ->
                    cv();
            }
        }
    }

    private static void conse() {
        System.out.println("""
                           1- Crear
                           2- Mod
                           3- Elimnar""");
        rm = new Scanner(System.in);
        int opc = rm.nextInt();

        switch (opc) {
            case 1 ->
                crearConse();
            case 2 ->
                modConse();
            case 3 ->
                elimConse();
        }
    }

    private static void cliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void cv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void vehi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void crearConse() {
        System.out.println("\nIngrese nombre");
        rm = new Scanner(System.in);
        String name = rm.nextLine();

        System.out.println("\nIngrese Direccion");
        rm = new Scanner(System.in);
        String Direccion = rm.nextLine();

        System.out.println("\nIngrese ID");
        rm = new Scanner(System.in);
        int ID = rm.nextInt();

        System.out.println("\nIngrese saldo");
        rm = new Scanner(System.in);
        int saldo = rm.nextInt();

        concesionariass.add(new Concesionaria(name, Direccion, ID, saldo));
    }

    private static void modConse() {
        for (Concesionaria c : concesionariass) {
            System.out.println(concesionariass.indexOf(c)+1+c.getNombre()+" -> "+c.getDireccion()+"\n");
        }
        System.out.println("Ingrese posicion a mod");
        rm = new Scanner(System.in);
        int pos = rm.nextInt();
        
        System.out.println("Ingrese nueva direccion");
        rm = new Scanner(System.in);
        String dir = rm.next();
        
        concesionariass.get(pos-1).setDireccion(dir);
        
    }

    private static void elimConse() {
    }

}
