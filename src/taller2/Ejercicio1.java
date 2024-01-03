package taller2;

/*Realice un programa que permita calcular el número de pulsaciones que debe tener una
        persona por cada 10 segundos de ejercicio aeróbico; la fórmula que se aplica cuando el sexo
        es femenino es:
        • Núm. pulsaciones = (220 - edad) / 10
        Y si el sexo es masculino:
        • Núm. pulsaciones = (210 - edad) / 10*/

import java.util.Objects;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);

        System.out.println("Ingrese su tipo de sexo: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad=sc1.nextInt();

        if(Objects.equals(nombre,"masculino")||(Objects.equals(nombre,"Masculino"))){
            int num_pulsaciones=(210-edad)/10;
            System.out.println("El numero de pulsaciones es: "+num_pulsaciones);
        }else{
            int num_femenino=(220-edad)/10;
            System.out.println("El numero de pulsaciones es: "+num_femenino);
        }


    }
}
