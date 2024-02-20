package EJERCICIO03.Expo1FranklinAyalaTapia;

import java.util.Scanner;

public class problema02 {
    public class SecuenciasIguales {
        public static void main(String[] args) {
            // Creamos un objeto Scanner para obtener valores desde la entrada estándar
            Scanner sc = new Scanner(System.in);
    
            // Variables necesarias para llevar estadísticas
            int numeroActual,          // Número actual ingresado
                contadorSecuenciaMaxima = 1, // Contador de la secuencia actual de números iguales
                numRepetido = -1,             // Último número repetido
                maximoContadorSecuencia = 1;  // Máximo contador de secuencia obtenida
    
            // Solicitamos al usuario que empiece a escribir números
            System.out.println("Introduce números enteros (-1 para terminar):");
    
            // Iteramos mientras el número sea distinto de 0 ó -1
            while ((numeroActual = sc.nextInt()) != 0 && numeroActual != -1) {
                // Verificamos si el número coincide con el último número repetido
                if (numeroActual == numRepetido) {
                    // Sumamos +1 al contador de la secuencia actual
                    ++contadorSecuenciaMaxima;
                } else {
                    // Caso contrario, verificamos si la secuencia actual ha sido más larga que la previa
                    if (maximoContadorSecuencia < contadorSecuenciaMaxima) {
                        // Asignamos el nuevo récord
                        maximoContadorSecuencia = contadorSecuenciaMaxima;
                        numRepetido = numeroActual; // Y también recordamos el número repetido
                    }
                    // Reseteamos el contador de secuencia ya que cambia el número
                    contadorSecuenciaMaxima = 1;
                }
            }
    
            // Imprimimos resultados
            System.out.printf("\nNúmero de introducciones efectuadas: %d\n", (sc.hasNext() ? Integer.parseInt(sc.nextLine().trim()) : 0));
            System.out.printf("Máxima secuencia de números consecutivos iguales (%s), ocurrió %d vez%s.\n", numRepetido, maximoContadorSecuencia, maximoContadorSecuencia > 1 ? "es" : "");
        }
    }
}
