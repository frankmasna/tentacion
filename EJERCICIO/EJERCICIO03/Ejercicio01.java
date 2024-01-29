package EJERCICIO03;

import java.util.Scanner;

public class Ejercicio01 {
     public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        // Leer el primer número
        double numero1 = scanner.nextDouble();
    
        System.out.print("Ingrese el segundo número: ");
        // Leer el segundo número
        double numero2 = scanner.nextDouble();
        scanner.close();

        double resultado = numero1 * numero2;

        // Mostrar el resultado de la multiplicación
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
