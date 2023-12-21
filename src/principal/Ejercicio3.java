/*Realice un programa que permita calcular la altura de un cono conociendo el volumen y el
radio de su base.*/
package principal;


public class Ejercicio3 {
    public static void main(String args[]) {
        double volumen = 8;
        double radio = 5;
        double PI = 3.14;

        double h = (3 * volumen) / (PI * Math.pow(radio, 2));
        System.out.println("La altura del cono es: " + h);


    }
}
