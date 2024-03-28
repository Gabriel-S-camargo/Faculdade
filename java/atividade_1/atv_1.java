package atividade_1;

class Conta{

    // Atributos <*_*>
    public int numConta;
    protected String tipoConta;
    private String titularConta;
    private double saldoConta = 0;
    private boolean statusConta;

    //Get e set de cada Atributo

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public int getNumConta(){
        return this.numConta;
    }

    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    public String getTipoConta(){
        return this.tipoConta;
    }


    public void setTitularConta(String titularConta){
        this.titularConta = titularConta;
    }
    public String getTitularConta(){
        return this.titularConta;
    }

    public void setSaldoConta(double saldoConta){
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta(){
        return this.saldoConta;
    }

    public void setStatusConta(boolean statusConta){
        this.statusConta = statusConta;
    }

    public boolean getStatusConta(){
        return this.statusConta;
    }

    // Metodos (|<*_*>|)

    public void infoConta(){
        System.out.println("\nNumero da Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipoConta());
        System.out.println("Titular Conta: " + this.getTitularConta());
        System.out.println("Saldo atual: " + this.getSaldoConta());
        if(getStatusConta() == false){
            System.out.println("Status: Fechada");

        }
        else{
            System.out.println("Status: Aberta");
            
        }


    }

    public void infoOperacaoRealizada(){
        System.out.println("\nNumero da Conta: " + this.getNumConta());
        System.out.println("Titular Conta: " + this.getTitularConta());
        System.out.println("Saldo atual: " + this.getSaldoConta());
    }

    public void abrirConta(int numConta, String tipoConta, String titularConta){
    
    if(getStatusConta() == true){
        System.out.println("\nERRO! Conta ja aberta");
    }
    else{

        setNumConta(numConta);
        setTipoConta(tipoConta);
        setTitularConta(titularConta);
        setStatusConta(true);
        
        if(getTipoConta() == "CC"){
            setSaldoConta(50);
    
         }else if(getTipoConta() == "CP"){
            setSaldoConta(150);
    
         } 
    
        }

        System.out.println("\nConta Aberta!");

        infoOperacaoRealizada();

    }

    public void fecharConta(){
        if(getStatusConta() == false){
            System.out.println("\nERRO! Conta ja esta fechada");
        }
        else if(getSaldoConta() != 0){
            System.out.println("\nERRO! Conta ainda possui saldo\nSaldo Restante: " + getSaldoConta());
        }
        else{
            setStatusConta(false);

            System.out.println("\nConta fechada Com Sucesso!");

            infoOperacaoRealizada();

        }

    }

    public void deposito(double valorDeposito){
        if(getStatusConta() == false){
            System.out.println("\nERRO! Conta esta fechada");
        }
        else{
            double saldoTemp = getSaldoConta();
    
            saldoTemp += valorDeposito;
    
            setSaldoConta(saldoTemp);

            System.out.println("\nDeposito Realizado!");

            infoOperacaoRealizada();


        }
    }

    public void saque(double valorSaque){
        if(getStatusConta() == false){
            System.out.println("\nERRO! Conta esta fechada");
        }
        else if(getSaldoConta() < valorSaque){
            System.out.println("\nERRO! Valor de Saque maior que saldo disponível");
        }
        else{
            double saldoTemp = getSaldoConta();

            saldoTemp -= valorSaque;

            setSaldoConta(saldoTemp);

            System.out.println("\nSaque Realizado!");

            infoOperacaoRealizada();
        }

    }

    public void pagarMensalidade(){
        
        double valorMensalidade = 0;

        if(getTipoConta() == "CC"){
            valorMensalidade = 12;
        }
        else{
            valorMensalidade = 20;
        }


        if(getStatusConta() == false){
            System.out.println("\nERRO! Conta esta fechada");
        }
        else if (getSaldoConta() < valorMensalidade){
            System.out.println("\nERRO! Saldo em conta insuficiente para pagar mensalidade");
        }
        else{

            double saldoTemp = getSaldoConta();

            saldoTemp -= valorMensalidade;

            setSaldoConta(saldoTemp);

            System.out.println("\nMensalidade Paga");
            infoOperacaoRealizada();
        }


}

}

class atividade_1 {
    
    public static void main(String[] args){

        // builder
        Conta c1 = new Conta();

        // testes
        
        c1.infoConta();
        c1.abrirConta(1, "CP", "Gabriel");
        c1.pagarMensalidade();
        c1.fecharConta();
        c1.deposito(10);
        c1.saque(140);
        c1.fecharConta();
        c1.saque(10);
        c1.deposito(10);

    }

}
