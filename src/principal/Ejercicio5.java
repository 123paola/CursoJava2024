/*Realice un programa que permita calcular el promedio de notas de un estudiante el cual
tiene 5 notas (la calificación va desde 0.0 - 5.0). El resultado deberá ser mostrado con 2
decimales.*/

package principal;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese nota 1:");
        double nota1 = sc.nextDouble();

        System.out.println("Ingrese nota 2:");
        double nota2 = sc.nextDouble();

        System.out.println("Ingrese nota 3");
        double nota3 = sc.nextDouble();

        System.out.println("Ingrese nota 4");
        double nota4 = sc.nextDouble();

        System.out.println("Ingrese nota5:");
        double nota5 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        System.out.println("Hola " + nombre + " El promedio de tus notas es: " + promedio);
    }
}
