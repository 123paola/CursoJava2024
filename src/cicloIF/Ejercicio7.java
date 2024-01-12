package cicloIF;
/*En un cajero automático se necesita determinar el menor número mínimo de billetes de
10.000, 5.000, 2.000, 1.000, y mínimo de monedas de 500, 200 y 100 necesarios para pagar
una cantidad X dada por teclado. (pista: Recuerden el ejercicio de invertir un numero de 3
cifras)*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Por favor ingrese el valor a retirar");
        int vr = sc.nextInt();

        int v1 = vr / 10000;
        int temp = vr % 10000;
        System.out.println("Cantidad de billetes de 10000: " + v1);
        int v2= temp/5000 ;
        temp=temp % 5000;
        System.out.println("Cantidad de billetes de 5000: " + v2);
        int v3 = temp / 2000;
        temp=temp%2000;
        System.out.println("Cantidad de billetes de 2000: " + v3);
        int v4 = temp / 1000;
        temp=temp%1000;
        System.out.println("Cantidad de billetes de 1000: " + v4);
        int v5 = temp / 500;
        temp=temp%500;
        System.out.println("Cantidad de billetes de 500: " + v5);
        int v6 = temp / 200;
        temp=temp%200;
        System.out.println("Cantidad de billetes de 200: " + v6);
        int v7 = temp / 100;
        temp=temp%100;
        System.out.println("Cantidad de billetes de 100: " + v7);
        System.out.println("El sobrante es de : " + temp);

    }
}
