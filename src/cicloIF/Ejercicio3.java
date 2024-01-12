/*Un empleado trabajar 40 horas semanales en una empresa y recibe un salario de 260.000
        pesos semanales. Si excede de las 40 horas la empresa debe pagar un recargo del 30% por
        hora extra trabajada. Dadas las horas semanales trabajadas de un empleado, determinar el
        salario a pagar.*/
package cicloIF;

import java.util.Scanner;

public class Ejercicio3 {

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese las horas trabajadas: ");
            double horaTrabajada= sc.nextDouble();

            double priceHora = 260000 /horaTrabajada; //Precio de cada hora 6500

            if(horaTrabajada > 40){
                double incremen1 = priceHora *0.30;//1950
                double incremen2 = priceHora + incremen1;
                double incremen3 = incremen2 * horaTrabajada;
                System.out.println("El valor total de la horas extras trabajadas con incremento es:"+incremen3);
            }else {
                double incremen1 = priceHora * horaTrabajada;
                System.out.println("EL valor total sin incremento es: "+incremen1);
            }
        }
    }

