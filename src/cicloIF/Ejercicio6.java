package cicloIF;
/*Un cliente llega a una venta de empanadas y pide una cantidad X, sabiendo que cada
        empanada cuesta $ Y, cuanto debe pagar el cliente por su pedido si:
        • Si el cliente compra más de 300 empanadas, se le dará un descuento del 30%
        • Si compra más de 200 y menos de 300, se le dará un descuento del 20%
        • Si compra entre de 100 y 200, se le dará un descuento del 10%
        • Si compra más de 50 y menos de 100, se le dará un descuento del 5%
        • Entre 1 y 50 no tiene descuento.*/


import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String args[]) {
       double total;
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Cual es el valor de cada empanada?");
        int valor=sc.nextInt();
        System.out.println("Ingrese la cantidad de empanadas a vender");
        int cantidad=sc.nextInt();
        total=cantidad*valor;

        if(cantidad>300){
            double total1 = total*0.3;
            double total2 = total-total1;
            System.out.println("Tiene un descuento del 30% y el valor total a pagar es: " + total2);
        } else if (cantidad>200 && cantidad<=300) {
            double total1 = total*0.2;
            double total2 = total-total1;
            System.out.println("Tiene un descuento del 20% y el valor total a pagar es: " + total2);
        }else if (cantidad>100 && cantidad<=200) {
            double total1 = total*0.1;
            double total2 = total-total1;
            System.out.println("Tiene un descuento del 10% y el valor total a pagar es: " + total2);
        }else if (cantidad>50 && cantidad<=100) {
            double total1 = total*0.05;
            double total2 = total-total1;
            System.out.println("Tiene un descuento del 5% y el valor total a pagar es: " + total2);
        }else {
            System.out.println("No tiene descuento ");
            System.out.println("el valor total a pagar es: " + total)  ;
        }
            
        }

    }

