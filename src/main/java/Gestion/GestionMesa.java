package Gestion;

import Interfaces.Mesa;
import Venta.Boleta;
import java.util.Date;

public class GestionMesa extends Boleta implements Mesa {

    private int mesa;

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public GestionMesa() {
    }

    public GestionMesa(int mesa) {
        this.mesa = mesa;
    }

    public GestionMesa(int mesa, String IDBoleta, Date fecha) {
        super(IDBoleta, fecha);
        this.mesa = mesa;
    }

    @Override
    public void asignarMesa() {
     
    }

    @Override
    public void liberarMesa() {
      
    }

}
