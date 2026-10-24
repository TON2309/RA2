package Venta;

import Entidades.Cliente;
import java.util.Date;

public class Pedido extends Cliente {

    private String IDPedido;
    private Date fecha;
    private double total;
    private boolean estado;

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Pedido() {
    }

    public Pedido(String IDPedido, Date fecha, double total, boolean estado) {
        this.IDPedido = IDPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public Pedido(String IDPedido, Date fecha, double total, boolean estado, String IDcliente) {
        super(IDcliente);
        this.IDPedido = IDPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    public Pedido(String IDPedido, Date fecha, double total, boolean estado, String IDcliente, String nombre, String apellido, String dni, String telefono, String email) {
        super(IDcliente, nombre, apellido, dni, telefono, email);
        this.IDPedido = IDPedido;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "IDPedido=" + IDPedido + ", fecha=" + fecha + ", total=" + total + ", estado=" + estado + '}';
    }

}
