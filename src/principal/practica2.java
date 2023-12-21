package principal;

import java.util.Scanner;

public class practica2 {
    public static void main(String args[]) {

        int resultado;
        String linea;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero de tres cifras");
        int num = sc.nextInt();

        int a = num / 1000;
        num = num % 1000;

        int b = num / 100;
        num = num % 100;

        int c = num / 10;
        num = num % 10;

        System.out.println("El nuevo numero es: " + num + c + b + a);


    }
}



