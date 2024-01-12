package cicloIF;
/*Suponga que las tarifas de una compañía de gas se basan en el consumo de acuerdo con
        la siguiente información: los primeros 70 metros cúbicos de gas usado tiene un costo de 500
        pesos, los siguientes 100 metros cúbicos de gas usado 250 pesos por metro cúbico, los
        siguientes 230 metros cúbicos de gas usado 125 pesos por metro cúbico, por encima de 400
        metros cúbicos de gas usado 55 pesos por metro cúbico. Dada la lectura anterior y actual
        de gas en metros cúbicos podrá acceder a un descuento. Tendrá un descuento del 20% si
        la lectura actual es menor a la lectura anterior y tendrá un descuento del 50% si la lectura
        actual es menor al 50% del consumo total de la lectura anterior.*/


import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String args[]) {
double total;
        Scanner sc= new Scanner(System.in);
        System.out.println("Por favor ingrese la lectura actual del gas");
        int Lac=sc.nextInt();
        int Lac2=Lac;
        System.out.println("Por favor ingrese la lectura anterior del gas");
        int Lan=sc.nextInt();
        if (Lac <= 70) {
        total=500;
        }else{
            total=500;
            Lac = Lac-70;
        }if(Lac<100){
            total=Lac*50+total;
        }else{
            Lac = Lac - 100;
            total = 500+100*50;
        }if(Lac<230){
            total=Lac*25;
          }else{
            Lac = Lac - 230;
           total=Lac*15+total+(25*230);
        }
        if(Lac2<Lan) {
          if(Lac2<70 || Lac2>170) {
                total = total * 0.8;
            }
          if(Lac2>170 && Lac2<400){
              if(Lan*0.50==Lac){
                  total=total*0.5;
              }
        }
        }
        System.out.println("El valor a pagar es:  " + total);
    }

}


