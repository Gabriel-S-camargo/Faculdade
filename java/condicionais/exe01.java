package condicionais;

import java.util.Scanner;

class cond_exe01 {
    public static void main(String[] args){
        
    Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num_1 = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num_2 = input.nextInt();

        if(num_1 > num_2){
            System.out.printf("Maior: %d\nMenor: %d", num_1, num_2);

        }else{

            System.out.printf("Maior: %d\nMenor: %d", num_2, num_1);
        }

        input.close();
    }


}
