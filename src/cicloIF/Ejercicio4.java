package cicloIF;

/*Ahora realice el programa anterior para que el usuario ingrese:
        • El tipo de salario: Diario/Semanal/Mensual (1/2/3).
        • Salario (Cantidad en $).
        • La cantidad a partir de la cual se consideran Horas Extras Laborales.
        • El recargo (%) de las Horas Extras Laborales.
        • Horas trabajadas.
        • Salario a pagar (menos deducciones).
        • Deducciones:
        i. Aportes a salud: $12.5%;
        ii. Aportes a pensión: 16%;
        iii. Retención en la fuente: 4%;
        iv. ICA: 1%;
        v. ARL: 1%;*/

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas semanales: ");
        double horaTrabajada= sc.nextDouble();

        double priceHora = 260000 /horaTrabajada;
        double HoraSemanal=horaTrabajada/5;
        double HoraMensual=horaTrabajada*4;
        System.out.println("Las horas trabajadas diarias son: "+ HoraSemanal);
        System.out.println("Las horas trabajadas mensuales son: "+ HoraMensual);

        if(horaTrabajada > 40){
            double incremen1 = priceHora *0.30;
            double incremen2 = priceHora + incremen1;
            double incremen3 = incremen2 * horaTrabajada;
            double salud=incremen3*0.125;
            double pension=incremen3*0.16;
            double retencion=incremen3*0.04;
            double ICA=incremen3*0.01;
            double ARL=incremen3*0.01;
            double sueldo1=incremen3-salud-pension-retencion-ICA-ARL;



            System.out.println("El valor total de la horas extras trabajadas con incremento y deducciones es:"+sueldo1);
        }else {
            double incremen1 = priceHora * horaTrabajada;
            double salud=incremen1*0.125;
            double pension=incremen1*0.16;
            double retencion=incremen1*0.04;
            double ICA=incremen1*0.01;
            double ARL=incremen1*0.01;
            double sueldo2=incremen1-salud-pension-retencion-ICA-ARL;
            System.out.println("EL valor total sin incremento  y con deucciones es: "+sueldo2);
        }
    }
}

