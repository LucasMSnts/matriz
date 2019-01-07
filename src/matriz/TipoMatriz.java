/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

public class TipoMatriz {
    
    public static void mat(int[][] matriz) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n------------\n");        
        System.out.println("Digite o Numero que vc deseja encontrar: \n");
        int num = sc.nextInt();
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    System.out.println("\n------------\nNa posição "+ i +", " + j);  
                    if (i > 0) {
                        System.out.println("Numero de Cima: " + matriz[i-1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Numero da Esquerda: " + matriz[i][j-1]);
                    }
                    if (j < matriz[i].length){
                        System.out.println("Numero da Direita: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length) {
                        System.out.println("Numero de Baixo: " + matriz[i+1][j]);
                    }
                }
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
        System.out.println();
    }
}
