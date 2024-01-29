package EJERCICIO03;

import java.util.Scanner;

public class ejercicio05 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingresa la anchura del rectángulo: ");
        double anchura = scanner.nextDouble();
        double area = calcularAreaRectangulo(longitud, anchura);

        System.out.println("El área del rectángulo es: " + area);

        scanner.close();
    }
    public static double calcularAreaRectangulo(double longitud, double anchura) {
        return longitud * anchura;
    }
}
