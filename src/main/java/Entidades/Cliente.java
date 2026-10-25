package Entidades;

public class Cliente extends Persona {

    private String IDcliente;

    public String getIDcliente() {
        return IDcliente;
    }

    public void setIDcliente(String IDcliente) {
        this.IDcliente = IDcliente;
    }

    public Cliente() {
    }

    public Cliente(String IDcliente) {
        this.IDcliente = IDcliente;
    }

    public Cliente(String IDcliente, String nombre, String apellido, String dni, String telefono) {
        super(nombre, apellido, dni, telefono);
        this.IDcliente = IDcliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IDcliente=" + IDcliente + '}';
    }

}
