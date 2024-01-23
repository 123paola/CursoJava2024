package Vectores1;
//ordenar un vector de menor a mayor//

public class main2 {
    public static void main(String[] args) {

        int[] vector = {5, 2, 9, 1, 5, 6};


        for (int i = 0; i < (vector.length - 1); i++) { //[0][0],[0][1],[0][2],[0][3],
            for (int j = 0; (j < vector.length - 1); j++) { //[1][0],[1][1],[1][2],[1][3],
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;

                }

            }
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }

    }
}
