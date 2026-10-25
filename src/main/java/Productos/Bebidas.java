package Productos;

public class Bebidas {

     private String tipo;
    private double precio;

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public Bebidas() {
    }

    public Bebidas(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "tipo=" + tipo + ", precio=" + precio + '}';
    }


}
