package vetores;

import java.util.Scanner;

class vetores_exe03 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];

        int i = 1;

        for(i = 0; i < 5; i++){
            System.out.printf("Digite um numero para o vetor[%d]: ", i);
            vetor[i] = input.nextInt();
        }

        System.out.printf("Digite o numero que deseja Buscar: ");
        int numero_busca = input.nextInt();

        for(i = 0; i <5; i++){
            if(numero_busca == vetor[i] ){
                System.out.printf("Numero achado no indice: [%d]", i);
                break;
            }else{
                System.out.printf("numero nao encontrado!");
                break;
            }
        }

        input.close();

    }

}
