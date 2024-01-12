package cicloFor;

/*Escriba un programa que genere todas las potencias de un número dado por el usuario, desde la
0-ésima hasta la ingresada por el usuario. Ejemplo:
        - Número: 2
        - Potencia: 10
R/ 1 2 4 8 16 32 64 128 256 512 1024.*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la potencia");
        int potencia = sc.nextInt();

        System.out.println("Por favor ingrese la base");
        int base = sc.nextInt();

        for (int i = 0; i <= potencia; i++) {
             System.out.print(Math.pow(base, i)+"\n");
        }
    }
}

