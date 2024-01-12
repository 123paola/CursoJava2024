package cicloFor;
/*crear un menu donde se le pide al usuario 4 opciones, suma, resta,multiplicacion, division*/

import java.util.Scanner;

public class practica11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu de opciones");
        System.out.println("1. suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("Por favor seleccione una opcion");
        int menu = sc.nextInt();

        switch (menu) {

            case 1 -> {


                System.out.println("Por favor ingrese primer numero");
                int num1 = sc.nextInt();
                System.out.println("Por favor ingrese segundo numero");
                int num2 = sc.nextInt();
                int suma = num1 + num2;
                System.out.println("El resultado de la suma es: " + suma);

            }
            case 2 -> {


                System.out.println("Por favor ingrese primer numero");
                int numero1 = sc.nextInt();
                System.out.println("Por favor ingrese segundo numero");
                int numero2 = sc.nextInt();
                int resta = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resta);

            }

            case 3 -> {


                System.out.println("Por favor ingrese primer numero");
                int a = sc.nextInt();
                System.out.println("Por favor ingrese segundo numero");
                int b = sc.nextInt();
                int multiplicacion = a * b;
                System.out.println("El resultado de la multiplicacion es: " + multiplicacion);

            }

            case 4 -> {


                System.out.println("Por favor ingrese primer numero");
                double number1 = sc.nextInt();
                System.out.println("Por favor ingrese segundo numero");
                double number2 = sc.nextInt();
                double division = number1 / number2;

                if (number2 == 0) {
                    System.out.println("la division no esta definida ");
                } else {
                    System.out.println("El resultado de la division es: " + division);

                }
            }
            default -> System.out.println("");
        }
    }
}




