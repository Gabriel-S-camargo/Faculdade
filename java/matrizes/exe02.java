package matrizes;

import java.util.Scanner;

class matrizes_exe02 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[5][5];

        int i = 0;

        int j = 0;

        int soma = 0;

        for(i = 0; i < 5; i++){
            for(j = 0; j < 5; j++){
                System.out.printf("Informe numero para preencher a posição:[%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
                if(i == 0){
                    soma+= matriz[i][j];
                }
            }
        }

        for(i = 0; i < 5; i++){
                System.out.printf(" [%d] ", matriz[2][i]);

        }

        System.out.printf("\nA soma dos elementeos da linha 2 é: %d", soma);

        input.close();
    
    }
}
