package cicloFor;

/*De dos números dados por el usuario, realice un programa que muestre todos los números
        pares e impares (separados) que se encuentran dentro de dicho intervalo, además debe aparecer
        la suma de los pares, suma de los impares, suma total y cuantos pares e impares hay.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor ingrese el rango mayor");
        int mayor = sc.nextInt();

        System.out.println("Por favor ingrese el rango menor");
        int menor = sc.nextInt();
        int aux = 0;
        double sum2 = 0;
        double sum3 = 0;

        for (int i = menor; i <= mayor; i++) {

            if (i % 2 == 0) {
                System.out.println("Numero par:" + i);
                aux++;
                sum2 = sum2 + i;
            }
        }
        System.out.println("Cantidad de numeros pares:" + aux);
        System.out.println("La suma es de los numeros pares es:: " + sum2);

        for (int i = menor; i <= mayor; i++) {

            if (i % 2 == 1) {
                System.out.println("Numero Impar:" + i);
                aux++;
                sum3+= i;
            }


        }
        System.out.println("Cantidad de numeros impares:" + aux);
        System.out.println("La suma es de los numeros impares es:: " + sum3);
        double total= sum2+sum3;
        System.out.println("La suma total es :" + total);
    }

}


