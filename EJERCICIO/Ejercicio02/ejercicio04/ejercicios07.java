package Ejercicio02.ejercicio04;

import java.util.Scanner;

public class ejercicios07 {
    public class CajaFuerte {
    public static void main(String[] args) {
        final int COMBINACION_CORRECTA = 1234;
        final int NUMERO_INTENTOS = 4;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a la caja fuerte.");
        System.out.println("Ingrese la combinación de 4 cifras para abrir la caja fuerte.");

        for (int intento = 0; intento < NUMERO_INTENTOS; intento++) {
            System.out.print("Intento " + (intento + 1) + ": ");
            int intentoUsuario = scanner.nextInt();
            
            if (intentoUsuario == COMBINACION_CORRECTA) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                return; 
            } else {
                System.out.println("Lo siento, esa no es la combinación.");
            }
        }
        
        System.out.println("Se han agotado los intentos. La caja fuerte permanece cerrada.");
    }
}
}
