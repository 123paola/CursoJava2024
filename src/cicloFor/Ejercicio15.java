package cicloFor;

/*Realice un programa que calcule el e^(X) (X dado por el usuario) utilizando de las series de
Taylor.*/
import java.util.Scanner;

import static java.lang.Math.pow;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introducir las repeticiones de la serie: ");
        double n = sc.nextDouble();

        System.out.print("Introducir el valor de x: ");
        double x = sc.nextDouble();
        double e=0;

        for (int i = 0; i <= n; i++) {
            int c=1;
            int f=1;
            while(c<=i){
             f=f*c;
             c=c+1;
            }
             e= e +pow(x,i)/f;
        }
        System.out.println("El resultado de la funcion es: "+e + 1);
    }

}
