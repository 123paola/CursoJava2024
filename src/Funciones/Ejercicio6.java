package Funciones;

/*Realice una función que calcule el área y el perímetro de un rectángulo, dada su BASE y ALTURA.*/

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su base ");
        int base = sc.nextInt();

        System.out.println("Por favor ingrese su altura ");
        int altura = sc.nextInt();

        double area=area(base,altura);
        System.out.println("El area de un rectangulo es: "+area);

        double perimetro=perimetro(base,altura);
        System.out.println("El perimetro de un rectangulo es: "+perimetro);
    }

    public static double area(double a, double b){
        return a*b;
    }
    public static double perimetro(double a, double b){
        return 2*(a*b);
    }
}
