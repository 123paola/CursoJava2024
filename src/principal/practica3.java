package principal;

import java.util.Scanner;


public class practica3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la edad");
        int edad = sc.nextInt();

        if (edad >= 18 && edad <= 20) {
            System.out.println("La persona puede tomar cerveza");
        } else {
            System.out.println("La persona no puede tomar cerveza");
        }
    }
}
