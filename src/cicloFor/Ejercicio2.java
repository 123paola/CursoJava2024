package cicloFor;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el rango mayor");
        int mayor = sc.nextInt();

        System.out.println("Por favor ingrese el rango menor");
        int menor = sc.nextInt();
        int aux = 0;


        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 1) {
                System.out.println("i:" + i);
                aux++;
            }
        }
        System.out.println("Cantidad de numeros impares:" + aux);
    }
}

