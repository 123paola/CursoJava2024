package Funciones;

/*Realice un programa que sume, reste, multiplique y divida dos números dados por el usuario y muestre sus respuestas. Las operaciones deben realizarse mediante el uso de funciones.*/

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese primer numero:");
        double numero1=sc.nextDouble();

        System.out.println("Ingrese segundo numero: ");
        double numero2=sc.nextDouble();

        double suma=suma(numero1,numero2);
        System.out.println("La suma de " + numero1+ "+"+numero2+" es: "+suma);

        double resta=resta(numero1,numero2);
        System.out.println("La resta de " + numero1+ "-"+numero2+" es: "+resta);

        double multiplicacion=multiplicacion(numero1,numero2);
        System.out.println("La multiplicacion de " + numero1+ "*"+numero2+" es: "+multiplicacion);

        double division=division(numero1,numero2);
        System.out.println("La division de " + numero1+ "/"+numero2+" es: "+division);
    }

    public static double suma(double a, double b){
        return a+b;
    }
    public static double resta(double a, double b){
        return a-b;
    }
    public static double multiplicacion(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        return a/b;
    }
}
