/*En un hospital existen tres áreas: Ginecología, Pediatría, Traumatología. El presupuesto
 anual (o monto) del hospital se reparte conforme a lo siguiente: Ginecología 40%, Pediatría
 35% y Traumatología 25% del presupuesto. Calcular la cantidad de dinero que recibirá cada
 área, para cualquier monto presupuestal.*/
package principal;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escriba el presupuesto anual: ");
        double presupuesto = sc.nextDouble();

        double ginecologia = presupuesto * 0.4;
        double pediadria = presupuesto * 0.35;
        double traumatologia = presupuesto * 0.25;

        System.out.println("El area de ginecologia le corresponde: " + ginecologia);
        System.out.println("El area de pediatria le corresponde: " + pediadria);
        System.out.println("El area de traumatologia le corresponde: " + traumatologia);
    }
}
