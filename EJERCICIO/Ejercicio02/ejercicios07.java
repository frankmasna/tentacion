package Ejercicio02;

import java.util.Scanner;

public class ejercicios07 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        ordenarNumeros(num1, num2, num3);
        scanner.close();
    }
    public static void ordenarNumeros(int a, int b, int c) {
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Números ordenados: " + a + ", " + b + ", " + c);
    }
}
