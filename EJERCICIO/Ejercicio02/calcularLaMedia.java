package Ejercicio02;

import java.util.Scanner;

public class calcularLaMedia {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer tres números decimales
        System.out.print("Ingrese el primer número decimal: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número decimal: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número decimal: ");
        double num3 = scanner.nextDouble();

        // Calcular la media aritmética
        double media = (num1 + num2 + num3) / 3;

        // Mostrar el resultado
        System.out.println("La media aritmética es: " + media);

        // Cerrar el escáner
        scanner.close();
    }   
}
