package EJERCICIO03;

import java.util.Scanner;

public class ejercicio02 {
       public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros a convertir a soles: ");
        
        double cantidadEuros = scanner.nextDouble();
        double tipoCambio = 4.5; // 1 euro = 4.5 soles aproximadamente

       
        double cantidadSoles = cantidadEuros * tipoCambio;

       
        System.out.println(cantidadEuros + " euros son aproximadamente " + cantidadSoles + " soles.");

        // Cerrar el Scanner
        scanner.close();
    }
}
