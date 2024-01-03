/*Realice un programa que, dada la edad de tres personas, calcule el promedio de edades.*/

package taller1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la edad uno");
        int edad1 = sc.nextInt();

        System.out.println("Por favor ingrese edad dos");
        int edad2 = sc.nextInt();

        System.out.println("Por favor ingrese edad tres");
        int edad3 = sc.nextInt();

        float promedio = (edad1 + edad2 + edad3) / 3;

        System.out.println("El promedio de las edades es: " + promedio);


    }
}
