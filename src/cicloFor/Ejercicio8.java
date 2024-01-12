package cicloFor;

/*Escriba un programa que entregue todos los divisores de un número entero ingresado, cuantos
        divisores son, calcule el promedio de la suma de sus divisores y diga si el número ingresado es un
número perfecto. Ejemplo:
        - Ingrese un número: 200
R/ Divisores: 1 2 4 5 8 10 20 25 40 50 100 200
Cantidad de Divisores: 12
Promedio de la suma de los divisores: 38,75
Numero Perfecto: No*/

import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero");
        int numero = sc.nextInt();
        double aux=0;
        double suma=0;

        for (int i = 1; i <= numero; i++) {
            if(numero % i==0){
                aux++;
                System.out.println("Divisores de "+numero+ " son: " +i);
                suma = suma + i;

            }


        }
        if(suma==numero){
            System.out.println("Es perfecto");
        }else{
            System.out.println("No Es perfecto");
        }
        double promedio = suma / aux;
        System.out.println("El número " + numero + " tiene " + aux + " divisores");
        System.out.println("promedio de la suma de los divisores "+promedio);

    }

}
