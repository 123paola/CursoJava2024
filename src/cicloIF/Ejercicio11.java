package cicloIF;

/*Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos, realice
        un programa que le permita a un médico determinar si una persona tiene anemia o no, lo
        cual depende de su nivel de hemoglobina en la sangre, de su edad y de su sexo. Si el nivel
        de hemoglobina que tiene una persona es menor que el rango que le corresponde, se
        determina su resultado como positivo y en caso contrario como negativo. La tabla en la que
        el medico se basa para obtener el resultado es la siguiente:*/

import java.util.Objects;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el sexo de la persona");
        String sexo = sc.nextLine();

        System.out.println("Por favor ingrese la edad de la persona");
        int edad = sc.nextInt();

        if (edad > 0 && edad <= 1) {
            System.out.println("Nivel de hemoglobina: 13-26g%");
            System.out.println("Su resultado es negativo por lo tanto no tiene anemia");
        } else if (edad > 1 && edad <= 6) {
            System.out.println("Nivel de hemoglobina: 10-18g%");
            System.out.println("Su resultado es negativo por lo tanto no tiene anemia");
        } else if (edad > 6 && edad <= 12) {
            System.out.println("Nivel de hemoglobina: 11-15g%");
            System.out.println("Su resultado es negativo por lo tanto no tiene anemia");
        } else if (edad > 1 && edad <= 5) {
            System.out.println("Nivel de hemoglobina: 11.5-15g%");
            System.out.println("Su resultado es negativo por lo tanto no tiene anemia");
        } else if (edad > 5 && edad <= 10) {
            System.out.println("Nivel de hemoglobina: 12.6-15.5g%");
            System.out.println("Su resultado es negativo por lo tanto no tiene anemia");
        } else if (edad > 10 && edad <= 15) {
            System.out.println("Nivel de hemoglobina: 13-15.5g%");
            System.out.println("Su resultado es negativo por lo tanto no tiene anemia");
        } else if (Objects.equals(sexo, "Femenino") || Objects.equals(sexo, "femenino")) {
            if (edad < 15) {
                System.out.println("Nivel de hemoglobina: 12-16g%");
                System.out.println("Su resultado es negativo por lo tanto no tiene anemia");

            } else if (Objects.equals(sexo, "Masculino") || Objects.equals(sexo, "masculino")) {
                if (edad < 15) {
                    System.out.println("Nivel de hemoglobina: 14-18g%");
                    System.out.println("Su resultado es negativo por lo tanto no tiene anemia");

                } else {
                    System.out.println("Su resultado es positivo, por lo tanto tiene anemia");
                }
            }

        }

    }
}

