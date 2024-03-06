package lacos_repeticao;


class lacos_repeticao_exe02{
    
    public static void main(String[] args){

    int soma = 0;

    int num = 1;

    for(int i = 0; i <= 99; i++){
        soma += num;
        num++;

    }
    System.out.printf("Soma: %d", soma);
      
    }

}
