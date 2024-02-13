package Ejercicio02;

import java.util.Scanner;

public class ejercicioss10 {
    public class ContadorPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;
        System.out.println("Ingresa diez números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            }
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        scanner.close();
    }
}
}
