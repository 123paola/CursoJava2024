package taller2;
/*Realice un programa que, dado un número natural de 3 cifras (no todas iguales)
    encuentre e imprima el número mayor y el menor que se puede formar con las mismas
    cifras y los muestre en pantalla.
    Por Ejemplo: Número: 174 ; Mayor 741 ; Menor 147. */
import java.util.Scanner;
public class practica10 {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        //creando variables auxiliares
        int M,m,n;

        System.out.print("Ingrese un numero de 3 cifras:");
        int number = sc.nextInt();

        //verificando que el numero sea de 3 cifras
        if(number <= 99 || number >= 1000){
            System.out.println("Error el numero debe de ser de 3 cifras");
        }

        int a = number / 100;
        int ra = number % 100;
        int b = ra / 10;
        int c = ra % 10;

        //algorimto para encontrar el numero mayor
        if( a > b && a > c){
            M = a;
        }else {
            if(b > a && b > c){
                M = b;
            }else {
                M = c;
            }
        }

        //algoritmo para encontrar el numero menor
        if( a < b && a < c){
            m = a;
        }else {
            if(b < a && b < c){
                m = b;
            }else {
                m = c;
            }
        }

        //Algoritmo para encontrar el numero del medio
        if(a < M && a > m){
            n = a;
        }else {
            if ( b < M && b > m){
                n = b;
            }else {
                n = c;

            }
        }

        //operacion final
        int T = (M*100) + (n*10) + m;
        int t = (m*100) + (n*10) + M;

        System.out.println("\n\tEl N° mayor es:"+T+" y el menor es:"+t);
    }
}