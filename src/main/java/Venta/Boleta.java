package Venta;

import java.util.Date;
import Productos.Bebidas;
import Productos.PanDeAjo;
import Productos.Pizza;
import Interfaces.Venta;

public class Boleta extends Pedido implements Venta {

    private String IDBoleta;

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

    public void Pizzas() {
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
    }

    public void Bebidas() {
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
    }

    public void PanDeAjo() {
        PanDeAjo p1 = new PanDeAjo("2 Panes de ajo clasicos", 4.00);
        PanDeAjo p2 = new PanDeAjo("4 Panes de ajo clasicos", 7.00);
        PanDeAjo p3 = new PanDeAjo("2 Panes de ajo con mozzarella", 9.00);
        PanDeAjo p4 = new PanDeAjo("4 Panes de ajo con mozzarella", 13.00);
    }

    @Override
    public void registrarPedido() {

    }

    @Override
    public void calcularTotal() {

    }

    @Override
    public void generarBoleta() {

    }

    @Override
    public void cancelarPedido() {

    }
}
