package Pasear;

import java.util.Scanner;

public class PaseadorDePerros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("INGRESE LA CANTIDAD DE PERROS GRANDES:");
        int cantidadPerrosGrandes = scanner.nextInt();

        System.out.println("INGRESE LA CANTIDAD DE PERROS MEDIANOS:");
        int cantidadPerrosMedianos = scanner.nextInt();

        System.out.println("INGRESE LA CANTIDAD DE PERROS PEQUEÑOS:");
        int cantidadPerrosPequenos = scanner.nextInt();

        System.out.println("INGRESE LA CANTIDAD DE HORAS PARA TODOS LOS PERROS:");
        int horas = scanner.nextInt();

        float totalCobro = 0;

        totalCobro += calcularCobroPorTipo(cantidadPerrosGrandes, 1, horas); // Grande
        totalCobro += calcularCobroPorTipo(cantidadPerrosMedianos, 2, horas); // Mediano
        totalCobro += calcularCobroPorTipo(cantidadPerrosPequenos, 3, horas); // Pequeño

        // Aplicar descuento del 10% si hay más de un perro
        int totalPerros = cantidadPerrosGrandes + cantidadPerrosMedianos + cantidadPerrosPequenos;
        if (totalPerros > 1) {
            float descuento = totalCobro * 0.1f;
            totalCobro -= descuento;
        }

        if (totalCobro > 0) {
            System.out.println("TOTAL A PAGAR POR " + totalPerros + " PERROS: " + totalCobro + " $");
        }

        scanner.close();
    }

    private static int calcularCobroPorTipo(int cantidadPerros, int tipoPerro, int horas) {
        int cobroPorTipo = 0;

        switch (tipoPerro) {
            case 1:
                if (horas < 1) {
                    cobroPorTipo = 10000;
                } else {
                     cobroPorTipo = (horas * 10000);
                }
                break;
            case 2:
                if (horas < 1) {
                    cobroPorTipo =  5000;
                } else {
                    cobroPorTipo =  (horas * 5000);
                }
                break;
            case 3:
                if (horas < 1) {
                    cobroPorTipo = 3000;
                } else {
                    cobroPorTipo = horas * 3000;
                }
                break;
            default:
                System.out.println("INCORRECTO");
                break;
        }

        return cobroPorTipo * cantidadPerros;
    }
}