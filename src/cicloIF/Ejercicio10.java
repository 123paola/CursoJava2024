package cicloIF;

/*Desplegar un menú con las opciones que le permita calcular el área de: Cuadrado, Círculo,
Triángulo, Rectángulo. Para lograr lo anterior debe aplicar las fórmulas matemáticas
correspondientes para cada figura.*/

import java.util.Scanner;

import static java.lang.Math.pow;

public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*********Menu de opciones************");
        System.out.println("1. Area de un Cuadrado");
        System.out.println("2. Area de un Circulo");
        System.out.println("3. Area de un Triangulo");
        System.out.println("4. Area de un Rectangulo");
        System.out.println("Por favor escoja la opcion");
        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("Por favor ingrese primer lado");
            double lado1 = sc.nextInt();
            System.out.println("Por favor ingrese segundo lado");
            double  lado2 = sc.nextInt();
            double areaCuadrado = lado1 * lado2;
            System.out.println("El area de un cuadrado es: " + areaCuadrado);

        }
        if (menu == 2) {

            final double pi = 3.1416;

            System.out.println("Por favor ingrese el radio");
            double radio = sc.nextInt();
            double areaCirculo = pi * pow(radio, 2);
            System.out.println("El area de un circulo es: " + areaCirculo);

        }if (menu == 3) {

            System.out.println("Por favor ingrese la base");
            double base = sc.nextInt();
            System.out.println("Por favor ingrese la altura");
            double altura = sc.nextInt();
            double areaTriangulo = (base*altura)/2;
            System.out.println("El area de un triangulo es: " + areaTriangulo);

        }if (menu == 4) {

            System.out.println("Por favor ingrese la base");
            double base = sc.nextInt();
            System.out.println("Por favor ingrese la altura");
            double altura = sc.nextInt();
            double areaRectangulo= (base*altura);
            System.out.println("El area de un rectangulo es: " + areaRectangulo);

        }
    }
}

