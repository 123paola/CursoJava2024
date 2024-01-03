
/*realice el programa para que el usuario pueda ingresar números con decimales, la
 respuesta debe ser mostrada con 3 decimales.*/
package taller1;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su primer lado:");
        float num1 = sc.nextFloat();

        System.out.println("Ingrese el segundo lado:");
        float num2 = sc.nextFloat();

        System.out.println("Ingrese el tercer lado:");
        float num3 = sc.nextFloat();

        float volumen = num1 * num2 * num3;

        System.out.println("el volumen del cubo es: " + volumen);


    }
}
