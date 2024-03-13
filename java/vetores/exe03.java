package vetores;

import java.util.Scanner;

 class vetores_Exe03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite um numero para o vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }

        System.out.print("Digite o numero que deseja buscar: ");
        int numeroBusca = input.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 5; i++) {
            if (numeroBusca == vetor[i]) {
                System.out.printf("Numero %d encontrado no índice: %d%n", numeroBusca, i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado!");
        }

        input.close();   
    }  
}
