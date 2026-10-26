package Productos;

public class PanDeAjo {

    private String guarnicion;
    private double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGuarnicion() {
        return guarnicion;
    }

    public void setGuarnicion(String guarnicion) {
        this.guarnicion = guarnicion;
    }

    public PanDeAjo() {
    }

    public PanDeAjo(String guarnicion, double precio) {
        this.guarnicion = guarnicion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return guarnicion + precio ;
    }


}
