package Vectores2;

/*Diseñe un programa que me genere un vector con 10 números aleatorios (1 al 10), pero que ningún numero se
repita y lo imprima en pantalla.*/


import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {




        int[] vect= new int[10];

        // se llama a la funcion
        llenarVector(vect);
        verificarVector(vect);
        mostrarVector(vect);


    }
    public static void llenarVector(int vect[]) {
        Random random = new Random();
        //for para llenar el vector automatico//
        for (int i = 0; i < vect.length; i++) {
            vect[i] = 1 + random.nextInt(10);
            System.out.println("Vector [" + (i + 1) + "] = " + vect[i]);
        }
    }
    public static void verificarVector(int vect[]) {
        //for para verficar los numeros repetidos//
        for (int i = 0; i < vect.length; i++) {
            for (int j = 0; j < vect.length - 1; j++) {
                if (i != j) {
                    if (vect[i] == vect[j]) {
                        System.out.println("el numero " + vect[i] + " en la posicion [" + (i + 1) + "] esta repetido");
                        vect[i] = 0;

                    }
                }
            }
        }
    }
    public static void mostrarVector(int vect[]) {
        //se muestra el vector sin los numeros repetidos//
        System.out.println("vector sin repeticiones");
        System.out.print("Vector A:");
        for(int i=0;i<vect.length;i++){
            System.out.print(" "+ vect[i]);

        }
    }
}