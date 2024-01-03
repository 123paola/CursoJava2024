/*Realice un programa que permita calcular el área de un círculo sólo conociendo su
perímetro.*/
package taller1;



public class Ejercicio11 {
    public static void main(String args[]){
        double perimetro=17;
        double pi=3.14;

        double radio = perimetro/(2*pi);
        double area=pi*Math.pow(radio,2);

        System.out.println("el area de circulo es: " + area);
    }
}
