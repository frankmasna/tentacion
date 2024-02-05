package Ejercicio02.ejercicio04;

import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = scanner.nextInt();
        int tarifaHoraOrdinaria = 12;
        int tarifaHoraExtra = 16;
        int horasOrdinarias = 40;
        int salario = calcularSalario(horasTrabajadas, horasOrdinarias, tarifaHoraOrdinaria, tarifaHoraExtra);

        System.out.println("El sueldo semanal que le corresponde es de " + salario + " soles");

        scanner.close();
    }

    public static int calcularSalario(int horasTrabajadas, int horasOrdinarias, int tarifaHoraOrdinaria, int tarifaHoraExtra) {
        int salario = 0;

        if (horasTrabajadas <= horasOrdinarias) {
            salario = horasTrabajadas * tarifaHoraOrdinaria;
        } else {
            salario = horasOrdinarias * tarifaHoraOrdinaria + (horasTrabajadas - horasOrdinarias) * tarifaHoraExtra;
        }

        return salario;
    }
    
}
