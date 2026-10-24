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

    public Cliente(String IDcliente, String nombre, String apellido, String dni, String telefono, String email) {
        super(nombre, apellido, dni, telefono, email);
        this.IDcliente = IDcliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "IDcliente=" + IDcliente + '}';
    }

}
