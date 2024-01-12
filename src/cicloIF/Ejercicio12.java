package cicloIF;
/*Una fábrica de computadoras planea ofrecer a los clientes un descuento que dependerá del
número de computadoras que compre. Si las computadoras son menos de cinco se les dará
un 10% de descuento sobre el total de la compra; si el número de computadoras es mayor
o igual a cinco, pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se
les da un 40% de descuento. El precio de cada computadora es de $ X pesos, desarrolle un
programa que le permita a la empresa de computadores saber el valor de la venta con y sin
descuento.*/

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese el precio del computador");
        double precio = sc.nextDouble();

        System.out.println("Por favor ingrese la cantidad a llevar");
        double cantidad = sc.nextDouble();

        double resultado=precio*cantidad;

        if(cantidad<5){
            double resultado1=resultado*0.1;
            resultado1=resultado-resultado1;
            System.out.println("El valor a pagar es: "+resultado1);
        }else if(cantidad>=5 && cantidad<10){
            double resultado1=resultado*0.2;
            resultado1=resultado-resultado1;
            System.out.println("El valor a pagar es: "+resultado1);
        }else if(cantidad>=10){
            double resultado1=resultado*0.4;
            resultado1=resultado-resultado1;
            System.out.println("El valor a pagar es: "+resultado1);
        }
    }
}
