package Ejercicio02;

public class segundoejercicioarray {
    public static void main(String[] args) {
  
        int[] n = new int[20];
        int i;
        int j;
        int k;
        int aux;
        
        // Rellena el array con números aleatorios entre 0 y 100
        System.out.println("Array original");
        for (i = 0; i < 20; i++) {
          n[i] = (int)(Math.random() * 101);
          System.out.print(n[i] + " ");
        }
        
        // En cada iteración del for se coloca un número par en su posición correcta
        for (i = 0; i < 20; i++) {
          
          // Busca el siguiente par a partir de la posición actual
          j = i;
          while ((n[j++] % 2 != 0) && (j < 20));
          
          // Desplaza el número par a su posición correcta (si quedan pares)
          if (j < 20) {
            for (k = j - 1; k > i; k--) {
              aux = n[k];
              n[k] = n[k - 1];
              n[k - 1] = aux;
            }
          }
        }
    
        // Muestra el resultado.
        System.out.println("\nArray con los pares al principio:");
        for (i = 0; i < 20; i++) {
          System.out.print(n[i] + " ");
        }
      }
    } 

    
