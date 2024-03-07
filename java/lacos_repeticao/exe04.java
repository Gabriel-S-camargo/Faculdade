package lacos_repeticao;

import java.util.Scanner;

class lacos_repeticao_exe04 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int soma = 0;

        int num = 0;

        do{
            System.out.println("Informe num para soma(0 para exit): ");
            num = input.nextInt();

            soma += num;
    
        }while(num != 0);

        System.out.printf("Soma total: %d", soma);

        input.close();
    }


}
