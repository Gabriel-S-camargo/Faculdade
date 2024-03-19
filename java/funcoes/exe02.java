package funcoes;

import java.util.Scanner;

class funcoes_exe02 {
    
    public static double calcularValorLuz(double quantKw, int tipoConsumo){

        double valorTotal = 0;

        switch (tipoConsumo) {
            case 1:
                valorTotal = quantKw * 0.60;
                break;
            case 2:
                valorTotal = quantKw * 0.48;
                break;
            case 3:
                valorTotal = quantKw * 1.29;
            default:
                break;
        }

        System.out.printf("Valor a pagar: %.2f", valorTotal);
        return valorTotal;
    }

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("informe quantidade de KW consumidos: ");
        float quantidadeKw = input.nextFloat();

        System.out.println("informe modalidade -> \n[1] Pessoa Física \n[2] Comércio \n[3] Indústria: ");
        int tipoConsumo = input.nextInt();

        calcularValorLuz(quantidadeKw, tipoConsumo);

        input.close();

    }
}
