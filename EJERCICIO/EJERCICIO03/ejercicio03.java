package EJERCICIO03;

import java.util.Scanner;

public class ejercicio03 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de pesetas: ");
        
        double pesetas = scanner.nextDouble();
        scanner.close();

        double tasaCambio = 0.006;
        double euros = pesetas * tasaCambio;

        System.out.println(pesetas + " pesetas son aproximadamente " + euros + " euros.");
    }
}
