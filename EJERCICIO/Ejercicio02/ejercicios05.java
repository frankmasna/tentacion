package Ejercicio02;

import java.util.Scanner;

public class ejercicios05 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        String horoscopo = obtenerHoroscopo(dia, mes);

        System.out.println("Tu horóscopo es: " + horoscopo);

        scanner.close();
    }

    public static String obtenerHoroscopo(int dia, int mes) {
        String signo = "";

        switch (mes) {
            case 1: // Enero
                signo = (dia <= 20) ? "Capricornio" : "Acuario";
                break;
            case 2: // Febrero
                signo = (dia <= 19) ? "Acuario" : "Piscis";
                break;
            case 3: // Marzo
                signo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4: // Abril
                signo = (dia <= 20) ? "Aries" : "Tauro";
                break;
            case 5: // Mayo
                signo = (dia <= 21) ? "Tauro" : "Géminis";
                break;
            case 6: // Junio
                signo = (dia <= 21) ? "Géminis" : "Cáncer";
                break;
            case 7: // Julio
                signo = (dia <= 22) ? "Cáncer" : "Leo";
                break;
            case 8: // Agosto
                signo = (dia <= 23) ? "Leo" : "Virgo";
                break;
            case 9: // Septiembre
                signo = (dia <= 23) ? "Virgo" : "Libra";
                break;
            case 10: // Octubre
                signo = (dia <= 23) ? "Libra" : "Escorpio";
                break;
            case 11: // Noviembre
                signo = (dia <= 22) ? "Escorpio" : "Sagitario";
                break;
            case 12: // Diciembre
                signo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                signo = "Mes inválido";
        }

        return signo;
    }
}
