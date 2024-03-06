package lacos_repeticao;

import java.util.Scanner;

class lacos_repeticao_exe01 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num = 1;

        while(num <= 10){
            System.out.printf("%d\n", num);
            num ++;

        }

        input.close();

    }



}