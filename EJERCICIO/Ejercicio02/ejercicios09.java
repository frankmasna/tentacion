package Ejercicio02;

import java.util.Scanner;

public class ejercicios09 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = scanner.nextDouble();
        scanner.nextLine();  

        System.out.print("Introduzca el tipo de IMPUESTO (general, reducido o superreducido): ");
        String tipoImpuesto = scanner.nextLine().toLowerCase();

        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = scanner.nextLine().toLowerCase();
        double porcentajeImpuesto;
        switch (tipoImpuesto) {
            case "general":
                porcentajeImpuesto = 0.21;
                break;
            case "reducido":
                porcentajeImpuesto = 0.10;
                break;
            case "superreducido":
                porcentajeImpuesto = 0.04;
                break;
            default:
                System.out.println("Tipo de IMPUESTO no válido. Se aplicará el tipo general (21%).");
                porcentajeImpuesto = 0.21;
        }

        double impuesto = baseImponible * porcentajeImpuesto;
        double precioConImpuesto = baseImponible + impuesto;
        double descuento = 0;
        switch (codigoPromocional) {
            case "nopro":
                break;
            case "mitad":
                descuento = precioConImpuesto / 2;
                break;
            case "meno5":
                descuento = 5;
                break;
            case "5porc":
                descuento = precioConImpuesto * 0.05;
                break;
            default:
                System.out.println("Código promocional no válido. No se aplicará descuento.");
        }

        double precioFinal = precioConImpuesto - descuento;
        
        System.out.println("Base imponible\t\t" + baseImponible);
        System.out.println("IMPUESTO (" + (porcentajeImpuesto * 100) + "%)\t\t" + impuesto);
        System.out.println("Precio con IMPUESTO\t" + precioConImpuesto);
        System.out.println("Cód. promo. (" + codigoPromocional + "): \t-" + descuento);
        System.out.println("TOTAL\t\t\t\t" + precioFinal);

       
        scanner.close();
    }
}
