package taller2;

/*Dado el salario de un trabajador imprimir el salario a pagar sabiendo que el salario es mayor
        de un salario mínimo pero menor que dos, cobrar el 15% de retención en la fuente, si es
        igual o superior a dos salarios mínimos, cobrar un 28% de retención, en caso de ganar
        menos de un salario mínimo dar un subsidio del 30%.*/
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        double salarioMinimo = 1300000;

        System.out.println("Por favor ingrese el salario" );
        double salario = sc.nextDouble();

        if(salario>salarioMinimo && salario<2*salarioMinimo){
            double retencion= salario*0.15;
            salario=salario-retencion;
            System.out.println("El sueldo que le corresponde es: " + salario);
        }if(salario>=2*salarioMinimo){
            double retencion= salario*0.28;
            salario=salario-retencion;
            System.out.println("El sueldo que le corresponde es: " + salario);
        }else{
            double subsidio= salario*0.30;
            salario=salario+subsidio;
            System.out.println("El sueldo que le corresponde es: " + salario);
        }
    }

}
