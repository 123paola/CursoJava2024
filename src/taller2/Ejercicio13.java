package taller2;
/*Una empresa maneja códigos numéricos con las siguientes características: Cada código
consta de cuatro dígitos: El primero representa una provincia, el segundo el tipo de operación
y los dos últimos, el número de la operación. Escriba un programa que lea de teclado un
número de cuatro dígitos, y posteriormente imprima en pantalla la siguiente información: por
ejemplo, si el código es 5922.*/
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero de cuatro cifras");
        int num = sc.nextInt();

        //verificando que el numero sea de 4 cifras
        if(num >= 1000 && num<10000) {

            int a = num / 1000;
            System.out.println("Provincia: " + a);
            num = num % 1000;
            int num2 = num / 100;
            System.out.println("Tipo de operación:: " + num2);
            int num3 = num % 100;
            System.out.println("Número de operación:: " + num3);
if(a>=1 && a<=3){
    System.out.println("Su area geografica pertenece al norte  " );
} else if (a>=4 && a<=6) {
    System.out.println("Su area geografica pertenece al sur " );
}else if (a>=7 && a<=9) {
    System.out.println("Su area geografica pertenece al Este " );
}else if (a==0) {
    System.out.println("Su area geografica pertenece al OEste " );
}
        }else{
            System.out.println("Error: Código no valido”.");
        }
    }
}
