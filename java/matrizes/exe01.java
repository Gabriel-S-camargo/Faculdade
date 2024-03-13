package matrizes;

import java.util.Scanner;

class matrizes_exe01 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int matriz[][] = new int[2][3];

        int i = 0;

        int j = 0;

        int soma = 0;

        for(i = 0; i < 2; i++){
            for(j = 0; j < 3; j++){
                System.out.printf("Informe numero para preencher a posição:[%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
                soma += matriz[i][j];
            }
        }

        for(i = 0; i < 2; i++){
            for(j = 0; j < 3; j++){
                System.out.printf(" [%d] ", matriz[i][j]);

                
            }
            System.out.printf("\n");
        }


        System.out.printf("A soma desses numeros são: %d", soma);



        input.close();
    
    }
}
