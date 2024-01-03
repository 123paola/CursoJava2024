/*Un alumno desea saber cuál será su calificación final en la materia de Fundamentos de
Programación*/

package taller1;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

        System.out.println("---------------------Fundamentos deProgramación----------------------");
        System.out.println("Por favor ingrese el nombre del alumno:  ");
        String nombre=sc.nextLine();

        System.out.println("Por favor ingrese las cinco calificaciones parciales:  ");
        double nota1=sc.nextDouble();
        double nota2=sc.nextDouble();
        double nota3=sc.nextDouble();
        double nota4=sc.nextDouble();
        double nota5=sc.nextDouble();

        double promedio=(nota1 + nota2 + nota3 + nota4 + nota5)/5;
        promedio=promedio*0.6;

        System.out.println("Por favor ingrese la nota de la exposicion:  ");
        double notaExp=sc.nextDouble();
        notaExp=notaExp*0.25;

        System.out.println("Por favor ingrese el taller:  ");
        double taller=sc.nextDouble();
        taller=taller*0.15;

        double notaFinal=promedio+notaExp+taller;

        System.out.println("El estudiante  "+ nombre+ " obtuvo una nota final de : " + notaFinal);



    }
}
