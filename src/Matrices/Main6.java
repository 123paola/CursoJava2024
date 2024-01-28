package Matrices;

import java.util.Random;
import java.util.Scanner;

//sumar los elementos de la primera fila
public class Main6 {
    public static void main(String[] args) {

        //instanciando las clase scanner
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int sum = 0;


        System.out.print("Ingrese el tamaño de las filas: ");
        int tamFilas = sc.nextInt();

        System.out.print("Ingrese el tamaño de las columnas: ");
        int tamColumnas = sc.nextInt();

        //declarando la matriz bidimensional//
        int[][] matrix = new int[tamFilas][tamColumnas];


        for (int filas = 0; filas < tamFilas; filas++) {

            for (int colum = 0; colum < tamColumnas; colum++) {
                matrix[filas][colum] = 1 + rand.nextInt(10);
                if (filas == 0) {
                    sum += matrix[filas][colum];

                }

            }
        }


        for (int filas = 0; filas < tamFilas; filas++) {
            for (int colum = 0; colum < tamColumnas; colum++) {
                System.out.print("[" + matrix[filas][colum] + "] ");
            }
            System.out.println();
        }


        System.out.println("Suma:"+sum);
    }
}


