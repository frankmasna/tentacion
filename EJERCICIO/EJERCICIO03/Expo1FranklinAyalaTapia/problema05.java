package EJERCICIO03.Expo1FranklinAyalaTapia;

public class problema05 {
    /**
 * 
 * 13. Escribe un programa que lea una lista de diez números y determine
 *     cuántos son positivos, y cuántos son negativos.
 * 
 * @author Luis José Sánchez
 */
public class S05Ejercicio13 {
    // Método principal para iniciar la ejecución del programa
    public static void main(String[] args) {
      System.out.println("Por favor, introduzca 10 números enteros: ");
   
    // Inicializamos las variables contadoras con valor 0
      int negativos = 0;
      int positivos = 0;
       // Ciclo 'for' iterando desde 0 hasta menos de 10 veces
      for (int i = 0; i < 10; i++) {
        if (Integer.parseInt(System.console().readLine()) < 0) {
          negativos++; // ...incrementa el contador de números negativos
        } else { // De otro modo si no es negativo...
          positivos++;// incrementa el contador de números positivos
        }
      }
      
      System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos.");
    }
  }
}
