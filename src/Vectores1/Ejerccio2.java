package Vectores1;
/*Realice un programa que solicite al usuario llenar un vector de 5 posiciones (mostrar
los subindices), luego lo invierta y lo guarde en otro vector. Imprimir en pantalla los
vectores junto con los subindices. (Optimícelo realizando sumas, resta y multiplicación de los
dos vectores y los guarde en un tercer vector, luego lo muestre en pantalla.)
 */

import java.util.Scanner;

public class Ejerccio2 {
    public static void main(String[] args) {

        //instanciando las clase scanner
        Scanner sc = new Scanner(System.in);

        int[] vect = new int[5];
        int[] vect2 = new int[5];
        int[] vect3 = new int[5];

        //guardando todos los elementos del vector
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite un numero: ");
            vect[i] = sc.nextInt();
        }

        //mostrar los elementos con sus indices asociados//
        for (int i = 0; i < vect.length; i++) {
            System.out.print(" Posicion[" + i + "]:" + vect[i]);

        }
        System.out.println("\nNumero Inverso");
        //numero inverso
        for (int i = 4; i >= 0; i--) {
            vect2[i] = vect[i];
            System.out.print(" " + vect2[i]);
        }

        System.out.println("\n Suma de vectores");
        // suma de vectores
        for (int k = 0; k < vect.length; k++) {
            vect[k] = vect[k] + vect2[k];
            vect3[k] = vect[k];
            System.out.print(" " + vect3[k]);

        }

        System.out.println("\n Resta de vectores");
        // suma de vectores
        for (int k = 0; k < vect.length; k++) {
            vect[k] = vect[k] - vect2[k];
            vect3[k] = vect[k];
            System.out.print(" " + vect3[k]);

        }

        System.out.println("\n Multiplicacion de vectores");
        // suma de vectores
        for (int k = 0; k < vect.length; k++) {
            vect[k] = vect[k] * vect2[k];
            vect3[k] = vect[k];
            System.out.print(" " + vect3[k]);

        }


    }
}

