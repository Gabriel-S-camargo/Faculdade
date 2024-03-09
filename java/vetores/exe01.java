package vetores;

import java.util.Scanner;

 class vetores_exe01 {    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite um numero para o vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }

        for(int j = 4; j >= 0; j--){
            System.out.printf(" [%d] ", vetor[j]);

        }

        input.close();
    }

}
