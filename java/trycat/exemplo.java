package trycat;


class Financiamento {
    public double valorTotal;
    public double entrada;
    public int parcelas;

    public Financiamento(double valorTotal, double entrada, int parcelas) {
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }

    public double valorPrestacao() {
        return (this.valorTotal - this.entrada) / this.parcelas;
    }

    

}

class exemplo {

    public static void main(String[]args){

        Financiamento financiamento01 = new Financiamento(1000, 100, 10);

        System.out.println(financiamento01.valorPrestacao());
    }
    
}

