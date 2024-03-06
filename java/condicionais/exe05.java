package condicionais;

import java.util.Scanner;

class cond_exe05 {
       public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero de copias feitas: ");
        double num_copias = input.nextDouble();

        double copias_extras = num_copias - 100;

        double valor_total = 0;

        if(num_copias > 100){
            valor_total = (100 * 0.25) + (copias_extras * 0.20) ;
        }else{
            valor_total = num_copias * 0.25;
        }

        System.out.printf("O valor total a ser pago é: %.2f", valor_total);

        input.close();

    }

}
