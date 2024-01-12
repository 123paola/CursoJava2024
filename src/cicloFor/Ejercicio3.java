package cicloFor;

/*Realice un programa que solicite al usuario 5 números (cada uno debe ser mayor al anterior),
sino, el programa debe finalizar. Ellos formarán 4 intervalos: [1-2], [2-3], [3-4] y [4-5]. Se debe
preguntar mediante un menú al usuario qué números (pares o impares) desea buscar en cada uno
de los intervalos e imprimirlos en pantalla de forma gradual, además mostrar cuantos números
hay.*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor ingrese el rango mayor");
        int mayor = sc.nextInt();

        System.out.println("Por favor ingrese el rango menor");
        int menor = sc.nextInt();
        int aux = 0;

        System.out.println("Menu de opciones");
        System.out.println("1. Numeros pares");
        System.out.println("2. Numeros impares");
        System.out.println("Seleccione la opcion");
        int opcion = sc.nextInt();


        switch (opcion) {


            case 1:

                for (int i = menor; i <= mayor; i++) {
                    if (mayor > menor) {
                        if (i % 2 == 0) {
                            System.out.println("Numero par:" + i);
                            aux++;
                        }
                    }

                }
                System.out.println("Cantidad de numeros pares:" + aux);
                break;
            case 2:
                for (int i = menor; i <= mayor; i++) {
                    if (mayor > menor) {
                        if (i % 2 == 1) {
                            System.out.println("Numero Impar:" + i);
                            aux++;
                        }
                    }

                }
                System.out.println("Cantidad de numeros impares:" + aux);
                break;
        }
    }
}
