package funcoes;

import java.util.Scanner;

class funcoes_exe03 {
    
    public static void compra(double precoProduto, String nomeProduto){

        double valorFinal = precoProduto - (precoProduto * 0.10);

        System.out.printf("Voce comprou um %s por %.2f, Com isso voce recebeu 10%% de desconto!!", nomeProduto, precoProduto);
        System.out.printf("\nValor Final = %.2f", valorFinal);

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Qual o nome do produto que voce quer commprar ?: ");
        String nome = input.next();

        System.out.print("Qual o valor dele ? ");
        double precoProduto = input.nextDouble();


        compra(precoProduto, nome);

        input.close();
    }

}
