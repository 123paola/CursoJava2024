package cicloIF;

/*Calcular el total de dinero propio de una empresa a invertir en una compra, el total de dinero
solicitado en préstamo al banco y el total de dinero a pagar a la fábrica por concepto de
crédito. La empresa quiere hacer una compra de N piezas de la misma clase a una fábrica,
a X pesos cada pieza. La empresa, dependiendo del monto total de la compra, decidirá qué
hacer para pagar a la fábrica.
        • Si el monto total de la compra es mayor de $1 000 000 la empresa tendrá la
capacidad de invertir de su propio dinero un 55% del monto de la compra, pedir
prestado al banco un 30% y el resto lo pagará solicitando un crédito al fabricante.
        • Si el monto total de la compra está entre $500 000(inclusive) y $1 000 000 la
empresa tendrá capacidad de invertir de su propio dinero un 60%, pedir prestado al
banco un 15% y el restante 25% lo pagará solicitando crédito al fabricante.
        • Si el monto total de la compra es menor de $500 000 la empresa tendrá capacidad
de invertir de su propio dinero un 70% y el restante 30% lo pagará solicitando crédito
al fabricante.
        • El fabricante cobra por concepto de intereses un 20% sobre la cantidad que se le
pague a crédito.*/
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el total de piezas:");
        int n = sc.nextInt();

        System.out.println("Por favor ingrese el valor de cada pieza");
        int costo= sc.nextInt();

        double total=n*costo;

        if(total>1000000){
            double inversion= total*0.55;
            inversion=total-inversion;
            double banco=total*0.3;
            banco=total-banco;
            double credito=total*0.15;
            credito=total-credito;

            double intereses= credito*0.2;
            intereses=credito-intereses;

            System.out.println("La inversion es de: "+ inversion);
            System.out.println("El prestamo del banco es de: "+ banco);
            System.out.println("El credito a pagar es por: "+ credito);
            System.out.println("El interese por el credito es: "+ intereses);

        } else if (total>=500000 && total<=1000000) {
            double inversion= total*0.6;
            inversion=total-inversion;
            double banco=total*0.15;
            banco=total-banco;
            double credito=total*0.25;
            credito=total-credito;

            double intereses= credito*0.2;
            intereses=credito-intereses;

            System.out.println("La inversion es de: "+ inversion);
            System.out.println("El prestamo del banco es de: "+ banco);
            System.out.println("El credito a pagar es por: "+ credito);
            System.out.println("El interese por el credito es: "+ intereses);

        } else if (total<500000) {
            double inversion= total*0.7;
            inversion=total-inversion;
            double credito=total*0.3;
            credito=total-credito;

            double intereses= credito*0.2;
            intereses=credito-intereses;

            System.out.println("La inversion es de: "+ inversion);
            System.out.println("El prestamo del banco es de: 0 ");
            System.out.println("El credito a pagar es por: "+ credito);
            System.out.println("El interese por el credito es: "+ intereses);
        }

    }

}
