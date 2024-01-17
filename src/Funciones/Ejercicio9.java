package Funciones;

/*Realice una función que reciba un tiempo expresado en HORAS MINUTOS Y SEGUNDOS y devuelva el tiempo
expresado sólo en SEGUNDOS.*/

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese las horas ");
        int hora = sc.nextInt();

        System.out.println("Por favor ingrese los minutos ");
        int minutos = sc.nextInt();

        System.out.println("Por favor ingrese los segundos ");
        int segundos = sc.nextInt();

        int tiempo=tiempo(hora,minutos,segundos);

        System.out.println("La hora en segundos queda "+tiempo+" segundos");

    }

    public static int tiempo(int h,int m,int s){
       int segundos=h*3600+m *60+s;
       return segundos;
    }


}
