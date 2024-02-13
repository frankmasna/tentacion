package Ejercicio02;

import java.util.Scanner;

public class ejercicios18 {
    public class NumerosIncremento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Introduce el primer número entero:");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo número entero (distinto del primero):");
        int numero2 = scanner.nextInt();
        while (numero1 == numero2) {
            System.out.println("Los números introducidos son iguales. Introduce un segundo número distinto:");
            numero2 = scanner.nextInt();
        }
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);
        System.out.println("Los números enteros comprendidos entre " + menor + " y " + mayor + " son:");
        for (int i = menor; i <= mayor; i += 7) {
            System.out.println(i);
        }

        scanner.close();
    }
}
}
