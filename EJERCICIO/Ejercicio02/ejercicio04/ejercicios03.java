package Ejercicio02.ejercicio04;

public class ejercicios03 {
    public static void main(String[] args) {
        int i = 0;
        
        System.out.println("Múltiplos de 5 de 0 a 100:");
        
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
