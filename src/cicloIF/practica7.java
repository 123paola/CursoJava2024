package cicloIF;
/*Crear un algoritmo, dónde compare 5 números y diga cuál es el mayor de todos*/
import java.util.Scanner;
public class practica7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese los 5 numeros a comparar: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num1 == num2) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 == num3) {
            System.out.println("El numero mayor es: " + num2);
        } else if (num3 == num4) {
            System.out.println("El numero mayor es: " + num3);
        } else if (num4 == num5) {
            System.out.println("El numero mayor es: " + num4);
        } else if (num1 == num3) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num1 == num4) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num1 == num5) {
            System.out.println("El numero mayor es: " + num1);
        } else if (num2 == num4) {
            System.out.println("El numero mayor es: " + num2);
        } else if (num2 == num5) {
            System.out.println("El numero mayor es: " + num2);
        } else if (num3 == num5) {
            System.out.println("El numero mayor es: " + num3);
        }
        if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("El numero mayor es: " + num2);
        }
        if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
            System.out.println("El numero mayor es: " + num3);
        }
        if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
            System.out.println("El numero mayor es: " + num4);
        }
        if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
            System.out.println("El numero mayor es: " + num5);


        }
    }

}