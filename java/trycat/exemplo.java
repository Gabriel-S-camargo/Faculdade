package trycat;


class Financiamento{
    public double valorTotal;
    public double entrada;
    public int parcelas;
    
    public Financiamento(double valorTotal, double entrada, int parcelas){
        
        if(entrada < valorTotal * 0.2){
            throw new RuntimeException("A entrada deve ser de pelo menos 20%");
        }
        else if(parcelas < 6){
            throw new RuntimeException("O numero minimo de parcelas deve ser 6");
        }
        
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;
    }
    
    public double prestacao(){
        return (valorTotal - entrada) / parcelas;
    }
}

class exemplo {

    public static void main(String[] args) {
        double valorTotal = 1000;
        double entrada = 200;
        int parcelas = 6;
        
        try{
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao()); 
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
    
}

