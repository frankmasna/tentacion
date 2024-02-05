package Ejercicio02;

import java.util.Scanner;

public class ejercicio01 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7: ");
        int numero = scanner.nextInt();
        String nombreDelDia;
        switch (numero) {
            case 1:
                nombreDelDia = "Lunes";
                break;
            case 2:
                nombreDelDia = "Martes";
                break;
            case 3:
                nombreDelDia = "Miércoles";
                break;
            case 4:
                nombreDelDia = "Jueves";
                break;
            case 5:
                nombreDelDia = "Viernes";
                break;
            case 6:
                nombreDelDia = "Sábado";
                break;
            case 7:
                nombreDelDia = "Domingo";
                break;
            default:
                nombreDelDia = "Número no válido, por favor ingresa un número del 1 al 7.";
                break;
        }
        System.out.println("El día correspondiente es: " + nombreDelDia);
        scanner.close();
    }
    
}
