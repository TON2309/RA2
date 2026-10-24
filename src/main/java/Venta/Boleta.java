package Venta;

import java.util.Date;

public class Boleta extends Pedido{

    private String IDBoleta;

    public String getIDBoleta() {
        return IDBoleta;
    }

    public void setIDBoleta(String IDBoleta) {
        this.IDBoleta = IDBoleta;
    }

    public Boleta() {
    }

    public Boleta(String IDBoleta, Date fecha) {
        this.IDBoleta = IDBoleta;

    }

    @Override
    public String toString() {
        return "Boleta{" + "IDBoleta=" + IDBoleta + '}';
    }

}
