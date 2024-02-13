package Ejercicio02;

import java.util.Scanner;

public class ejercicioss12 {
    public class SumaNumerosSiguientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();
        
        if(numero <= 0) {
            System.out.println("Error: Debe ingresar un número entero positivo.");
            return; 
        }
        long suma = 0;
        for(int i = numero + 1; i <= numero + 100; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + suma);
    
        scanner.close();
    }
}
}
