package Matrices;
/*Realizar un algoritmo donde me cuente cuantos numeros pares e impares hay*/
import java.util.Scanner;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {

        //instanciando las clase scanner
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int sum = 0;
        int aux2 = 0;
        int aux3 = 0;

        System.out.print("Ingrese el tamaño de las filas: ");
        int tamFilas = sc.nextInt();

        System.out.print("Ingrese el tamaño de las columnas: ");
        int tamColumnas = sc.nextInt();

        //declarando la matriz bidimensional//
        int[][] matrix = new int[tamFilas][tamColumnas];


        for (int filas = 0; filas < tamFilas; filas++) {
            for (int colum = 0; colum < tamColumnas; colum++) {
                matrix[filas][colum] = 1 + rand.nextInt(10);

                sum += matrix[filas][colum];

                if (matrix[filas][colum] % 2 == 0) {
                    aux2++;
                } else {
                    aux3++;
                }
            }
        }

        for (int filas = 0; filas < tamFilas; filas++) {
            for (int colum = 0; colum < tamColumnas; colum++) {
                System.out.print("[" + matrix[filas][colum] + "] ");
            }
            System.out.println();
        }
        System.out.println("Hay "+aux2+" numeros pares y "+aux3+" Impares");

    }
}
