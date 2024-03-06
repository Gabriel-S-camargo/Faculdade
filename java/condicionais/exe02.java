package condicionais;

import java.util.Scanner;

 class cond_exe02{
        public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int num_1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num_2 = input.nextInt();

        System.out.print("Digite o terceiro numero: ");
        int num_3 = input.nextInt();

        int menor_num = num_1;

        if(menor_num >  num_2){
            menor_num = num_2;
        }

        if(menor_num > num_3){
            menor_num = num_3;
        }
       
        System.out.printf("Menor numero: %d", menor_num);

        input.close();

    }
}
