package lacos_repeticao;

import java.util.Scanner;

class lacos_repeticao_exe05 {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero para exibir a tabuada: ");
        int num = input.nextInt();

        for(int i = 1; i <=10; i++){
            System.out.printf("%d * %d = %d\n", num, i, num *i);

        }

        input.close();

    }

}
