package cicloFor;

/*Cierta empresa de salud nos ha pedido desarrollar un simulador de encuestas y el tema a tratar es el consumo de
comida chatarra. La encuesta debe poder aplicarse a una cantidad N de personas (N ingresado por el usuario,
                                                                                se recomienda una población >15).*/
import java.util.Scanner;
public class Proyecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas encuestadas: ");
        int n = sc.nextInt();
        int aux = 0, aux1 = 0, aux2 = 0, aux3 = 0, aux4 = 0, aux5 = 0, aux6 = 0,aux7=0,aux8=0,aux9=0;

        for (int i = 0; i < n; i++) {
            System.out.print("Encuesta  # " + i);
            System.out.print("\n Cual es su tipo de sexo: \n 1. Femenino\n 2. masculino\n");
            System.out.print("seleccione una opcion: ");
            int sexo = sc.nextInt();




            switch (sexo) {
                case 1:
                    aux = aux + 1;
                    break;
                case 2:
                    aux1 = aux1 + 1;
                    break;
            }

           System.out.print("\n2. Usted consume comida chatarra \n 1. Si\n 2. No\n");
              System.out.print("seleccione una opcion: ");
            int comida = sc.nextInt();

            switch (comida) {
                case 1:
                    aux2 = aux2 + 1;
                    System.out.print("Que prefiere \n 1. Hamburguesa \n 2. Pizza \n 3. Picada\n");
                        System.out.print("seleccione una opcion: ");
                    int preferencia = sc.nextInt();

                    switch (preferencia) {
                        case 1:
                            aux3 = aux3 + 1;
                            break;
                        case 2:
                            aux4 = aux4 + 1;
                            break;
                        case 3:
                            aux5 = aux5 + 1;

                    }
                    break;
                case 2:
                    aux6 = aux6 + 1;
                    System.out.print("Que prefiere \n 1. Frutas \n 2. Jugos \n 3. Suplementos\n");
                        System.out.print("seleccione una opcion: ");
                    int otra = sc.nextInt();

                    switch (otra) {
                        case 1:
                            aux7 = aux7 + 1;
                            break;
                        case 2:
                            aux8 = aux8 + 1;
                            break;
                        case 3:
                            aux9 = aux9 + 1;
                    }
                    break;


            }


        }
int resultado=aux+aux1;
        System.out.println("Cantidad de hombres y mujeres encuestados: "+resultado);
        System.out.println("Cantidad personas que consumen comida chatarra: "+aux2);
        System.out.println("Cantidad personas que no consumen comida chatarra: "+aux6);
        if(aux3>=aux4 && aux3>=aux5){
            System.out.println("La comida chatarra mas consumida es la hamburguesa: ");
        } else if (aux4>=aux3 && aux4>=aux5) {
            System.out.println("La comida chatarra mas consumida es la pizza: ");

        }else if(aux5>=aux3 && aux5>=aux4){
            System.out.println("La comida chatarra mas consumida es la picada: ");

        }

        if(aux7<=aux8 && aux7<=aux9){
            System.out.println("Lo que menos gusta a quienes no consumen comida chatarra son las frutas");
        } else if (aux8<=aux7 && aux8<=aux9) {
            System.out.println("Lo que menos gusta a quienes no consumen comida chatarra son los jugos");

        }else if(aux9<=aux7 && aux9<=aux8){
            System.out.println("Lo que menos gusta a quienes no consumen comida chatarra son los supleementos");

        }


    }
}

