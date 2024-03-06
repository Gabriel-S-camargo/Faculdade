package condicionais;

import java.util.Scanner;

class cond_exe03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Primeiro numero: ");
        int num_1 = input.nextInt();

        if(num_1 % 2 == 0 && num_1 % 3 ==0){
            System.out.printf("Este numero é divisivel por 2 e por 3");
        }else{
            System.out.printf("Este numero não é divisivel por 2 e por 3");
        }

        input.close();
    }


}
