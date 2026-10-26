package Gestion;

import java.util.Scanner;

public class Menu {

    private static Scanner sc = new Scanner(System.in);

    public byte menu() {
        byte opc;
        do {
            System.out.println("\n===== PIZZERIA: LA MASA DORADA =====");
            System.out.println("1. Mesa");
            System.out.println("2. Delivery");
            System.out.println("3. Salir");
            System.out.print("Elegir opcion: ");
            opc = sc.nextByte();
            sc.nextLine();
        } while (!(opc >= 1 && opc <= 3));

        return opc;
    }

    public void control() {
        byte opc;
        do {
            opc = menu();
            switch (opc) {
                case 1 -> {
                    controlMesa();
                }
                case 2 -> {
                    controlDelivery();

                }
                case 3 -> {
                    System.out.println("Saliendo del sistema...");
                }

            }

        } while (opc != 3);

    }

    public byte menuMesa() {
        byte opc;
        do {
            System.out.println("\n===== PIZZERIA: LA MASA DORADA =====");
            System.out.println("1. Asignar mesa");
            System.out.println("2. Liberar mesa");
            System.out.println("3. Tomar pedido");
            System.out.println("4. Generar boleta");
            System.out.println("5. Cancelar pedido");
            System.out.println("6. Regresar al menu principal");
            System.out.print("Elegir opcion: ");
            opc = sc.nextByte();
            sc.nextLine();
        } while (!(opc >= 1 && opc <= 6));

        return opc;
    }

    public void controlMesa() {
        byte opc;
        GestionMesa mesa = new GestionMesa();
        do {
            opc = menuMesa();
            switch (opc) {
                case 1 -> {
                    mesa.asignarMesa();
                }
                case 2 -> {
                    mesa.liberarMesa();

                }
                case 3 -> {
                    mesa.registrarPedido();

                }
                case 4 -> {
                    mesa.generarBoleta();

                }
                case 5 -> {
                    mesa.cancelarPedido();

                }

            }

        } while (opc != 6);

    }

    public byte menuDelivery() {
        byte opc;
        do {
            System.out.println("\n===== PIZZERIA: LA MASA DORADA =====");
            System.out.println("1. Tomar pedido");
            System.out.println("2. Asignar Repartidor");
            System.out.println("3. Generar boleta");
            System.out.println("4. Cancelar pedido");
            System.out.println("5. Regresar al menu principal");
            System.out.print("Elegir opcion: ");
            opc = sc.nextByte();
            sc.nextLine();
        } while (!(opc >= 1 && opc <= 5));

        return opc;
    }

    public void controlDelivery() {
        byte opc;
        GestionDelivery entrega = new GestionDelivery();
        do {
            opc = menuDelivery();
            switch (opc) {
                case 1 -> {

                    entrega.registrarPedido();
                }
                case 2 -> {
                    entrega.asignarRepartidor();

                }
                case 3 -> {
                    entrega.generarBoleta();
                }
                case 4 -> {
                    entrega.cancelarPedido();

                }

            }

        } while (opc != 5);

    }
}