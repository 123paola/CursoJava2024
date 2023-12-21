/*Un vendedor recibe un sueldo base, más un 20% extra por comisión de sus ventas (Es decir,
  20% de las ventas de más que hace el vendedor) El vendedor desea saber cuánto dinero
  obtendrá por concepto de comisiones por las 3 ventas que realiza en el mes y el total que
  recibirá en el mes tomando en cuenta su sueldo base y sus comisiones. (El usuario ingresa
  el sueldo base y el valor de las 3 ventas por comisiones).*/
package principal;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escriba el nombre del vendedor: ");
        String nombre = sc.nextLine();

        System.out.println("Por favor ingrese las tres ventas del mes:  ");
        double venta1 = sc.nextDouble();
        double venta2 = sc.nextDouble();
        double venta3 = sc.nextDouble();

        System.out.println("¿Cual es su sueldo base?: ");
        double sueldoBase = sc.nextDouble();

        double comision = (venta1 + venta2 + venta3) * 0.2;
        sueldoBase = sueldoBase + comision;

        System.out.println("El vendedor  " + nombre + " obtuvo un sueldo de : " + sueldoBase);
    }

}
