package Ejercicio02;

import java.util.Scanner;

public class ejercicios10 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto): ");
        int cargo = scanner.nextInt();

        System.out.println("Ingrese los días de viaje visitando clientes durante el mes: ");
        int diasViaje = scanner.nextInt();

        System.out.println("Ingrese el estado civil del empleado (1 - Soltero, 2 - Casado): ");
        int estadoCivil = scanner.nextInt();
        double sueldoBase = 0;
        switch (cargo) {
            case 1:
                sueldoBase = 950;
                break;
            case 2:
                sueldoBase = 1200;
                break;
            case 3:
                sueldoBase = 1600;
                break;
            default:
                System.out.println("Cargo no válido");
                System.exit(0);
        }

        double dietas = diasViaje * 30;

        double sueldoBruto = sueldoBase + dietas;

        double irpf = 0;
        if (estadoCivil == 1) { // Soltero
            irpf = sueldoBruto * 0.25;
        } else if (estadoCivil == 2) { // Casado
            irpf = sueldoBruto * 0.20;
        } else {
            System.out.println("Estado civil no válido");
            System.exit(0);
        }

        double sueldoNeto = sueldoBruto - irpf;

        System.out.println("Nómina desglosada:");
        System.out.println("Sueldo base: " + sueldoBase + " euros");
        System.out.println("Dietas: " + dietas + " euros");
        System.out.println("Sueldo bruto: " + sueldoBruto + " euros");
        System.out.println("IRPF: " + irpf + " euros");
        System.out.println("Sueldo neto: " + sueldoNeto + " euros");
        scanner.close();
    }
 
}
