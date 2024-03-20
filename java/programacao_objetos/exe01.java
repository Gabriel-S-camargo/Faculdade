package programacao_objetos;

class contaCorrente {
    
    int numConta;
    String nomeUser;
    double saldoUser = 0;  

    public void deposito(double valorDeposito){
        saldoUser += valorDeposito;
        System.out.printf("\nDeposito realizado!\nNome do Beneficiario: %s \nSaldo atual: %.2f",nomeUser, saldoUser);
    }

    public void saque(double valorSaque){
           
            if(valorSaque < saldoUser){
                
                saldoUser -= valorSaque;
                System.out.printf("\nSaque realizado!\nNome do Beneficiario: %s \nSaldo atual: %.2f",nomeUser, saldoUser);
            }
            else{
                System.out.println("Saque Negado, saldo de conta menor que valor desejado");


            }
        
    }

    public static void main(String[] args){

        contaCorrente conta01 = new contaCorrente();

        conta01.nomeUser = "Gabriel";
        conta01.numConta = 1;

        conta01.saque(100);
        conta01.deposito(1000);
        conta01.saque(50);

    }

}
