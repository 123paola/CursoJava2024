package cicloFor;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese un numero: ");
        int serie = sc.nextInt();

        int num1 = 0, num2 = 1, suma = 1, aux = 0, aux2 = 0;
        int numUno = 0, numDos = 1, suma2 = 1;
        int numero1 = 1, numero2 = 2, suma3 = 2, aux3 = 0;
        int numeroUno = 0, numeroDos = 1, suma4 = 0, aux4 = 0;


        // Muestro el valor inicial
        System.out.print(num1);

        for (int i = 1; i < serie; i++) {


            // muestro la suma
            System.out.print(" " + suma);


            //primero sumamos
            suma = num1 + num2;

            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;

            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;


        }
        System.out.print("\n************Menu de opciones************\n");
        System.out.print("1. Pares e impares\n");
        System.out.print("2. Primos\n");
        System.out.print("3. Perfectos\n");
        System.out.println("Por favor seleccione una opcion");
        int menu = sc.nextInt();

        switch (menu) {

            case 1:

                for (int j = 1; j < serie; j++) {
                    if (suma2 % 2 == 1) {
                        // muestro la suma
                        System.out.print(" \n Impar: " + suma2);
                        aux++;
                    } else {
                        System.out.print(" \n par: " + suma2);
                        aux2++;

                    }


                    //primero sumamos
                    suma2 = numUno + numDos;

                    //Despues, cambiamos la segunda variable por la primera
                    numUno = numDos;

                    //Por ultimo, cambiamos la suma por la segunda variable
                    numDos = suma2;


                }
                System.out.println("\nCantidad de numeros pares:" + aux2);
                System.out.println("Cantidad de numeros impares:" + aux);
                int resultado = aux2 + aux;
                System.out.println("Suma Total:" + resultado);


                break;
            case 2:
                for (int j = 2; j < serie - 1; j++) {    // j es el número que se comprueba si es primo
                    // i son los divisores
                    int i = 2;
                    while (suma3 % i != 0) {
                        i++;
                    }
                    if (i == suma3) { // si se ha dividido por el propio número entonces es primo
                        System.out.print("Primo: ");
                        System.out.println(suma3);
                        aux3++;
                    }
                    //primero sumamos
                    suma3 = numero1 + numero2;

                    //Despues, cambiamos la segunda variable por la primera
                    numero1 = numero2;

                    //Por ultimo, cambiamos la suma por la segunda variable
                    numero2 = suma3;

                }
                System.out.println("\nCantidad de numeros primos:" + aux3);
                break;

            case 3:


                for(int i=6;i <= serie;i++){      // i es el número que vamos a comprobar

                    for(int j = 1;j < i;j++){    // j son los divisores. Se divide desde 1 hasta i-1
                        if(i % j==0){
                            suma4 = suma4 + j; // si es divisor se suma
                        }
                    }
                    if(i == suma4){             // si el numero es igual a la suma de sus divisores es perfecto
                        System.out.println(i);
                    }
                }
                //primero sumamos
                suma4 = numero1 + numero2;

                //Despues, cambiamos la segunda variable por la primera
                numero1 = numero2;

                //Por ultimo, cambiamos la suma por la segunda variable
                numero2 = suma4;
                break;
        }

    }
}










