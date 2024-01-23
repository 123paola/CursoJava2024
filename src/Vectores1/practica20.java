package Vectores1;
// pidan al usuario el tamaño y generen numeros aleatorios y los guarden en el vector y lo impriman

import java.util.Random;
import java.util.Scanner;

public class practica20 {
    public static void main(String[] args) {

        //instanciando las clase random y scanner
        Scanner sc=new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese el tamaño del vector:");
        int tam=sc.nextInt();

        int[]vect= new int[tam];

        //for para llenar el vector automatico//
        for(int i=0; i<vect.length;i++){
            vect[i]=1+ random.nextInt(10);

        }
        //for para imprimir los elementos//
        for(int i=0; i<vect.length;i++){
            System.out.println("["+vect[i]+"]");
        }
    }
}
