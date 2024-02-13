package Ejercicio02.ejercicio04;

public class ejercicios02 {
    public static void main(String[] args) {
        int numero = 0;

        System.out.println("Los múltiplos de 5 de 0 a 100 son:");

        while (numero <= 100) {
            if (numero % 5 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}

