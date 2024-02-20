package EJERCICIO03.Expo1FranklinAyalaTapia;
// directivas permiten simplificar el código evitando repetir largos prefijos de nombre completo de las clases que queremos emplear
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class problema01 {
     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Solicitar el  rango inicial y final
        System.out.println("Ingrese el número inicial:");
        int minimo = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese el número final:");
        int maximo = Integer.parseInt(sc.nextLine());
        
        if (minimo > maximo || minimo < 1 || maximo > 1000) {
            throw new IllegalArgumentException("El rango ingresado es inválido.");
        }
        
        // Solicitamos la  cantidad de elementos por grupo
        System.out.println("Ingrese la cantidad de elementos por grupo:");
        int numPorGrupo = Integer.parseInt(reader.readLine());
        
        for (int i = minimo; i <= maximo; ) {
            
            // Imprimir el  primer conjunto de los  números
            for (int j = 0; j < Math.min(numPorGrupo, maximo - i + 1); ++j) {
                System.out.printf("%d ", i++);
            }
            
            // Preguntar si desea ver más números
            String respuesta = "";
            while (!"s".equalsIgnoreCase(respuesta)) {
                System.out.print("\n¿Desea mostrar otro grupo? (S/N): ");
                respuesta = reader.readLine();
                
                if ("n".equalsIgnoreCase(respuesta)) break;
            }
            
            // Si se ha llegado al máximo, salir del ciclo principal
            if (i >= maximo) break;
            
            // Salto de línea después de cada grupo
            System.out.println("");
        }
    }
}
       


