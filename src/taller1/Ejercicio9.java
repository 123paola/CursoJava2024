/*Tres personas deciden invertir su dinero para crear una empresa. Cada una de ellas invierte
 una cantidad distinta ($100.000 - $1’000.000). Realice un programa que permita obtener el
porcentaje que cada quien invierte con respecto a la cantidad invertida. (Pista: Regla de 3).*/
package taller1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad de la primera persona: ");
        double cantidad1 = sc.nextDouble();

        System.out.println("Por favor ingrese la cantidad de la segunda persona: ");
        double cantidad2 = sc.nextDouble();

        System.out.println("Por favor ingrese la cantidad de la tercera persona: ");
        double cantidad3 = sc.nextDouble();

        double total = cantidad1 + cantidad2 + cantidad3;

        double porcentaje1 = (cantidad1 * 100) / total;
        double porcentaje2 = (cantidad2 * 100) / total;
        double porcentaje3 = (cantidad3 * 100) / total;

        System.out.println("La primera persona invirte: " + porcentaje1 + "%");
        System.out.println("La segunda persona invirte: " + porcentaje2 + "%");
        System.out.println("La tercera persona invirte: " + porcentaje3 + "%");
    }
}
