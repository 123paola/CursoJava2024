package Vectores2;

/*A partir del programa anterior, realice un programa que genere 5 números aleatorios (del 1 al 5) sin repetir y los guarde en un vector. Luego, imprima en pantalla dicho vector y su respectivo subíndice.
        Ejemplo:
        Vector B: 3 5 1 2 4
        B[0] = 3, B[1] = 5, B[2] = 1, B[3] = 2, B[4] = 4*/

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {




    int[] vect= new int[5];

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
    System.out.print("Vector B:");
    for(int i=0;i<vect.length;i++){
        System.out.print(" "+ vect[i]);


    }
    System.out.print("\n");
    for(int i=0;i<vect.length;i++){
        System.out.print(" B["+ vect[i]+"]="+(i+1));

    }
}
}