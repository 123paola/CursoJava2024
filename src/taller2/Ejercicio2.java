package taller2;
/*Un estudiante de la universidad tiene unos ingresos I y unos gastos G, desea saber si sus
        ingresos del mes alcanzan para pagar todos sus gastos y la cantidad que le sobra o falta.*/

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]){


    Random random = new Random();


    //Generando un numero aleatorio entre 1 y 1000

    double I=random.nextDouble(1000);
        System.out.println("Ingresos= " + I);
    double  G=random.nextDouble(1000);
        System.out.println("Gastos= " + G);
    double Itotal= I-G;
        System.out.println("La cantidad sobrante es = " + Itotal);


if(Itotal>0){
    System.out.println("Alcanza a pagar todos sus gastos= ");
}else{
    System.out.println("No alcanza a pagar todos sus gastos= ");
}
}

}