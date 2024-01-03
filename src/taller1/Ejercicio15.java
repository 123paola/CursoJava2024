/*Realice un programa que halle la ecuacion cuadratica*/

package taller1;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ejercicio15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor de a ");
        double a = sc.nextDouble();
        System.out.println("Por favor ingrese el valor de b ");
        double b = sc.nextDouble();
        System.out.println("Por favor ingrese el valor de c ");
        double c = sc.nextDouble();
        double determinante = pow(b, 2) - (4 * a * c);
        System.out.println("El valor del determinante es " + determinante);

        if (determinante > 0) {

            double x1 = (-b + sqrt(determinante)) / (2 * a);
            double x2 = (-b - sqrt(determinante)) / (2 * a);

            System.out.println("El valor de x1 es :  " + x1);
            System.out.println("El valor de x2 es :  " + x2);

        } else if (determinante == 0) {
            double x = -b / (2 * a);
            System.out.println("las soluciones son iguales y es:  " + x);
        } else {
            System.out.println("La ecuacion cuadratica no tiene solucion en los reales ");
        }
    }
}
