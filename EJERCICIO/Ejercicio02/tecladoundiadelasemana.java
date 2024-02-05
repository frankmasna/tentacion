package Ejercicio02;

import java.util.Scanner;

public class tecladoundiadelasemana {
    public static void main(String[] args) {
        int dia;
        String nombreDia;
        System.out.println("por favor, introduzca un numero de día entre 1 al 7: ");
        dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1:
                nombreDia = "DOMINGO no tengo clase trabajo en el tinder " ;

                break;
            case 2:
                nombreDia = "LUNES clases de programacion ";
                break;
            case 3:
                nombreDia = "MARTES clases de sistemas ";
                break;
            case 4:
                nombreDia = "MIÉRCOLES clases de IO";
                break;
            case 5:
                nombreDia = "JUEVES clases de sistemas ";
                break;
            case 6:
                nombreDia = "VIERNES clases de estadistica";
                break;
            case 7:
                nombreDia = "SÁBADO descanso 3";
                break;
            default:
                nombreDia = "NO EXISTE ESE DÍA ese dia no hago nada ";
                break;
        }
        System.out.println("Día "+nombreDia);


    }
    }

