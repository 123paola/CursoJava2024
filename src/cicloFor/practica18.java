package cicloFor;
import java.util.Scanner;

public class practica18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese la cantidad de notas: ");
        int notas = sc.nextInt();
        double sum2 = 0;

        for (int i = 0; i < notas; i++) {
            System.out.print("Ingrese la " + (i + 1) + "° nota:");
            double notas2 = sc.nextDouble();
            sum2 += notas2;
        }
        double promedio = sum2 / notas;

        if (promedio < 3.0) {
            System.out.println("EL usuario ha reprobado la materia con:" + promedio);
        } else {
            System.out.println("EL usuario ha aprobado la materia con:" + promedio);
        }
    }
}


