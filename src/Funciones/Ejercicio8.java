package Funciones;

/*Realice una función que reciba una medida expresada en centímetros (cm) y devuelva la medida expresada en
pulgadas (in). 1in=2.54cm.*/

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese una medida en centimetros ");
        double centimetros = sc.nextDouble();
        double conversion=conversion(centimetros);

        System.out.println(+centimetros+" centimetros convertidos a pulgadas es: "+ conversion);
    }
    public static double conversion(double num){
        return num/2.54;
    }
}
