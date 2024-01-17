package Funciones;
/*Realice un programa que solicite al usuario una temperatura en grados Celsius (°C)
y muestre un menú para convertirlos a grados Fahrenheit (°F) o Kelvin (°K). Hacer una (1)
función para la conversión.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese temperatura en grados Celsius (°C) ");
        double grado = sc.nextDouble();

        System.out.println("Menu de opciones");
        System.out.println("1.grados Fahrenheit (°F) ");
        System.out.println("2.grados Kelvin (°K) ");
        System.out.println("Seleccione una opcion");
        double opcion = sc.nextDouble();

        switch ((int) opcion) {
            case 1:
                double resul = F(grado);
                System.out.println("Grados Farenheit:" + resul);
                break;
            case 2:
                double resul2 = K(grado);
                System.out.println("Grados Kelvin:" + resul2);
                break;
            default:
                System.out.println("");
        }
    }
    public static double F(double grado) {
        double conversion = (1.8 * grado) + 32;
        return conversion;

    }

    public static double K(double grado) {
        double conversion = grado + 273.15;
        ;
        return conversion;
    }

}







