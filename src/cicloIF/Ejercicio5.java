package cicloIF;
/*Suponga que las tarifas de una compañía de gas se basan en el consumo de acuerdo con
        la siguiente información: los primeros 70 metros cúbicos de gas usado tiene un costo de 500
        pesos, los siguientes 100 metros cúbicos de gas usado 250 pesos por metro cúbico, los
        siguientes 230 metros cúbicos de gas usado 125 pesos por metro cúbico, por encima de 400
        metros cúbicos de gas usado 55 pesos por metro cúbico. Dada la lectura anterior y actual
        de gas en metros cúbicos podrá acceder a un descuento. Tendrá un descuento del 20% si
        la lectura actual es menor a la lectura anterior y tendrá un descuento del 50% si la lectura
        actual es menor al 50% del consumo total de la lectura anterior.*/


import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese la lectura actual del gas");
        int Lac = sc.nextInt();
        System.out.println("Por favor ingrese la lectura anterior del gas");
        int Lan = sc.nextInt();
        double total = 0;
        double descuento = 0;

        if (Lan < 0 || Lac<0) {
            System.out.println("error");
        }
        if (Lac >= 0 && Lac <= 70) {
            total = 500;
        }
        if (Lac > 70 && Lac <= 100) {
            total = 250 * Lac;
        }
        if (Lac > 100 && Lac <= 230) {
            total = 125 * Lac;
        }
        if (Lac >= 400) {
            total = 55 * Lac;
        }
        System.out.println("el valor total es: " + total);

        if (Lac < Lan) {
            descuento = total * (total - 0.2);
            System.out.println("Tiene un descuento del 20% y el valor total es: " + descuento);

        } else if (Lan * 0.5 < Lac) {
            descuento = total * (total - 0.5);
            System.out.println("Tiene un descuento del 50% y el valor total es: " + descuento);


        }

    }

}



