package matriz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja fazer uma matriz Quadrada? 1-Sim 2-Nao");
        int op = sc.nextInt();

        if (op == 1) {

            System.out.print("Linhas e Colunas: ");
            int n = sc.nextInt();
            int matriz[][] = new int[n][n];

            System.out.println("Digite os numeros da Matriz");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }
            TipoMatriz.matrizQuadrada(matriz);

        } else {

            System.out.print("Linha: ");
            int l = sc.nextInt();
            System.out.print("Coluna: ");
            int c = sc.nextInt();

            int matriz[][] = new int[l][c];

            System.out.println("Digite os numeros da Matriz");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }
            TipoMatriz.mat(matriz);
        }
        sc.close();
    }    
}
