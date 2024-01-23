package Vectores1;

/*Realice un programa que genere 10 números aleatorios y los guarde en un vector en orden
ascendente (del menor al mayor) y luego los muestre en pantalla. (hacer lo mismo, pero ahora
en orden descendente).
 */

import java.util.Random;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {

        //instanciando las clase random y scanner
        Scanner sc=new Scanner(System.in);
        Random random = new Random();

               int[] vect=new int[10];



            //for para llenar el vector automatico//
            for(int i=0; i<vect.length;i++){
                vect[i]= 1 + random.nextInt(10);

            }
            //for para imprimir los elementos sin ordenarlos//
            for(int i=0; i<vect.length;i++){
                System.out.print("["+vect[i]+"]");
            }

        System.out.println("\nMetodo burbuja");
        for (int i = 0; i < (vect.length - 1); i++) {
            for (int j = 0; (j < vect.length - 1); j++) {
                if (vect[j] > vect[j + 1]) {
                    int aux = vect[j];
                    vect[j] = vect[j + 1];
                    vect[j + 1] = aux;
                }

            }
        }
        //for para imprimir los elementos de menor a mayor//
        for (int i = 0; i < vect.length; i++) {
            System.out.print("[" + vect[i] + "] ");
        }
        }
    }



