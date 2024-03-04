package Ejercicio02.Arrays;

public class ejercicio01 {
    public static void main(String[] args) {
    
        int[] num = new int[12];
        
        num[0] = 31;
        num[1] = -2;
        num[4] = 0;
        num[6] = 20;
        num[8] = 5;
        num[9] = 128;
              
        for (int i = 0; i < 12; i++) {
          System.out.printf("num[%2d]: %d\n", i, num[i]);
        }
        
    // Se puede observar que los valores del array se inicializan automáticamente a 0.
    }
  }

