
package Entidades;

public class Cajero extends Persona {
   private String IDcajero;

    public String getIDcajero() {
        return IDcajero;
    }

    public void setIDcajero(String IDcajero) {
        this.IDcajero = IDcajero;
    }

    public Cajero() {
    }

    public Cajero(String IDcajero) {
        this.IDcajero = IDcajero;
    }

    public Cajero(String IDcajero, String nombre, String apellido, String dni, String telefono, String email) {
        super(nombre, apellido, dni, telefono, email);
        this.IDcajero = IDcajero;
    }


    @Override
    public String toString() {
        return "Cajero{" + "IDcajero=" + IDcajero + '}';
    }

   
}
