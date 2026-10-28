package Gestion;

import Interfaces.Delivery;
import Venta.Boleta;
import java.util.Date;
import Entidades.Repartidor;

public class GestionDelivery extends Boleta implements Delivery {

    private String direccion;
    private double envio;

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
        return "GestionDelivery{" + "direccion=" + direccion + ", envio=" + envio;
    }

    public void repartidores() {
        Repartidor r1 = new Repartidor("R001", "Carlos", "Quispe", "45871236", "987654321");
        Repartidor r2 = new Repartidor("R002", "Luis", "Mamani", "70215483", "956321478");
        Repartidor r3 = new Repartidor("R003", "Miguel", "Torres", "62348915", "912456783");

    }

    @Override
    public void registrarDireccion() {
  
    }

    @Override
    public void asignarRepartidor() {

    }

    @Override
    public void calcularCostoEnvio() {
     
    }

}
