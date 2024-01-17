package Funciones;

/*Realice un programa que determine si un número ingresado por el usuario es PAR o IMPAR mediante una función.
Dicha función debe retornar un 0 si el número ingresado por el usuario es PAR o un 1 si el número ingresado por
el usuario es IMPAR. (Imprimir el número en pantalla para verificar su funcionamiento)*/

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int numero = sc.nextInt();


        int result = esPar(numero);
        System.out.println("El numero "+numero+ " retorna " + result);



    }

    public static int esPar(int numero) {
        if (numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }

}
}




