package cicloFor;

/*Realice un programa que calcule el COS(X) (X dado por el usuario) utilizando de las series de
Taylor.*/
import java.util.Scanner;

import static java.lang.Math.pow;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x_inf=0;
        int uno=0;
        double suma_total=0;

       System.out.print("Introducir el numero de terminos: ");
        double n = sc.nextDouble();

        for (int i = 0; i <= n; i++) {


            double x_sup = n * n * i;
            int aux_fact = 2 * i;
            if (aux_fact == 0) {
                x_inf = 1;
            }
            for (int j = 0; j < aux_fact; j++) {
                x_inf = aux_fact * (aux_fact - i);
            }
            double x_div_in = x_sup / x_inf;
            for (int k = 0; k < i; k++) {
                uno = uno * -1;
                if (uno == 0) {
                    uno = -1;
                }
            }
            x_div_in = x_div_in * uno;
            suma_total = suma_total + x_div_in;

        }
        System.out.print("\n cos(%f) = %f" + n + suma_total );

    }
}
