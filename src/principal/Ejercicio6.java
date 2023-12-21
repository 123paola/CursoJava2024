/*Realice un programa que convierta metros a cm, km, pies y pulgadas. (1 metro son 100 cm,
1000 metros son un kilómetro, 1 metro son 39.37 pulgadas y 1 pie son 12 pulgadas).
package principal;*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese los metros a convertir: ");
        double metros = sc.nextDouble();

        double centi = metros * 100;
        System.out.println("La medida en centimetros es: " + centi);
        double kilo = metros / 1000;
        System.out.println("La medida en kilometros es: " + kilo);
        double pulg = 39.37 * metros;
        System.out.println("La medida en pulgadas es: " + pulg);
        double pie = pulg / 12;
        System.out.println("La medida en pies es: " + pie);


    }
}
