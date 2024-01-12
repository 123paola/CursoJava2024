package cicloFor;

/*MULTIPLOS (Que el usuario escriba un número, ahora escriba el intervalo donde desea saber
        cuántos múltiplos de ese número hay y cuales son.)*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿De qué número quieres los múltiplos?: ");
        int x = sc.nextInt();

        System.out.print("¿Hasta qué número quieres la lista?: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % x == 0)
                System.out.println(i);

        }

    }
}

