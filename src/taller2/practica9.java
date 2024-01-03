package taller2;
/*Realice un programa que solicite al usuario la longitud de los tres lados de un triangulo
y determinar que tipo de triangulo es teniendo en cuenta las siguientes clasificaciones:
si los tres lados son iguales es equilatero
si los dos lados son iguales isoceles
si todos los son diferentes escaleno
 */
import java.util.Random;
import java.util.Scanner;
public class practica9 {
    public static void main(String args[]) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int lado1=random.nextInt(10);
        System.out.println("Lado 1= " + lado1);
        int lado2=random.nextInt(10);
        System.out.println("Lado 1= " + lado2);
        int lado3=random.nextInt(10);
        System.out.println("lado 3= " + lado3);

        if(lado1==lado2 && lado1==lado3){
            System.out.println("Es un triangulo equilatero");
        }else{
            if(lado1!=lado2 && lado1!=lado3 &&lado2!=lado3){
                System.out.println("Es un triangulo escaleno");
            }else{
                System.out.println("Es un triangulo isoceles");
            }
        }
    }
}

