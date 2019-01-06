package matriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja fazer uma matriz Quadrada? 1-Sim 2-Nao \n");
        int op = sc.nextInt();

        if (op == 1) {

            int n = sc.nextInt();
            int matriz[][] = new int[n][n];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }
            matrizQuadrada(matriz);

        } else {

            System.out.println("Linha: ");
            int l = sc.nextInt();
            System.out.println("Coluna: ");
            int c = sc.nextInt();

            int matriz[][] = new int[l][c];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            mat(matriz);

        }

        sc.close();
    }

    public static void mat(int[][] matriz) {

        System.out.println("\n------------\n");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
            }
        }

    }

    public static void matrizQuadrada(int[][] matrizQ) {

        System.out.println("\n------------\nDiagonal primaria: ");
        for (int i = 0; i < matrizQ.length; i++) {
            System.out.print(matrizQ[i][i] + " ");
        }

        System.out.println("\n------------\nDiagonal secundaria: ");
        int j = matrizQ.length;
        for (int i = 0; i < matrizQ.length; i++) {
            j--;
            System.out.print(matrizQ[i][j] + " ");
        }
    }
}
