package vetores;

import java.util.Scanner;

 class vetores_Exe02 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um numero para o vetor[%d]: ", i);
            vetor[i] = input.nextInt();
            soma += vetor[i];
        }

        double media = (double) soma / 5; // Performing floating-point division

        System.out.printf("A media desse array eh: %.2f, sendo os numeros iguais ou acima da media: ", media);

        for (int i = 0; i < 5; i++) {
            if (vetor[i] >= media) {
                System.out.printf(" [%d] ", vetor[i]);
            }
        }

        input.close();
    }
}
