package Venta;

import Entidades.Cliente;
import java.util.Date;

public class Pedido extends Cliente {

    private String IDPedido;
    private Date fecha;
    private double total;

    public String getIDPedido() {
        return IDPedido;
    }

    public void setIDPedido(String IDPedido) {
        this.IDPedido = IDPedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pedido() {
    }

    public Pedido(String IDPedido, Date fecha, double total) {
        this.IDPedido = IDPedido;
        this.fecha = fecha;
        this.total = total;
    }

    public Pedido(String IDPedido, Date fecha, double total, String IDcliente) {
        super(IDcliente);
        this.IDPedido = IDPedido;
        this.fecha = fecha;
        this.total = total;
    }

    public Pedido(String IDPedido, Date fecha, double total, String IDcliente, String nombre, String apellido, String dni, String telefono) {
        super(IDcliente, nombre, apellido, dni, telefono);
        this.IDPedido = IDPedido;
        this.fecha = fecha;
        this.total = total;
    }

}
