package funcoes;

import java.util.Scanner;

class funcoes_exemplo {
    private static void linha(int quantidade, char caractere){
        //Função com retorno de valor
        //private static tipo_do_dado_do_retorno func(parâmetros){
        //}
        for(int i = 0; i <= quantidade; i++){
            System.out.printf("%c", caractere);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        linha(10, 'a');

        input.close();

    }

}