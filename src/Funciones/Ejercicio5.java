package Funciones;

/*Realice un programa que solicite un número entero al usuario. Luego determine si el número es
PRIMO o NO. Debe devolver mediante una función “P” si es primo o “NP” si no es primo.*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero ");
        int numero = sc.nextInt();
        String primo = String.valueOf(esPrimo(numero));
        System.out.println("el numero " + numero + "es: "+ primo);


    }

    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        int contador = 0;

        //bucle que cuenta los numeros divisibles
        for (int i = (int) Math.sqrt(numero); i > 1; i--) {
            if (numero % i == 0) {
                contador++;

            }
        }
        return contador < 1;
    }
}













