package Productos;

public class Agregados {

    private int cantidad;
    private double precio;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Agregados() {
    }

    public Agregados(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Agregados{" + "cantidad=" + cantidad + ", precio=" + precio + '}';
    }

}
