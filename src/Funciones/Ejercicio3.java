package Funciones;
/*Realice un programa que pida al usuario un número del 1 al 10 y mediante una función muestre el número escrito en letras.*/

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero del 1 al 10");
        int numero = sc.nextInt();

        if (numero >=1 && numero <= 10) {
            String numeroLetra = Conversion(numero);
            System.out.println("Numero en letras: " + numeroLetra);
        } else {
            System.out.println("Por favor ingrese un numero valido");
        }

    }

    public static String Conversion(int numero) {
        switch (numero) {
            case 1:
                return "Uno";
            case 2:
                return "Dos";
            case 3:
                return "Tres";
            case 4:
                return "cuatro";
            case 5:
                return "Cinco";
            case 6:
                return "seis";
            case 7:
                return "Siete";
            case 8:
                return "Ocho";
            case 9:
                return "Nueve";
            case 10:
                return "Diez";

            default:
                System.out.println("");
        }
        return null;
    }
}





