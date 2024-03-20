package funcoes;

import java.util.Scanner;

class funcoes_exe04 {
    
    public static void comparaNum(int num01, int num02, int num03){

        int maior = num01;

        if(maior < num02){
            maior = num02;
        }
        if(maior < num03){
            maior = num03;
        }

        System.out.printf("O maior numero eh: %d", maior);

    }


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe num01: ");
        int num01 = input.nextInt();

        System.out.print("Informe num02: ");
        int num02 = input.nextInt();

        System.out.print("Informe num03: ");
        int num03 = input.nextInt();


        comparaNum(num01, num02, num03);

        input.close();

    }
}
