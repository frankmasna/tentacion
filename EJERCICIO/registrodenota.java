import java.util.Scanner;

public class registrodenota {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        double nota = scanner.nextDouble();
        
        if ((nota > 10.5) && (nota < 21)){
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }
        scanner.close();
    }
}

