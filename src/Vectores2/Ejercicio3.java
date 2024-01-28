package Vectores2;

/*Ahora, realice un programa que solicite al usuario el tamaño de un vector (creas el vector) . Luego el usuario debe llenar el vector con números enteros (cualquier número), imprimes el vector y luego devuelves otro vector con los mismos números pero deberán estar desordenados aleatoriamente (en posiciones distintas).
Ejemplo:
Digite el tamaño del vector: 8 Digite el 1° número: 99
Digite el 2° número: 66
        ... Digite el 8° número: 110
Vector C: 99 66 50 11 33 77 88 110
Vector C_Aleatorio: 33 110 99 88 11 66 11 50*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Digite el tamaño del vector:");
        int tam = sc.nextInt();

        int[] vect = new int[tam];




        // se llama a la funcion
        llenarVector(vect);
        mostrarVector(vect);
        descordenarVector(vect);


    }

    public static void llenarVector(int vect[]) {
        //Inicializo el scaner
        Scanner sc = new Scanner(System.in);
        //for para llenar el vector automatico//
        for (int j = 0; j < vect.length; j++) {

            System.out.print("Digite el " + (j + 1) + " numero:");
            vect[j] = sc.nextInt();


        }
    }

    public static void mostrarVector(int vect[]) {

        System.out.print("Vector c: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(" " + vect[i]);


        }
    }


    public static void descordenarVector(int vect[]) {
        Random random = new Random();
       for (int i = 0; i < vect.length - 1; i--) {
            int numAzar=random.nextInt(10);

           if (numAzar != vect[i])
           {
               vect[numAzar] = vect[i];
               vect[i] = vect[numAzar];
               vect[numAzar] = vect[i];

           }
           System.out.print(" " + vect[numAzar]);

       }
    }



    }


















