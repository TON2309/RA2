package Gestion;

import Interfaces.Mesa;
import Venta.Boleta;
import java.util.Date;
import java.util.Scanner;

public class GestionMesa extends Boleta implements Mesa {

    private int mesa;
    private int[] mesas = new int[10];
    private static Scanner sc = new Scanner(System.in);

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
        for (int i = 0; i < mesas.length; i++) {
            if (mesas[i] == 0) {
                mesas[i] = 1;
                mesa = i + 1;
                System.out.println("Su mesa es la numero " + mesa);
                return;
            }
        }
        System.out.println("Todas las mesas estan ocupadas, necesita liberar una mesa");

    }

    @Override
    public void liberarMesa() {
        System.out.println("Ingrese el numero de mesa que desee liberar");
        int m = sc.nextInt();
        sc.nextLine();
        if (m < 1 || m > 10) {
            System.out.println("Numero de mesa invalido");
        } else {
            mesas[m - 1] = 0;
            System.out.println("Mesa " + m + " liberada");
        }
    }
}
