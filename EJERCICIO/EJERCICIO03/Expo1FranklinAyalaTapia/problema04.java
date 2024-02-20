package EJERCICIO03.Expo1FranklinAyalaTapia;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problema04 {
public class MagicNumber {
    private static final int[] DAYS_PER_MONTH = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Número de días por mes (sin años bisiestos)
    
    public static void main(String[] args) {
          // Creamos un objeto Scanner para obtener valores desde la entrada estándar
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el año de nacimiento: ");
        int year = Integer.parseInt(scanner.nextLine());
        
        while (year <= 0) {
            System.err.println("El año no puede ser menor o igual a cero.");
            System.out.print("Por favor ingrese nuevamente el año de nacimiento: ");
            year = Integer.parseInt(scanner.nextLine());
        }
        
        System.out.print("Ingrese el mes de nacimiento (entre 1-12): ");
        int month = Integer.parseInt(scanner.nextLine()) - 1; // Restamos uno porque los índices comienzan desde 0
        
        while (!(month >= 0 && month < 12)) {
            System.err.println("El mes tiene que estar entre 1 y 12 inclusive.");
            System.out.print("Por favor ingrese nuevamente el mes de nacimiento: ");
            month = Integer.parseInt(scanner.nextLine()) - 1;
        }
        
        System.out.print("Ingrese el día de nacimiento (entre 1-" + DAYS_PER_MONTH[month] + "): ");
        int day = Integer.parseInt(scanner.nextLine());
        
        while (!(day >= 1 && day <= DAYS_PER_MONTH[month])) {
            System.err.println("La cantidad de días está fuera de rango para este mes (" + DAYS_PER_MONTH[month] + ").");
            System.out.print("Por favor ingrese nuevamente el día de nacimiento: ");
            day = Integer.parseInt(scanner.nextLine());
        }
        
        int magicNumber = calculateMagicNumber(year, month, day);
        String repeatedDigits = getRepeatedDigitsAndCounts(magicNumber);
        
        System.out.printf("Su número mágico es %d%n", magicNumber);
        if (!repeatedDigits.isEmpty()) {
            System.out.println("Número repetido: " + repeatedDigits);
        } else {
            System.out.println("No hay números repetidos.");
        }
    }
  
    /**
     * Calcula el número mágico basándose en la fecha de nacimiento.
     */
    private static int calculateMagicNumber(int year, int month, int day) {
        return ((year / 1000) + (year % 1000 / 100) + (year % 100 / 10) + (year % 10)) +
               (((month + 1) / 10) + ((month + 1) % 10)) +
               ((day / 10) + (day % 10));
    }
  
    /**
     * Obtiene los números repetidos junto con sus respectivas frecuencias dentro del número mágico.
     */
    private static String getRepeatedDigitsAndCounts(int number) {
        Map<Integer, Integer> digitFrequencyMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for (char ch : String.valueOf(number).toCharArray()) {
            int currentDigit = Character.getNumericValue(ch);
            
            if (currentDigit != 0 || !sb.toString().contains(",")) {
                int frequency = digitFrequencyMap.merge(currentDigit, 1, Integer::sum);
                
                if (frequency == 2) {
                    sb.append(currentDigit).append(",");
                } else if (frequency > 2) {
                    sb.setLength(0);
                    sb.append(currentDigit).append(",").append('x').append((frequency - 1)).append(",");
                }
            }
        }
        
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }
}
}
