/*Realice un programa que dado un número de 3 cifras se invierta el número y se imprima en
 pantalla el resultado.*/
package taller1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero de tres cifras");
        int num = sc.nextInt();

        int centenas = num / 100;
        System.out.println("El numero en la posicion de centenas es: " + centenas);
        num = num % 100;
        System.out.println("El residuo en la posicion de centenas es " + num);
        int decenas = num / 10;
        System.out.println("El numero en la posicion de decenas es: " + decenas);
        int unidades = num % 10;
        System.out.println("El residuo en la posicion de unidades es: " + unidades);
        int resultado = (unidades * 100) + (decenas * 10) + centenas;
        System.out.println("El nuevo numero es: " + resultado);


    }
}

