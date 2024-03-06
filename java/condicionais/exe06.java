package condicionais;

import java.util.Scanner;

class cond_exe06 {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print("Digite um numero do 1 ao 9: ");
        int num = input.nextInt();

        switch (num) {
            case 1: System.out.print("Este é o numero um !");
                break;

            case 2: System.out.print("Este é o numero dois !");
                break;

            case 3: System.out.print("Este é o numero três !");
                break;

            case 4: System.out.print("Este é o numero quatro !");
                break;

            case 5: System.out.print("Este é o numero cinco !");
                break;

            case 6: System.out.print("Este é o numero seis !");
                break;
                
            case 7: System.out.print("Este é o numero sete !");
                break;

            case 8: System.out.print("Este é o numero oito !");
                break;

            case 9: System.out.print("Este é o numero nove !");
                break;

            default: System.out.print("Numero inválido!");
                break;
        }
        
        input.close();

    }

}