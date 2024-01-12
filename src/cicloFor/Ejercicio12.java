package cicloFor;

/*/Escriba un programa que dibuje el triángulo del tamaño indicado por el usuario de acuerdo al
        ejemplo anterior:
        - Ingrese la altura del triángulo: 5
        *
        * *
        * * *
        * * * *
        * * * * **/

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el tamaño: ");
        int tamaño = sc.nextInt();




        for(int i=1; i<=tamaño; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        sc.close();
    }

}
