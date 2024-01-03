/*realice el programa para que el usuario pueda ingresar números con decimales, la
respuesta debe ser mostrada con 3 decimales.*/

package taller1;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese su base: ");
        double base = sc.nextDouble();

        System.out.println("Por favor ingrese su altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El area de un triangulo es: " + area);


    }
}
