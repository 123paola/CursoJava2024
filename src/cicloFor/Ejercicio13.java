package cicloFor;

/*Realice un programa que calcule el SIN(X) (X dado por el usuario) utilizando de las series de
Taylor.*/
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo=1;
        double divisor=1;
        double seno=0;
        double signo;

        System.out.print("Introducir el valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Introducir el valor de n: ");
        double  n = sc.nextDouble();

        for(int i=0; i<=n; i++){
            for(int j=0;j<2*i+1;j++){
                dividendo=dividendo*x;
            }
            for(int j=1; j<=2*i+1;j++){
                divisor=divisor*j;
            }
            if(i%2==0){
                signo=1;
            }else{
                signo=-1;
            }
            seno=seno+(dividendo/divisor)*signo;

        }
        System.out.print("sin de "+ x + "es: "+seno);
    }
}
