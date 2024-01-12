package cicloFor;


/*Realice un programa para que halle todos los números pares que se encuentran dentro de un
intervalo dado por el usuario. (Nota: No importa el orden menor o mayor primero del intervalo) y
diga cuantos números pares hay.*/

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el rango mayor");
        int mayor = sc.nextInt();

        System.out.println("Por favor ingrese el rango menor");
        int menor = sc.nextInt();
        int aux = 0;


        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                System.out.println("i:" + i);
                aux++;
            }
        }
        System.out.println("Cantidad de numeros pares:" + aux);
    }
}
