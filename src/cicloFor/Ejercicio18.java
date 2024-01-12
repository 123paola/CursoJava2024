package cicloFor;
/*Realice un programa que simule un reloj digital. Además, que se pueda colocar una alarma
        para que realice algún tipo de aviso o advertencia al llegar a una hora especificada por el usuario.
        (hh:mm:ss)*/

import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);


        System.out.println("***************Ingresa la hora inicial en formato de 24 horas hh:mm:ss*************  ");
        System.out.print("Ingresa la hora:  ");
        int hora1=sc.nextInt();
        System.out.print("Ingresa los minutos:  ");
        int minutos1=sc.nextInt();
        System.out.print("Ingresa los segundos:  ");
        int segundos1=sc.nextInt();
        System.out.println(+hora1+":"+minutos1+":"+segundos1);


        System.out.println("***************Ingresa la hora final en formato de 24 horas hh:mm:ss*************  ");
        System.out.print("Ingresa la hora:  ");
        int hora2=sc.nextInt();
        System.out.print("Ingresa los minutos:  ");
        int minutos2=sc.nextInt();
        System.out.print("Ingresa los segundos:  ");
        int segundos2=sc.nextInt();
        System.out.println(+hora2+":"+minutos2+":"+segundos2);

            // validar que la fecha inicial debe ser menor a la final
            if (hora1 >= hora2)
                if (minutos1 >= minutos2)
                    if (segundos1 >= segundos2) {
                        System.out
                                .println("Error: ¡La hora FINAL debe ser MAYOR a la inicial!");
                        System.exit(0);
                    }
            System.out.println("Las horas son correctas. :)");


        }

    }