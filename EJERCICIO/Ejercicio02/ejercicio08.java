package Ejercicio02;

import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        if (esPar(numero)) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " no es un número par.");
        }
        if (esDivisibleEntre5(numero)) {
            System.out.println(numero + " es divisible entre 5.");
        } else {
            System.out.println(numero + " no es divisible entre 5.");
        }
        scanner.close();
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    public static boolean esDivisibleEntre5(int numero) {
        return numero % 5 == 0;
    }
}
