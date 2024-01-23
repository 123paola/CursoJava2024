package Vectores1;
/*A partir del ejercicio anterior, realice un programa que guarde en un vector las notas totales de un estudiante de la universidad de Pamplona (3 parciales y 3 notas de Q.T.T.E por cada corte). Guardar en la primera posición del vector la nota del 1° parcial, seguido guarda las 3 notas de
Q.T.T.E (hasta aquí irían “llenas” las 4 primeras posiciones del vector) y así sucesivamente con los 2 siguientes cortes. Luego muestre de manera ordenada en pantalla:
NOTA DEL 1° PARCIAL:
NOTA PROMEDIO DE Q.T.T.E DEL 1° CORTE:
NOTA DEL 2° PARCIAL:
NOTA PROMEDIO DE Q.T.T.E DEL 2° CORTE:
NOTA DEL 2° PARCIAL:
NOTA PROMEDIO DE Q.T.T.E DEL 2° CORTE:
NOTA PONDERADA DEL 1° CORTE:
NOTA PONDERADA DEL 2° CORTE:
NOTA PONDERADA DEL 3° CORTE:
NOTA PONDERADA FINAL:
        *Optimice el programa solicitando el nombre del estudiante y la asignatura. Además indique si el estudiante APROBO o REPROBO.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //instanciando las clase scanner
        Scanner sc = new Scanner(System.in);

        //tamaño del vector
        double[] vect1 = new double[3];
        double[] vect2 = new double[3];
        double[] vect3= new double[3];
        double[] vect4= new double[3];
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;

        //datos del estudiante
        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la asignatura: ");
        String asignatura = sc.nextLine();

        for (int i = 0; i < vect1.length; i++) {
            System.out.print("Ingrese nota " + (i + 1) + " del primer corte:");
            vect1[i] = sc.nextDouble();
            sum += vect1[i];
        }
        System.out.println("Ingrese la nota de 1° PARCIAL: ");
        double parcial1=sc.nextDouble();

        double promedio = sum / vect1.length;
        promedio=promedio*0.15;
        parcial1=parcial1*0.85;
        double total1=promedio+parcial1;


        for (int i = 0; i < vect2.length; i++) {
            System.out.print("Ingrese nota " + (i + 1) + " del segundo corte:");
            vect2[i] = sc.nextDouble();
            sum1 += vect2[i];
        }

        System.out.println("Ingrese la nota de 2° PARCIAL: ");
        double parcial2=sc.nextDouble();
        double promedio1 = sum1 / vect2.length;
        promedio1=promedio1*0.15;
        parcial2=parcial2*0.85;
        double total2=promedio1+parcial2;




        for (int i = 0; i < vect3.length; i++) {
            System.out.print("Ingrese nota " + (i + 1) + " del tercer corte:");
            vect3[i] = sc.nextDouble();
            sum2 += vect3[i];
        }
        System.out.println("Ingrese la nota de 3° PARCIAL: ");
        double parcial3=sc.nextDouble();
        double promedio2 = sum2 / vect3.length;
        promedio2=promedio2*0.15;
        parcial3=parcial3*0.85;
        double total3=promedio2+parcial3;




        System.out.println("NOTA DEL 1° PARCIAL: "+parcial1);
        System.out.print("NOTA PROMEDIO DE Q.T.T.E DEL 1° CORTE:"+promedio+"\n");

        System.out.println("NOTA DEL 2° PARCIAL: "+parcial2);
        System.out.print("NOTA PROMEDIO DE Q.T.T.E DEL 2° CORTE:"+promedio1+"\n");

        System.out.println("NOTA DEL 3° PARCIAL: "+parcial3);
        System.out.print("NOTA PROMEDIO DE Q.T.T.E DEL 3° CORTE:"+promedio2+"\n");

        System.out.println("NOTA PONDERADA DEL 1° CORTE:"+ total1);
        System.out.println("NOTA PONDERADA DEL 2° CORTE:"+ total2);
        System.out.println("NOTA PONDERADA DEL 3° CORTE:"+total3);

        double total4=(total1+total2+total3)/3;
        System.out.print("NOTA PONDERADA FINAL::"+total4+"\n");

        if(total4>=3){
            System.out.println("El estudiante "+nombre+" Aprueba el año");

        }else{
            System.out.println("El estudiante "+nombre+" Reprueba el año");
        }

    }


}

