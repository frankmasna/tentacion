package Ejercicios06;

import java.util.Random;

public class EJERCICIO01 {
    public static void main(String[] args) {
        // Array de palos y cartas
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    
        // Seleccionar un palo al azar
        int indicePalo = (int) (Math.random() * palos.length);
        String palo = palos[indicePalo];
    
        // Seleccionar una carta al azar
        int indiceCarta = (int) (Math.random() * cartas.length);
        String carta = cartas[indiceCarta];
    
        // Mostrar la carta seleccionada
        System.out.println("La carta seleccionada es: " + carta + " de " + palo);
    }
}

