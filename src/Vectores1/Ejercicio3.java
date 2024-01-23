package Vectores1;

/*Realice un programa que solicite al usuario 3 notas del 15% (Q.T.T.E), las guarde en un vector
y luego muestre su promedio o media, la nota más alta y su posición (subindice) en el vector,
la nota más baja y su posición (subindice) en el vector y su ponderado o nota final.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        //instanciando las clase scanner
        Scanner sc = new Scanner(System.in);
        int[] vect = new int[3];
        int sum = 0;



        //guardando todos los elementos del vector
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite nota " + (i + 1) + ":");
            vect[i] = sc.nextInt();
            sum += vect[i];


        }

        int promedio = sum / vect.length;
        System.out.println("El promedio de los elementos del vector es:" + promedio);

        int notaAlta=vect[0];
        int notaBaja=vect[0];


            for (int i = 0; i < vect.length; i++) {
                if (vect[i] > notaAlta) {
                    notaAlta = vect[i];
                } else if (vect[i] < notaBaja) {
                    notaBaja = vect[i];
                }
            }
        System.out.println("Nota Alta: " + notaAlta);
        System.out.println("Nota baja: " + notaBaja);
    }
    }









