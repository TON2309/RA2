package Gestion;

import java.util.Scanner;

public class Menu {

    private static Scanner sc;

    public static double leerDecimal(String mensaje) {
        double valor;
        do {
            System.out.println(mensaje);
            valor = sc.nextDouble();

        } while (!(valor > 0));
        return valor;
    }

    public static String leerTexto(String mensaje) {
        String valor;
        do {
            System.out.println(mensaje);
            valor = sc.nextLine();

        } while (!(valor.length() > 0));
        return valor;
    }

    public static int leerEntero(String mensaje) {
        int valor;
        do {
            System.out.println(mensaje);
            valor = sc.nextInt();

        } while (!(valor > 0));
        return valor;
    }

    public byte menu() {
        byte opc;
        do {
            System.out.println("\n===== PIZZERIA: LA MASA DORADA =====");
            System.out.println("1. Asignar Mesa");
            System.out.println("2. Liberar Mesa");
            System.out.println("3. Tomar pedido para mesa");
            System.out.println("4. Tomar pedido para delivery");
            System.out.println("5. Generar boleta");
            System.out.println("6. Realizar Delivery");
            System.out.println("7. Salir");
            System.out.print("Elegir opcion: ");
            opc = sc.nextByte();
            sc.nextLine();
        } while (!(opc >= 1 && opc <= 7));

        return opc;
    }

    public void control() {
        byte opc;
        do {
            opc = menu();
            switch (opc) {
                case 1 -> {

                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                case 5 -> {

                }
                case 6 -> {

                }
                case 7 ->
                    System.out.println("Saliendo del sistema...");
            }

        } while (opc != 6);
    }

}
