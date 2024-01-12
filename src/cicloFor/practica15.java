package cicloFor;
/*crear un algoritmo donde se le pida al usuario dos rangos uno menor y otro mayor e imprimir sus pares*/

import java.util.Scanner;

public class practica15 {

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


