package EJERCICIO03;

import java.util.Scanner;

public class ejercicioS02 {
    public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 0;
        int maxRepeticiones = 0;
        int numeroMaxRepeticiones = 0;
        int repeticionesActuales = 1;
        int numeroAnterior = Integer.MIN_VALUE;
        
        System.out.println("Introduce números (introduce 0 para terminar):");
        
        while (true) {
            int numero = scanner.nextInt();
            contador++;
            
            if (numero == 0) {
                break;
            }
            
            if (numero == numeroAnterior) {
                repeticionesActuales++;
            } else {
                if (repeticionesActuales > maxRepeticiones) {
                    maxRepeticiones = repeticionesActuales;
                    numeroMaxRepeticiones = numeroAnterior;
                }
                repeticionesActuales = 1;
            }
            
            numeroAnterior = numero;
        }
        
        System.out.println("Número de introducciones: " + (contador - 1)); // Restamos 1 porque no queremos contar el 0.
        System.out.println("La mayor secuencia de números consecutivos iguales fue: " + maxRepeticiones);
        System.out.println("El número que se repitió fue: " + numeroMaxRepeticiones);
        System.out.println( 
    }
}
}
