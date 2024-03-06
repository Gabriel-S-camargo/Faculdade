package lacos_repeticao;

import java.util.Scanner;

class lacos_repeticao_exe03 {  
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero de controle: ");
        int control_number = input.nextInt();

        int i = 1; 

        for(i = 1; i <= control_number; i++){
            if(i % 2 == 0){
                System.out.println(10);
            }
        }

        input.close();
        
    }

}
