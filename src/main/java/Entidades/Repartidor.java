package Entidades;

public class Repartidor extends Persona {

    private String IDrepartidor;

    public String getIDrepartidor() {
        return IDrepartidor;
    }

    public void setIDrepartidor(String IDrepartidor) {
        this.IDrepartidor = IDrepartidor;
    }

    public Repartidor() {
    }

    public Repartidor(String IDrepartidor) {
        this.IDrepartidor = IDrepartidor;
    }

    public Repartidor(String IDrepartidor, String nombre, String apellido, String dni, String telefono) {
        super(nombre, apellido, dni, telefono);
        this.IDrepartidor = IDrepartidor;
    }

    @Override
    public String toString() {
        return "Repartidor{" + "IDrepartidor=" + IDrepartidor + '}';
    }

}
