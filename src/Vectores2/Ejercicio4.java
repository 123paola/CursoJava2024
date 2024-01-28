package Vectores2;

/*Diseñar un juego de carreras de autos. En este juego compiten 5 autos cada uno identificado con un número Se requiere diseñar un programa, utilizando arreglos, que calcule al azar el orden de llegada de los 5 autos.
        Ejemplo:
        1° Lugar: Auto N°33. Piloto: Lisa Simpson
2° Lugar: Auto N°66. Piloto: Apu
3° Lugar: Auto N°88. Piloto: Homero Simpson
4° Lugar: Auto N°99. Piloto: Milhouse Van Houten
5° Lugar: Auto N°11. Piloto: Moe*/
import java.util.Random;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vect = new int[5];
        String[] vector = new String[5];

        llenarVectorNombre(vector,vect);
        imprimirVector(vector,vect);


    }

    // Función para llenar el vector con los nombres
    public static void llenarVectorNombre(String[] vector, int vect[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            // for (int j = 0; j < vector.length; j++) {
            System.out.print("Ingrese nombre del piloto: ");
            vector[i] = sc.nextLine();
            vect[i] = 1 + random.nextInt(10);


            // }
        }
    }
        public static void imprimirVector(String[] vector, int vect[]){
            //for para imprimir los elementos//
            for (int i = 0; i < vect.length; i++) {
                System.out.println(+(i + 1) + " Lugar: Auto N°" + vect[i] + " Piloto: " + vector[i]);
            }
        }

    }

