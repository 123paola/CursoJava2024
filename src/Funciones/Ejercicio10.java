package Funciones;

/*Realice una función que reciba una edad en AÑOS MESES Y DÍAS y devuelva la edad expresada en HORAS.*/

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su edad ");
        System.out.println("en años: ");
        int años = sc.nextInt();
        System.out.println("en meses: ");
        int meses = sc.nextInt();
        System.out.println("en dias: ");
        int dias = sc.nextInt();
        int horas=horas(años,meses,dias);
        System.out.println("La edad en horas es: "+horas);
}
public static int horas(int a,int m, int d){
        int horas=a*365*24;
    return horas;
    }

}

