package EJERCICIO03;

import java.util.Scanner;

public class peruCapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Quieres saber cuál es la capital de Perú? (Sí/No): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("Sí")) {

            System.out.println("La capital de Perú es Lima.");
        } else {
            System.out.println("¡Gracias! Hasta luego.");
        }

        scanner.close();
    }
}
