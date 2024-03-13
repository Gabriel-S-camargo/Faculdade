package funcoes;

import java.util.Scanner;

class funcoes_exe01 {
    private static void linha(int quantidade, char caractere){
        
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