package EJERCICIO03;

import java.util.Scanner;

public class ejercicio08 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en megabytes (MB): ");
        double megabytes = scanner.nextDouble();

        double kilobytes = megabytes * 1024; // 1 MB = 1024 KB

        System.out.println(megabytes + " MB equivalen a " + kilobytes + " KB.");

        scanner.close();
    }
}
