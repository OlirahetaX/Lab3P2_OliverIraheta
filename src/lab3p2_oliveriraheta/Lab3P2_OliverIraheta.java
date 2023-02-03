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
        System.out.println("""
                           1- Crear
                           2- Elimnar""");
        rm = new Scanner(System.in);
        int opc = rm.nextInt();

        switch (opc) {
            case 1 -> {
                System.out.println("\nIngrese nombre");
                rm = new Scanner(System.in);
                String name = rm.nextLine();

                System.out.println("\nIngrese ID");
                rm = new Scanner(System.in);
                int ID = rm.nextInt();

                System.out.println("\nIngrese saldo");
                rm = new Scanner(System.in);
                int saldo = rm.nextInt();

                clientess.add(new Cliente(ID + clientess.size() + 1, saldo, name));
            }
            case 2 -> {
                for (Cliente c : clientess) {
                    System.out.println(clientess.indexOf(c) + 1 + c.getName() + "\n");
                }
                System.out.println("Ingrese posicion a eliminar");
                rm = new Scanner(System.in);
                int pos = rm.nextInt();

                clientess.remove(pos - 1);
            }
        }
    }

    private static void cv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void vehi() {
        System.out.println("""
                           1- Crear
                           2- Mod
                           3- Elimnar""");
        rm = new Scanner(System.in);
        int opc = rm.nextInt();

        switch (opc) {
            case 1 ->
                crearVehi();
            case 2 ->
                modVehi();
            case 3 ->
                elimVehi();
        }
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

        concesionariass.add(new Concesionaria(name, Direccion, ID + concesionariass.size() + 1, saldo));
    }

    private static void modConse() {
        for (Concesionaria c : concesionariass) {
            System.out.println(concesionariass.indexOf(c) + 1 + c.getNombre() + " -> " + c.getDireccion() + "\n");
        }

        System.out.println("Ingrese posicion a mod");
        rm = new Scanner(System.in);
        int pos = rm.nextInt();

        System.out.println("Ingrese nueva direccion");
        rm = new Scanner(System.in);
        String dir = rm.next();

        concesionariass.get(pos - 1).setDireccion(dir);

    }

    private static void elimConse() {
        for (Concesionaria c : concesionariass) {
            System.out.println(concesionariass.indexOf(c) + 1 + c.getNombre() + " -> " + c.getDireccion() + "\n");
        }
        System.out.println("Ingrese posicion a eliminar");
        rm = new Scanner(System.in);
        int pos = rm.nextInt();

        concesionariass.remove(pos - 1);
    }

    private static void crearVehi() {
        for (Concesionaria c : concesionariass) {
            System.out.println(concesionariass.indexOf(c) + 1 + c.getNombre() + " -> " + c.getDireccion() + "\n");
        }

        System.out.println("Ingrese posicion a de concesionaria agregar");
        rm = new Scanner(System.in);
        int pos = rm.nextInt();

        System.out.println("\nIngrese color");
        rm = new Scanner(System.in);
        String color = rm.nextLine();

        System.out.println("\nIngrese marca");
        rm = new Scanner(System.in);
        String marca = rm.nextLine();

        System.out.println("\nIngrese modelo");
        rm = new Scanner(System.in);
        String modelo = rm.nextLine();

        System.out.println("Anio de fabricacion");
        rm = new Scanner(System.in);
        int anioFab = rm.nextInt();

        System.out.println("Ingrese precio");
        rm = new Scanner(System.in);
        int precio = rm.nextInt();

        boolean x = true;
        while (x) {
            System.out.println("Ingrese #LLantas");
            rm = new Scanner(System.in);
            int llantas = rm.nextInt();
            if (llantas == 2) {
                System.out.println("1.  MOTOCICLETA     2. BICICLETA");
                rm = new Scanner(System.in);
                int aa = rm.nextInt();
                if (aa == 1) {
                    crearMoto(pos, color, marca, modelo, anioFab, precio, llantas);
                } else {
                    crearBici(pos, color, marca, modelo, anioFab, precio, llantas);
                }
                x = false;
            } else if (llantas == 4) {
                System.out.println("1.  Carro     2. Camion de carga       3.Bus");
                rm = new Scanner(System.in);
                int aa = rm.nextInt();
                switch (aa) {
                    case 1 ->
                        crearCarro(pos, color, marca, modelo, anioFab, precio, llantas);
                    case 2 ->
                        crearCamion(pos, color, marca, modelo, anioFab, precio, llantas);
                    case 3 ->
                        crearBus(pos, color, marca, modelo, anioFab, precio, llantas);
                }
                x = false;
            }
        }

    }

    private static void crearMoto(int pos, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        System.out.println("Ingrese Desplazamiento de Motor");
        rm = new Scanner(System.in);
        String desplazamientoMotor = rm.nextLine();

        System.out.println("Es electrica? 1- Si      2- No");
        rm = new Scanner(System.in);
        int s = rm.nextInt();

        if (s == 1) {
            concesionariass.get(pos).getConVehi().add(new Moto(desplazamientoMotor, true, color, marca, modelo, anioFab, precio, llantas));
        } else {
            concesionariass.get(pos).getConVehi().add(new Moto(desplazamientoMotor, false, color, marca, modelo, anioFab, precio, llantas));
        }
    }

    private static void crearBici(int pos, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        System.out.println("Ingrese descripcion");
        rm = new Scanner(System.in);
        String descripcion = rm.nextLine();

        System.out.println("Ingrese tipo");
        rm = new Scanner(System.in);
        String tipo = rm.nextLine();

        System.out.println("Ingrese radio de la Rueda");
        rm = new Scanner(System.in);
        double radioRueda = rm.nextDouble();

        concesionariass.get(pos).getConVehi().add(new Bici(descripcion, tipo, radioRueda, color, marca, modelo, anioFab, precio, llantas));
    }

    private static void crearCarro(int pos, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        System.out.println("Ingrese descripcion del Motor");
        rm = new Scanner(System.in);
        String descripcionMotor = rm.nextLine();

        System.out.println("Ingrese velocidad Max");
        rm = new Scanner(System.in);
        double veloMax = rm.nextDouble();

        System.out.println("Ingrese #puertas");
        rm = new Scanner(System.in);
        int puertas = rm.nextInt();

        concesionariass.get(pos).getConVehi().add(new Carro(puertas, descripcionMotor, veloMax, color, marca, modelo, anioFab, precio, llantas));
    }

    private static void crearCamion(int pos, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        System.out.println("Ingrese volumen maximo de carga");
        rm = new Scanner(System.in);
        double maxCarga = rm.nextDouble();

        System.out.println("Ingrese altura");
        rm = new Scanner(System.in);
        double altura = rm.nextDouble();

        System.out.println("Tiene retroexcavadora? 1- Si      2- No");
        rm = new Scanner(System.in);
        int s = rm.nextInt();

        if (s == 1) {
            concesionariass.get(pos).getConVehi().add(new Camion(maxCarga, altura, true, color, marca, modelo, anioFab, precio, llantas));
        } else {
            concesionariass.get(pos).getConVehi().add(new Camion(maxCarga, altura, false, color, marca, modelo, anioFab, precio, llantas));
        }
    }

    private static void crearBus(int pos, String color, String marca, String modelo, int anioFab, int precio, int llantas) {
        System.out.println("Ingrese Cantidad Max de Pasajeros");
        rm = new Scanner(System.in);
        int pasajeros = rm.nextInt();

        concesionariass.get(pos).getConVehi().add(new Bus(pasajeros, color, marca, modelo, anioFab, precio, llantas));

    }

}
