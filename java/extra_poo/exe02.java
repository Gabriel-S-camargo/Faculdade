package extra_poo;

class calculadora{
    public double soma(double num01, double num02){
        
        double resultadoSoma = num01 + num02;

        System.out.println("resultado soma: " + resultadoSoma);
        
        return resultadoSoma;
    }

    public double subtracao(double num01, double num02){

        double resultadoSubtracao = num01 - num02;

        System.out.println("resultado subtracao: " + resultadoSubtracao);

        return resultadoSubtracao;

    }

    public double divisao(double num01, double num02){

        double resultadoDivisao = num01 / num02;

        System.out.println("resultado divisao: " + resultadoDivisao);

        return resultadoDivisao;
    }

    public double multiplicacao(double num01, double num02){

        double resultadoMultiplicacao = num01 * num02;

        System.out.println("resultado multiplicacao: " + resultadoMultiplicacao);

        return resultadoMultiplicacao;
    }



}


class extra_poo_exe02 {
    

    public static void main(String[] args){

        calculadora c1 = new calculadora();

        double num01 = 10;

        double num02 = 5;


        c1.multiplicacao(num01, num02);
        c1.divisao(num01, num02);
        c1.soma(num01, num02);
        c1.subtracao(num01, num02);

    }


}
