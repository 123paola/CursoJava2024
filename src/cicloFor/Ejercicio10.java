package cicloFor;

/*Realice un programa que solicite un número al usuario y calcule todos los números pares,
impares, primos y perfectos menores a dicho número (iniciando desde 1) y diga cuantos hay de
cada uno.*/

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor ingrese un numero");
        int numero = sc.nextInt();
        int aux = 0;
        int aux1 = 0;
        int aux2=0;


        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println("pares: " + i);
                aux++;
            }

        }
        System.out.println("Cantidad de numeros pares:" + aux);
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 1) {
                System.out.println("impares: " + i);
                aux1++;
            }
        }
        System.out.println("Cantidad de numeros impares:" + aux1);
        for (int i = 2; i <= numero; i++) {
            if (i / 1 == 1 || i / i == 1) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                    System.out.println("Es primo");
                    aux2++;
                }
            }
        }System.out.println("Cantidad de numeros primos:" + aux2);
    }
}


