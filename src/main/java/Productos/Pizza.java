package Productos;

public class Pizza {

    private String masa;
    private String salsa;
    private String tamaño;
    private double precio;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
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

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public Pizza() {
    }

    public Pizza(String masa, String salsa, String tamaño, double precio, String ingrediente1, String ingrediente2, String ingrediente3) {
        this.masa = masa;
        this.salsa = salsa;
        this.tamaño = tamaño;
        this.precio = precio;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
        this.ingrediente3 = ingrediente3;
    }

    @Override
    public String toString() {
        return "Pizza{" + "masa=" + masa + ", salsa=" + salsa + ", tama\u00f1o=" + tamaño + ", precio=" + precio + ", ingrediente1=" + ingrediente1 + ", ingrediente2=" + ingrediente2 + ", ingrediente3=" + ingrediente3 + '}';
    }

}
