package EJERCICIO03;

import java.util.Scanner;

public class ejercicio07 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas a la semana: ");
        
        double horasTrabajadas = scanner.nextDouble();
        scanner.close();

        double tarifaPorHora = 12.0;
        double salarioSemanal = horasTrabajadas * tarifaPorHora;
        System.out.println("El salario semanal es: " + salarioSemanal + " soles");
    }
}
