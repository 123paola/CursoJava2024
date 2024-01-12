package cicloFor;

import java.util.Scanner;
import java.util.Random;

public class practica17 {


    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("""

                1.suma
                2.resta
                3.multiplicacion
                4. division:""");
        System.out.println("seleccione la opcion" );
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("ingrese la cantidad que quiere que" +
                        "se sumen:");
                int number1 = sc.nextInt();
                int sum1 = 0;
                int sum2 = 0;
                int con1 = 0;
                int con2 = 0;
                for (int i = 0; i < number1; i++) {
                    int aleatorio = 1 + random.nextInt(1000);
                    if (i % 2 == 0) {
                        sum1 += aleatorio;
                        con1++;
                    } else {
                        sum2 += aleatorio;
                        con2++;
                    }
                }
                System.out.println("La suma de numeros pares es " + sum1 + "" +
                        "y la cantidad que se sumo es " + con1);
                System.out.println("La suma de numeros impares es " + sum2 + "" +
                        "y la cantidad que se sumo es " + con2);
                break;
            case 2:
                System.out.println("ingrese la cantidad que quiere que" +
                        "lo numero quieren que se reste:");
                int anInt = sc.nextInt();
                int i1 = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                for (int j = 0; j < anInt; j++) {
                    int aleatorio2 = 1 + random.nextInt(1000);
                    if (j % 2 == 0) {
                        i1 -= aleatorio2;
                        i3++;
                    } else {
                        i2 -= aleatorio2;
                        i4++;
                    }
                }
                System.out.println("La resta de numeros pares es " + i1 + "" +
                        "y la cantidad que se resto es " + i3);
                System.out.println("La resta de numeros impares es " + i2 + "" +
                        "y la cantidad que se rest es " + i4);
                break;
            case 3:
                System.out.println("ingrese la cantidad que quiere que" +
                        "lo numero quieren que se multiplique:");
                int nextInt = sc.nextInt();
                int j1 = 1;
                int j2 = 1;
                int j3 = 0;
                int j4 = 0;
                for (int j = 0; j < nextInt; j++) {
                    int aleatorio3 = 1 + random.nextInt(1000);
                    if (j % 2 == 0) {
                        j1 *= aleatorio3;
                        j3++;
                    } else {
                        j2 *= aleatorio3;
                        j4++;
                    }
                }
                System.out.println("La Multi de numeros pares es " + j1 + "" +
                        "y la cantidad que se multi es " + j3);
                System.out.println("La Multi de numeros impares es " + j2 + "" +
                        "y la cantidad que se multi es " + j4);
                break;
        }

        }
}



