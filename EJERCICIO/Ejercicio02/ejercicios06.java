package Ejercicio02;

import java.util.Scanner;

public class ejercicios06 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        System.out.println("Bienvenido al minicuestionario. Responde las siguientes preguntas:");

        // Pregunta 1
        System.out.println("1. ¿Cuál es la capital de Francia?");
        System.out.print("a) Londres\nb) París\nc) Madrid\nd) Roma\nTu respuesta: ");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            puntos++;
        }

        // Pregunta 2
        System.out.println("2. ¿Cuál es el resultado de 5 + 7?");
        System.out.print("a) 10\nb) 12\nc) 14\nd) 16\nTu respuesta: ");
        if (scanner.nextLine().equalsIgnoreCase("c")) {
            puntos++;
        }
        System.out.println("\n¡Cuestionario completado! Tu calificación es: " + puntos + "/10");

        scanner.close();
    }
}
