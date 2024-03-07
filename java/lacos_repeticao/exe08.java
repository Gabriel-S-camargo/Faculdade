package lacos_repeticao;

import java.util.Scanner;

class lacos_repeticao_exe08 {
    
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Digite os numeros para ser calculado a amplitude do intervalo[0 para exit]: ");
        double num = input.nextDouble();

        double maior = num;

        double menor = num;

        do{
        
            if(num > maior){
                maior = num;

            }
            if (num < menor) {
                menor = num;
            }

            System.out.print("Digite os numeros para ser calculado a amplitude do intervalo[0 para exit]: ");
            num = input.nextDouble();
                        
        }while(num != 0);

        double amplitude = maior / menor;

        System.out.printf("Amplitude do intervalo: %.2f", amplitude);

        input.close();


    }


}
