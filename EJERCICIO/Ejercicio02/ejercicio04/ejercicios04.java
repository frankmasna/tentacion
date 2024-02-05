package Ejercicio02.ejercicio04;

import java.util.Scanner;

public class ejercicios04 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Por favor, introduzca el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ahora introduzca el valor de b: ");
        double b = scanner.nextDouble();
        if (a != 0) {
            double x = -b / a;
            System.out.println("x = " + x);
        } else {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("Esa ecuación no tiene solución real.");
            }
        }

        scanner.close();
    }
}
