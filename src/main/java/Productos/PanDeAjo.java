package Productos;

public class PanDeAjo {

    private double precio;
    private int guarnicion;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getGuarnicion() {
        return guarnicion;
    }

    public void setGuarnicion(int guarnicion) {
        this.guarnicion = guarnicion;
    }

    public PanDeAjo() {
    }

    public PanDeAjo(double precio, int guarnicion) {
        this.precio = precio;
        this.guarnicion = guarnicion;
    }

    @Override
    public String toString() {
        return "PanDeAjo{" + "precio=" + precio + ", guarnicion=" + guarnicion + '}';
    }

}
