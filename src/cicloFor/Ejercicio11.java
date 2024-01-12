package cicloFor;

/*Escriba un programa que pida al usuario ingresar la altura y el ancho de un rectángulo y lo
        dibuje utilizando asteriscos. Luego agréguele que el usuario sea quien ingrese el carácter que
        aparezca como "asterisco" Ejemplo:
        - Ingrese la altura del rectángulo: 3
        - Ingrese el ancho del rectángulo: 5
        * * * * *
        * * * * *
        * * * * **/

import java.util.Scanner;
public class Ejercicio11 {


            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introducir la altura del rectangulo: ");
                int altura = sc.nextInt();

                System.out.print("Introducir el ancho del rectangulo: ");
                int ancho= sc.nextInt();


                for(int i=1; i<=altura; i++){
                    for(int j=1; j<=ancho; j++){
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }

                sc.close();
            }
        }