package lacos_repeticao;

class lacos_repeticao_exe07 {
    public static void main(String [] args){

        float numerador = 1;

        float denominador = 100;

        float soma = 0;

        for(int i = 0; i < 100; i++){

            soma += numerador / denominador;

            numerador++;

            denominador--;

        }

        System.out.printf("Soma Final: %.2f", soma );
    }

}
