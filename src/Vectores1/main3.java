package Vectores1;

import java.util.Scanner;

//pedirle al usuario que ingrese los elementos del vector y los odrdene de mayor a menor//
//sumar todos los elementos del vector y sacar el promedio
//contar cuantos pares e impares hay
public class main3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum=0;
        int aux2=0;
        int aux3=0;

        System.out.println("Ingrese el tamaño del vector:");
        int tam = sc.nextInt();


        int[] vector = new int[tam];

        for (int j =0; j < vector.length; j++){
            System.out.print("vector["+(j+1)+"]:");
            vector[j]= sc.nextInt();
            sum += vector[j];

            if(vector[j]%2 ==0){
                aux2++;
            }else {
                aux3++;
            }
        }

        System.out.println("Metodo burbuja");
        for (int i = 0; i < (vector.length - 1); i++) {
            for (int j = 0; (j < vector.length - 1); j++) {
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }

            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }

        int promedio = sum / vector.length;

        System.out.println("El promedio de los elementos del vector es:"+promedio);
        System.out.println("Hay "+aux2+" numeros pares y "+aux3+" Impares");


    }
}