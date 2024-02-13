package Ejercicio02.ejercicio04;

public class ejercicios01 {
    public static void main(String[] args) {
        // Utilizamos un bucle for para iterar desde 0 hasta 100
        for (int i = 0; i <= 100; i++) {
            // Verificamos si el número actual es múltiplo de 5 utilizando el operador de módulo (%)
            if (i % 5 == 0) {
                // Si es múltiplo de 5, lo imprimimos
                System.out.println(i);
            }
        }
    }
}

