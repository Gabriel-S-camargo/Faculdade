package programacao_objetos;

class bombaCombustivel {
    
    int numBomba;
    String tipoCombustivel;
    double valorLitro;
    double quantidadeBomba;

    public void abastecerPorValor(double valorAbastecimento){

        double quantidadeAbastecida = valorAbastecimento / this.valorLitro;

        if(quantidadeAbastecida > quantidadeBomba){
            System.out.println("\nErro, quantidade de litros indisponível na bomba");
        }
        else{
            this.quantidadeBomba -= quantidadeAbastecida;

            System.out.printf("\nAbastecimento concluido!\nQuantidade abastecida: %.2f\n quantidade Bomba disponível: %.2f", quantidadeAbastecida, this.quantidadeBomba);
        }

    }

    public void abastecerPorLitro(int quantidadeAbastecimento){

        double valorAbastecido = quantidadeAbastecimento * this.valorLitro ;

        if(quantidadeAbastecimento > quantidadeBomba){
            System.out.println("\nErro, quantidade de litros indisponível na bomba");
        }
        else{
            this.quantidadeBomba -= quantidadeAbastecimento;

            System.out.printf("\nAbastecimento concluido!\nValor a pagar: %.2f\n quantidade Bomba disponível: %.2f", valorAbastecido, this.quantidadeBomba);
        }

    }

    public void alterarValor(double novoValor){

        this.valorLitro = novoValor;

        System.out.printf("\nValor Atualizado\n Novo valor do Litro: %.2f", this.valorLitro);

    }

    public void alterarQuantidadeCombustível(double quantidadeAdicionada){
        
        this.quantidadeBomba += quantidadeAdicionada;

        System.out.printf("\nQuantidade atualizada!\nQuantidade de combustivel na bomba: %.2f", this.quantidadeBomba);

    }

    public void status(){

        System.out.println("\nNumero da Bomba: " + this.numBomba);
        System.out.println("\nTipo do combustível: " + this.tipoCombustivel);
        System.out.println("\nValor atual do litro: " + this.valorLitro);
        System.out.println("\nQuantidade na Bomba: " + this.quantidadeBomba);
    }

}

class poo_exe03{

    public static void main(String[] args){

        bombaCombustivel b1 = new bombaCombustivel();

        b1.numBomba = 1;
        b1.quantidadeBomba = 100;
        b1.tipoCombustivel = "Gasolina";
        b1.valorLitro = 6.00;

        b1.status();
        b1.abastecerPorLitro(10);
        b1.status();
        b1.alterarValor(6.10);
        b1.status();

    }

}