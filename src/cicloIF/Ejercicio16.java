package cicloIF;

/*Calcular el valor de la cuota mensual y el número de cuotas a pagar, por la realización de
un préstamo en un banco con las siguientes condiciones: Si el préstamo es menor de
$500000 se paga un interés de 10% sobre el total del préstamo y las cuotas mensuales
quedan de un 3% del monto total. Si el préstamo está entre $500000 y $1000000(inclusive)
se paga un interés del 7% y las cuotas quedan de un 5% del monto total. Y si el préstamo
es superior a $1000000 se paga un interés del 4% y las cuotas quedan de un 7% del monto
total.*/

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero de cuotas a pagar:");
        int cantidad = sc.nextInt();

        System.out.println("Por favor ingrese el valor de la cuota mensual");
        int valor= sc.nextInt();

        double prestamo=cantidad*valor;

        if(prestamo<500000){
            double interes= prestamo*0.1;
            interes=prestamo-interes;
            double cuota= valor*0.03;
            cuota=valor-cuota;
            System.out.println("El valor total del prestamo es: "+interes);
            System.out.println("La cuota mensual es: "+cuota);
        }else if(prestamo>=500000 && prestamo<=1000000){
            double interes= prestamo*0.07;
            interes=prestamo-interes;
            double cuota= valor*0.05;
            cuota=valor-cuota;
            System.out.println("El valor total del prestamo es: "+interes);
            System.out.println("La cuota mensual es: "+cuota);
        }else {
            double interes= prestamo*0.04;
            interes=prestamo-interes;
            double cuota= valor*0.07;
            cuota=valor-cuota;
            System.out.println("El valor total del prestamo es: "+interes);
            System.out.println("La cuota mensual es: "+cuota);
        }

            
        }
    }

