package Productos;

public class Pizza {
    private String tipo;
    private String tamaño;
    private double precio;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pizza() {
    }

    public Pizza(String tipo, String tamaño, double precio) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    

    

}
