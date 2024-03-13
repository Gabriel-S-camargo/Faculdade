package matrizes;

import java.util.Scanner;

class matrizes_exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[5][5];

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite os elementos da matriz para posicao[%d][%d]:", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int menor = matriz[0][0];
        int maior = matriz[0][0];
        int soma = 0;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                soma += matriz[i][j];
            }
        }

        
        double media = (double) soma / 25;

        System.out.println("Menor valor da matriz: " + menor);
        System.out.println("Maior valor da matriz: " + maior);
        System.out.println("Soma dos valores da matriz: " + soma);
        System.out.println("Média dos valores da matriz: " + media);

        scanner.close();
    }
}
