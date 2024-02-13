package Ejercicio02;

import java.util.Scanner;

public class ejercicios08 {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        long numero = scanner.nextLong();
        
        int contadorDigitos = 0;
        
        // Manejamos el caso del número negativo convirtiéndolo a positivo
        if (numero < 0) {
            numero *= -1;
        }
        
        // Contamos los dígitos utilizando un bucle while
        while (numero > 0) {
            numero /= 10;
            contadorDigitos++;
        }
        
        System.out.println("El número tiene " + contadorDigitos + " dígitos.");
    }
}
}
