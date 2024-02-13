package Ejercicio02;

import java.util.Scanner;

public class ejercicioss09 {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número inicial: ");
        int numeroInicial = scanner.nextInt();

        System.out.println("Número | Cuadrado | Cubo");
        System.out.println("--------------------------");

        for (int i = numeroInicial; i < numeroInicial + 5; i++) {
            int cuadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%-7d| %-9d| %-6d%n", i, cuadrado, cubo);
        }

        scanner.close();
    }
}
}
