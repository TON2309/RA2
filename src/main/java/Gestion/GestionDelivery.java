package Gestion;

import Interfaces.Delivery;
import Venta.Boleta;
import java.util.Date;
import Entidades.Repartidor;
import java.util.ArrayList;

public class GestionDelivery extends Boleta implements Delivery {

    private String direccion;
    private double envio;
    private Repartidor repartidor;

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEnvio(double envio) {
        this.envio = envio;
    }

    public GestionDelivery() {
    }

    public GestionDelivery(String direccion, double envio) {
        this.direccion = direccion;
        this.envio = envio;
    }

    public GestionDelivery(String direccion, double envio, String IDBoleta, Date fecha) {
        super(IDBoleta, fecha);
        this.direccion = direccion;
        this.envio = envio;
    }

    @Override
    public String toString() {
        return "GestionDelivery{" + "direccion=" + direccion + ", envio=" + envio + ", estado=" + '}';
    }

    @Override
    public void registrarPedido() {
        direccion = null;
        repartidor = null;
        envio = 0;
        super.registrarPedido();
        registrarDireccion();
        calcularCostoEnvio();
        System.out.println("Costo de envio: S/ " + envio);
    }

    @Override
    public void registrarDireccion() {
        System.out.println("Ingrese la direccion de entrega: ");
        direccion = sc.nextLine();
        System.out.println("Direccion registrada: " + direccion);
    }

    @Override
    public void asignarRepartidor() {
        ArrayList<Repartidor> listaRepartidores = new ArrayList<>();
        repartidores(listaRepartidores);
        for (int i = 0; i < listaRepartidores.size(); i++) {
            Repartidor r = listaRepartidores.get(i);
            System.out.println((i + 1) + ". " + r.getIDrepartidor() + " - " + r.getNombre() + " " + r.getApellido());
        }
        System.out.println("Escoja el repartidor: ");
        int opc = sc.nextInt();
        sc.nextLine();
        if (opc >= 1 && opc <= listaRepartidores.size()) {
            repartidor = listaRepartidores.get(opc - 1);
            System.out.println("Repartidor asignado: " + repartidor.getNombre() + " " + repartidor.getApellido());
        } else {
            System.out.println("Opcion invalida");
        }
    }

    @Override
    public void calcularCostoEnvio() {
        envio = cantidadPizzas * 2.00;
    }

    @Override
    public void calcularTotal() {
        System.out.println("Envio: S/ " + envio);
        System.out.println("Total a pagar (con envio): S/ " + (getTotal() + envio));
    }

    @Override
    public void generarBoleta() {
        if (direccion == null) {
            registrarDireccion();
        }
        if (repartidor == null) {
            asignarRepartidor();
        }
        calcularCostoEnvio();
        super.generarBoleta();
        System.out.println("Direccion: " + direccion);
        if (repartidor == null) {
            System.out.println("Repartidor: Sin asignar");
        } else {
            System.out.println("Repartidor: " + repartidor.getNombre() + " " + repartidor.getApellido());
        }
    }

    @Override
    public void cancelarPedido() {
        super.cancelarPedido();
        direccion = null;
        repartidor = null;
        envio = 0;
    }

    public void repartidores(ArrayList<Repartidor> listaRepartidores) {
        Repartidor r1 = new Repartidor("R001", "Carlos", "Quispe", "45871236", "987654321");
        Repartidor r2 = new Repartidor("R002", "Luis", "Mamani", "70215483", "956321478");
        Repartidor r3 = new Repartidor("R003", "Miguel", "Torres", "62348915", "912456783");
        listaRepartidores.add(r1);
        listaRepartidores.add(r2);
        listaRepartidores.add(r3);

    }

}
