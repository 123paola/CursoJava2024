/*Convertir una temperatura dada en grados Celsius a grados Fahrenheit*/

package taller1;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la temperatura en grados celcius: ");
        double celcius = sc.nextDouble();

        double fahrenheit = (1.8 * celcius) + 32;

        System.out.println("La temperatura en grados celcius convertida a Farenheit es: " + fahrenheit);

    }
}
