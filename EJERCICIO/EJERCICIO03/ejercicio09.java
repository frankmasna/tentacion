package EJERCICIO03;

import java.util.Scanner;

public class ejercicio09 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota obtenida en el primer examen (40%): ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.println("Introduce la media deseada al final del curso: ");
        double mediaDeseada = scanner.nextDouble();

        // La fórmula para calcular la nota necesaria en el segundo examen es:
        // (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6
        double notaSegundoExamen = (mediaDeseada - (notaPrimerExamen * 0.4)) / 0.6;

        // Aseguramos que la nota necesaria esté en el rango de 0 a 10
        notaSegundoExamen = Math.max(0, Math.min(10, notaSegundoExamen));

        System.out.println("Para obtener una media de " + mediaDeseada +
                " necesitas sacar al menos " + notaSegundoExamen + " en el segundo examen.");
    }
}
