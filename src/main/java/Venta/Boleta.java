package Venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import Interfaces.Pedidos;
import Productos.Bebidas;
import Productos.PanDeAjo;
import Productos.Pizza;

public class Boleta extends Pedido implements Pedidos {

    private String IDBoleta;
    private static int contador = 0;
    private String detalle = "";
    protected Scanner sc = new Scanner(System.in);
    protected int cantidadPizzas;

    public String getIDBoleta() {
        return IDBoleta;
    }

    public void setIDBoleta(String IDBoleta) {
        this.IDBoleta = IDBoleta;
    }

    public Boleta() {
    }

    public Boleta(String IDBoleta, Date fecha) {
        this.IDBoleta = IDBoleta;

    }

    @Override
    public String toString() {
        return "Boleta{" + "IDBoleta=" + IDBoleta + '}';
    }

    @Override
    public void registrarPedido() {
        ArrayList<Pizza> listaPizzas = new ArrayList<>();
        ArrayList<Bebidas> listaBebidas = new ArrayList<>();
        ArrayList<PanDeAjo> listaPanDeAjo = new ArrayList<>();
        ArrayList<String> pedido = new ArrayList<>();
        Pizzas(listaPizzas);
        Bebidas(listaBebidas);
        PanDeAjo(listaPanDeAjo);
        setTotal(0);
        setIDBoleta(null);
        setFecha(new Date());
        cantidadPizzas = 0;

        System.out.println("====PEDIDO===");
        System.out.println("Ingrese su nombre: ");
        setNombre(sc.nextLine());
        System.out.println("Ingrese su apellido: ");
        setApellido(sc.nextLine());
        System.out.println("Ingrese su DNI: ");
        setDni(sc.nextLine());
        System.out.println("Ingrese su telefono: ");
        setTelefono(sc.nextLine());
        System.out.println("Ingrese su ID: ");
        setIDcliente(sc.nextLine());

        for (int i = 0; i < listaPizzas.size(); i++) {
            System.out.println((i + 1) + ". " + listaPizzas.get(i));
        }
        System.out.println("Escoja la pizza que desee: ");
        int p = sc.nextInt();
        sc.nextLine();
        if (p >= 1 && p <= listaPizzas.size()) {
            pedido.add("Pizza: " + listaPizzas.get(p - 1));
            setTotal(getTotal() + listaPizzas.get(p - 1).getPrecio());
            cantidadPizzas++;
        }

        for (int i = 0; i < listaBebidas.size(); i++) {
            System.out.println((i + 1) + ". " + listaBebidas.get(i));
        }
        System.out.println("Escoja la bebida que desee (0 = ninguna): ");
        int b = sc.nextInt();
        sc.nextLine();
        if (b >= 1 && b <= listaBebidas.size()) {
            pedido.add("Bebida: " + listaBebidas.get(b - 1));
            setTotal(getTotal() + listaBebidas.get(b - 1).getPrecio());
        }

        for (int i = 0; i < listaPanDeAjo.size(); i++) {
            System.out.println((i + 1) + ". " + listaPanDeAjo.get(i));
        }
        System.out.println("Escoja el pan de ajo que desee (0 = ninguno): ");
        int pda = sc.nextInt();
        sc.nextLine();
        if (pda >= 1 && pda <= listaPanDeAjo.size()) {
            pedido.add("Pan de ajo: " + listaPanDeAjo.get(pda - 1));
            setTotal(getTotal() + listaPanDeAjo.get(pda - 1).getPrecio());
        }

        detalle = "";
        for (int i = 0; i < pedido.size(); i++) {
            detalle += pedido.get(i) + "\n";
        }
        System.out.println("Pedido registrado");
    }

    @Override
    public void calcularTotal() {
        System.out.println("Total a pagar: S/ " + getTotal());
    }

