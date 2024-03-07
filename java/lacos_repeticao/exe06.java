package lacos_repeticao;

class lacos_repeticao_exe06 {
    // Fibonacci
    public static void main(String[] args){
        int num_anterior = 1;

        int num_atual = 1;

        int aux;

        System.out.printf(" %d ", num_anterior);

        for(int i = 0; i < 10; i++){

            System.out.printf(" %d ", num_atual);

            aux = num_anterior + num_atual;

            num_anterior = num_atual;

            num_atual = aux;

        }


    }

}
