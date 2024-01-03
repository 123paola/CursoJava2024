package taller2;
import java.util.Objects;
import java.util.Scanner;
/*mostrar las vocales*/

public class practica6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese la vocal ");
        String vocal = sc.nextLine();

        if(Objects.equals(vocal,"a") || Objects.equals(vocal,"A")){
            System.out.println("La vocal que has escogido es  "+ vocal );
        } if(Objects.equals(vocal,"e") || Objects.equals(vocal,"E")) {
            System.out.println("La vocal que has escogido es  " + vocal);
        } if(Objects.equals(vocal,"i") || Objects.equals(vocal,"I")) {
            System.out.println("La vocal que has escogido es  " + vocal);
        } if(Objects.equals(vocal,"o") || Objects.equals(vocal,"O")) {
            System.out.println("La vocal que has escogido es  " + vocal);
        } if(Objects.equals(vocal,"u") || Objects.equals(vocal,"U")) {
            System.out.println("La vocal que has escogido es  " + vocal);
        }

    }
}