    @Override
    public void generarBoleta() {
        if (getIDBoleta() == null) {
            contador++;
            setIDBoleta(String.format("B%03d", contador));
        }
        System.out.println("\n===== BOLETA =====");
        System.out.println("Boleta: " + getIDBoleta());
        System.out.println("Fecha: " + getFecha());
        System.out.println("Cliente: " + getNombre() + " " + getApellido());
        System.out.println("DNI: " + getDni());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("--------------------");
        System.out.print(detalle);
        System.out.println("--------------------");
        calcularTotal();
    }

    @Override
    public void cancelarPedido() {
        detalle = "";
        setTotal(0);
        setIDBoleta(null);
        cantidadPizzas = 0;
        System.out.println("Pedido cancelado.");
    }

    public void Pizzas(ArrayList<Pizza> lista) {
        Pizza v1 = new Pizza("vegetariana", "personal", 22.00);
        Pizza v2 = new Pizza("vegetariana", "familiar", 35.00);
        Pizza v3 = new Pizza("vegetariana", "extragrande", 45.00);
        Pizza h1 = new Pizza("hawaina", "personal", 24.00);
        Pizza h2 = new Pizza("hawaina", "familiar", 38.00);
        Pizza h3 = new Pizza("hawaina", "exragrande", 48.00);
        Pizza a1 = new Pizza("americana", "personal", 25.00);
        Pizza a2 = new Pizza("americana", "familiar", 40.00);
        Pizza a3 = new Pizza("americana", "extragrande", 50.00);
        Pizza p1 = new Pizza("pepperoni", "personal", 23.00);
        Pizza p2 = new Pizza("pepperoni", "familiar", 36.00);
        Pizza p3 = new Pizza("pepperoni", "extragrande", 46.00);
        Pizza f1 = new Pizza("fullhouse", "personal", 28.00);
        Pizza f2 = new Pizza("fullhouse", "familiar", 45.00);
        Pizza f3 = new Pizza("fullhouse", "extragrande", 58.00);
        lista.add(v1);
        lista.add(v2);
        lista.add(v3);
        lista.add(h1);
        lista.add(h2);
        lista.add(h3);
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
    }

    public void Bebidas(ArrayList<Bebidas> lista) {
        Bebidas c1 = new Bebidas("Coca-Cola personal", 3.50);
        Bebidas c2 = new Bebidas("Coca-Cola de 1L", 6.00);
        Bebidas c3 = new Bebidas("Coca-Cola de 3L", 12.00);
        Bebidas i1 = new Bebidas("Inca Kola personal", 3.50);
        Bebidas i2 = new Bebidas("Inca Kola de 1L", 6.00);
        Bebidas i3 = new Bebidas("Inca Kola de 3L", 12.00);
        Bebidas m1 = new Bebidas("Jarra de maracuya de 1/2 L", 3.00);
        Bebidas m2 = new Bebidas("Jarra de maracuya de 1 L", 5.00);
        Bebidas m3 = new Bebidas("Jarra de maracuya de 2 L", 9.00);
        Bebidas cm1 = new Bebidas("Jarra de chicha morada de 1/2 L", 3.00);
        Bebidas cm2 = new Bebidas("Jarra de chicha morada de 1 L", 5.00);
        Bebidas cm3 = new Bebidas("Jarra de chicha morada de 2 L", 9.00);
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(i1);
        lista.add(i2);
        lista.add(i3);
        lista.add(m1);
        lista.add(m2);
        lista.add(m3);
        lista.add(cm1);
        lista.add(cm2);
        lista.add(cm3);
    }

    public void PanDeAjo(ArrayList<PanDeAjo> lista) {
        PanDeAjo p1 = new PanDeAjo("2 Panes de ajo clasicos", 4.00);
        PanDeAjo p2 = new PanDeAjo("4 Panes de ajo clasicos", 7.00);
        PanDeAjo p3 = new PanDeAjo("2 Panes de ajo con mozzarella", 9.00);
        PanDeAjo p4 = new PanDeAjo("4 Panes de ajo con mozzarella", 13.00);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
    }
}
