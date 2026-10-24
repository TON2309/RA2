package Productos;

public class Bebidas {

    private double precio;
    private String tipo;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Bebidas() {
    }

    public Bebidas(double precio, String tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "precio=" + precio + ", tipo=" + tipo + '}';
    }
}
