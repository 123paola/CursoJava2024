package cicloFor;

/*Escriba un programa que pida un número entero mayor que 1 y que imprima si el número es un
número primo o no. Ejemplo:
        - Ingrese un número entero mayor a uno: 13
R/ El número ingresado es/no es un número PRIMO.*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]) {
        int N, i, j;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce un numero > 0: ");
            N = sc.nextInt();
        } while (N <= 0);
        System.out.println("Números primos desde 1 hasta " + N);

        for (j = 2; j <= N; j++) {    // j es el número que se comprueba si es primo
            i = 2;                // i son los divisores
            while (j % i != 0) {
                i++;
            }
            if (i == j) { // si se ha dividido por el propio número entonces es primo
                System.out.print("Primo: ");
                System.out.println(j);
            }
        }
    }
}
