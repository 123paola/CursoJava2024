package taller2;
/*En una piñata se van a entregar regalos de la siguiente manera: a las niñas menores de 6
años se les va a dar un coche, entre 6 y 9 un peluche y a las demás una muñeca; a los niños
menores de 5 se les va a dar un carrito entre 5 y 8 un disfraz de hombre araña y a los demás
        una bicicleta, Dados el sexo y la edad del niño determinar que regalo le corresponde.*/
import java.util.Objects;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el sexo del niño");
        String sexo = sc.nextLine();

        System.out.println("Por favor ingrese la edad del niño");
        int edad = sc.nextInt();

        if(Objects.equals(sexo,"Femenino") || Objects.equals(sexo,"femenino")){
if(edad<6){
    System.out.println("Felicidades le corresponde un coche");

} else if (edad>=6 && edad<=9) {
    System.out.println("Felicidades le corresponde un peluche");
} else {
    System.out.println("Felicidades le corresponde una muñeca");
}
        }
        if(Objects.equals(sexo,"Masculino") || Objects.equals(sexo,"masculino")){
            if(edad<5){
                System.out.println("Felicidades le corresponde un carro");

            } else if (edad>=5 && edad<=8) {
                System.out.println("Felicidades le corresponde un disfraz de hombre araña");
            } else {
                System.out.println("Felicidades le corresponde una bicicleta");
            }
        }
    }
}