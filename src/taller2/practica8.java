package taller2;
/*crear un juego donde se generen dos numero aleatorios y sumarlos *pedir al usuario que intente adivinar la suma de los numeros aleatorios*/

import java.util.Random;
import java.util.Scanner;
public class practica8 {
    public static void main(String args[]){
        Random random = new Random();
        Scanner sc= new Scanner(System.in);

        //Generando un numero aleatorio entre 1 y 10

        int num1=random.nextInt(10);
        System.out.println("Suma= " + num1);
        int num2=random.nextInt(10);
        System.out.println("Suma= " + num2);
        int var1= num1+num2;
        System.out.println("Suma= " + var1);

        System.out.println("Ingrese un numero para adivinar la suma");
        int suma= sc.nextInt();

        if(var1==suma){
            System.out.println("\n\t\t-Felicitaciones has ganado con el numero: "+var1);
        }else {
            System.out.println("\n\t\t-Error no has adivinado la suma");
        }




    }
}
