package Funciones;

/*Realice una función que reciba como parámetro un número entero y escriba la tabla de multiplicar de ese número.*/
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero ");
        int numero = sc.nextInt();

       int multiplicacion= imprimirTabla(numero);
    }

    public static int imprimirTabla(int numeroDeTabla) {
        for (int x = 1; x <= 10; x++) {
            String formato = "%d x %d = %d";
            String linea = String.format(formato, numeroDeTabla, x, numeroDeTabla * x);
            System.out.println(linea);
        }
        return numeroDeTabla;
    }
    }

