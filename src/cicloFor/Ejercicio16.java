package cicloFor;

/*Realice un programa que imprima la serie de Fibonacci hasta un número dado por el usuario.
Además diga cuantos números de la serie de Fibonacci hay hasta dicho número.*/

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese un numero: ");
        int serie = sc.nextInt();

        int num1 = 0, num2 = 1, suma = 1, aux=1;


        // Muestro el valor inicial
        System.out.println(num1);

        for (int i = 1; i < serie + 1; i++) {
            if (suma <= serie) {

                // muestro la suma
                System.out.println(suma);
                //primero sumamos
                suma = num1 + num2;
                //Despues, cambiamos la segunda variable por la primera
                num1 = num2;
                //Por ultimo, cambiamos la suma por la segunda variable
                num2 = suma;
                aux++;

            }

        }
        System.out.println("Cantidad de numeros de la serie:" + aux);
    }
}


