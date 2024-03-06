package condicionais;

import java.util.Scanner;

class cond_exe04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Primeiro numero: ");
        int num_1 = input.nextInt();

        if (num_1 % 2 == 0 && num_1 % 7 == 0) {
            System.out.println("Este número é divisível por 2 e por 7.");
        } else if (num_1 % 2 == 0) {
            System.out.println("Este número é divisível apenas por 2.");
        } else if (num_1 % 7 == 0) {
            System.out.println("Este número é divisível apenas por 7.");
        } else {
            System.out.println("Este número não é divisível por 2 nem por 7.");
        }

        input.close();
    }
}
