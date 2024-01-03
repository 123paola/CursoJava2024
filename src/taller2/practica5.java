/*Realice un programa que dado dos numero verifique cual es el mayor y diga si es par o impar.*/
package taller2;

import java.util.Scanner;

public class practica5 {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un primer numero");
        int a = sc.nextInt();

        System.out.println("Por favor ingrese un segundo numero");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("El numero " + a + " Es mayor que " + b);
            if (a % 2 == 0) {

                System.out.println("Y tambien es par");
            } else {
                System.out.println("Y tambien es impar");
            }
        } else if (b > a) {
                System.out.println("El numero " + a + " Es menor que " + b);
                if (b % 2 == 0) {

                    System.out.println("Y tambien es par");
                } else {
                    System.out.println("Y tambien es impar");
                }

            }
        }
    }

