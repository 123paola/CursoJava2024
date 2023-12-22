package principal;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class practica4 {
    public static void main(String args[]) {
        int a= 12;
        int b = 15;
        int c= 18;

        System.out.println("---------ECUACION ARITMETICA-------------");
        double numerador=(sqrt(pow(a,2)+pow(b,2)+pow(c,2)));
        double denominador=(pow(a,2)+2*a*b+pow(b,2)-((pow(a,2)-2*a*c+pow(c,2))));
        double division=(15/pow(c,2));
        System.out.println("el numerador es: " +numerador);
        System.out.println("El denominador es: "+denominador);
        System.out.println("la division es: " +division);
        double resultado=(numerador/denominador)+division;
        System.out.println("El reultado de la ecuacion es: " +resultado);
    }
}
