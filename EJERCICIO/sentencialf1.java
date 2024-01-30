import java.util.Scanner;

public class sentencialf1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero ");
        Scanner s = new Scanner(System. in);
        int numero = s .nextInt();

        if (numero > 0) {
            System.out.println("El numero"+numero+"es positivo");
        }else{
            System.out.println("El numero"+numero+"es negativo");
            
        }
    }
}
