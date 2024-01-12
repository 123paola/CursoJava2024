package cicloFor;

/*Escriba un programa que pida un número entero mayor que cero y calcule su factorial.
- Ingrese número: 5
R/ El factorial de 5 es 120.*/

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Por favor ingrese un numero");
        int numero = sc.nextInt();
        double factorial=1;
        for (int i = 1; i <= numero; i++) {
           factorial=factorial*i;
        }
        System.out.print("El factorial de " + numero+ " es: " + factorial);


    }
}
