package funcoes;

import java.util.Scanner;

class funcoes_exe02 {
    
    public static float calcularValorLuz(float quantKw, int tipo){

        float valorTotal = quantKw * tipo;

        return valorTotal;
    }

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);


        input.close();

    }
}
