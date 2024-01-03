/*Calcular el área de un triángulo*/

package taller1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ejercicio16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor de a ");
        double a = sc.nextDouble();
        System.out.println("Por favor ingrese el valor de b ");
        double b = sc.nextDouble();
        System.out.println("Por favor ingrese el valor de c ");
        double c = sc.nextDouble();
        double p = (a + b + c) / 2;

        if (p > 0) {
            double area = sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("El area de un triangulo es :  " + area);
        } else {
            System.out.println("El semiperimetro es negativo y no se puede realizar la operacion ");
        }
    }
}

