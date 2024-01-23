package Vectores1;

//crear un vector de tipo string y guardar nombres e imprimirlo,usar funciones para imprimir y para llenar//

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        //instancia de la clase scaner
        Scanner sc = new Scanner(System.in);


        //tamaño del vector
        System.out.print("Ingrese el tamaño del vector: ");
        int tam = sc.nextInt();

        // Crear el vector de tipo String
        String[] vector = new String[tam];

        // se llama a la funcion
        llenarVectorNombre(vector);
        imprimirVectorNombre(vector);

        // Imprime el vector

        System.out.println("Los nombres son: ");
        imprimirVectorNombre(vector);

    }

    // Función para llenar el vector con los nombres
    public static void llenarVectorNombre(String[] vector) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese nombre en la posicion " + i);
            vector[i] = sc.nextLine();
        }
    }

    // para imprimir el vector
    public static void imprimirVectorNombre(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
    }
}