package cicloFor;

/*Realice un programa que simule un cronómetro digital. Además, que se pueda colocar una
alarma para que realice algún tipo de aviso o advertencia al llegar a un tiempo especificado por el
usuario y que el usuario sea quien lo inicie. (hh:mm:ss)*/


import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("***************Cronometro digital*************  ");
        System.out.print("Ingresa la hora:  ");
        int horas = sc.nextInt();
        System.out.print("Ingresa los minutos:  ");
        int minutos = sc.nextInt();
        System.out.print("Ingresa los segundos:  ");
        int segundos = sc.nextInt();

        for (int i = 0; horas >=0; i++) {
            segundos = segundos - 1;

            if (segundos >= 0) {

                System.out.println(horas + ":" + minutos + ":" + segundos);
            } else if(minutos >= 0) {
                minutos = minutos - 1;
                System.out.println(horas + ":" + minutos + ":0");
            } else if (horas>=0) {
                horas=horas-1;
                System.out.println(horas+1 + ":0" + ":0");
            }


        }


        }


        }







