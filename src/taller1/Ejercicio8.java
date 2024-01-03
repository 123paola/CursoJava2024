/*Dado un valor en pesos y conociendo la tasa de cambio del dólar, el bolívar y el euro con
  respecto al peso, determine a cuanto equivale el valor dado en pesos, en cada una de estas
  otras monedas. (Tener en cuenta las siguientes tasas de cambio 1 dólar =2500 pesos, 1
  euro =3000 pesos, un bolívar = 0.52 pesos).*/
package taller1;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String args[]){
        double pesos;
        double dolar=2500;
        double euro=3000;
        double bolivar=0.52;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor en pesos: ");
        pesos = sc.nextDouble();

        dolar=pesos/dolar;
        System.out.println(pesos + " Pesos convertidos en dolares es: "+ dolar);
        euro= pesos/euro;
        System.out.println(pesos + " Pesos convertidos en euros es: "+ euro);
        bolivar=pesos/bolivar;
        System.out.println(pesos + " Pesos convertidos en bolivar es: "+ bolivar);
    }

}
