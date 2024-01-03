package taller2;

/*En una agencia de viajes se desea realizar un programa para determinar el valor a pagar
por cierta cantidad de pasajes de ida saliendo desde Cúcuta, de acuerdo con la siguiente
tabla.
Determinar el valor a pagar de acuerdo a la clase, realizar un descuento del 10% si se
compran más de 5 pasajes sin importar la clase.*/
import java.util.Objects;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es su destino?:");
        String destino = sc.nextLine();

        System.out.println("Por favor ingrese la cantidad de pasajes");
        int pasaje = sc.nextInt();



        System.out.println("En que clase quiere viajar");
        System.out.println("1 clase");
        System.out.println("2 clase");
        System.out.println("3 clase");
        System.out.println("Seleccione la opcion");
        int clase = sc.nextInt();

               if(clase==1) {
                   double valor;

                   if (Objects.equals(destino, "Bogota") || Objects.equals(destino, "bogota")) {
                       if(pasaje<=5){
                           valor = pasaje * 250000;
                           System.out.println("El valor a pagar es:" + valor);
                       }else{
                           double descuento = (pasaje * 250000) * 0.1;
                           descuento = (pasaje * 250000) - descuento;
                           System.out.println("El valor a pagar es: " + descuento);
                       }

                   }
                   if (Objects.equals(destino, "Cali") || Objects.equals(destino, "cali")) {
                       if(pasaje<=5){
                       valor = pasaje * 450000;
                       System.out.println("El valor a pagar es: " + valor);
                   }else{
                           double descuento = (pasaje * 450000) * 0.1;
                           descuento = (pasaje * 450000) - descuento;
                           System.out.println("El valor a pagar es: " + descuento);
                       }

               }else if (clase==2) {
                       double valor2;

                   if (Objects.equals(destino, "Bogota") || Objects.equals(destino, "bogota")) {
                       if(pasaje<=5){
                           valor2 = pasaje * 180000;
                           System.out.println("El valor a pagar es:" + valor2);
                       }else{
                           double descuento = (pasaje * 180000) * 0.1;
                           descuento = (pasaje * 180000) - descuento;
                           System.out.println("El valor a pagar es: " + descuento);

                       }

                   }
                   if (Objects.equals(destino, "Cali") || Objects.equals(destino, "cali")) {
                       if(pasaje<=5){
                           valor2 = pasaje * 350000;
                           System.out.println("El valor a pagar es: " + valor2);
                       }else{
                           double descuento = (pasaje * 350000) * 0.1;
                           descuento = (pasaje * 350000) - descuento;
                           System.out.println("El valor a pagar es: " + descuento);
                       }


                   }
               }else if (clase==3) {
                   double valor3;
                           if (Objects.equals(destino, "Bogota") || Objects.equals(destino, "bogota")) {
                               if(pasaje<=5){
                                   valor3=pasaje*150000;
                                   System.out.println("El valor a pagar es:"+valor3);
                               }else{
                                   double descuento = (pasaje * 150000) * 0.1;
                                   descuento = (pasaje * 150000) - descuento;
                                   System.out.println("El valor a pagar es: " + descuento);
                               }

                           }if (Objects.equals(destino, "Cali") || Objects.equals(destino, "cali")) {
                           if(pasaje<=5){
                               valor3=pasaje*300000;
                               System.out.println("El valor a pagar es: "+valor3);
                           }else{
                               double descuento = (pasaje * 300000) * 0.1;
                               descuento = (pasaje * 300000) - descuento;
                               System.out.println("El valor a pagar es: " + descuento);
                           }


                           }
                       }

                       }
                   }
                   }





