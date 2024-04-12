package associacao_entre_classes;

class Produto{
    
    // Atributos

    public String nomeProduto;
    public double preco;

    // Builder

    public Produto(String nomeProduto, double preco){
        
        this.nomeProduto = nomeProduto;
        this.preco = preco;

    }

    // Getters e setters

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}


class Secao{

    // atributos

    public String nomeSecao;
    public Produto[] produtos;
    public int numProdutos;

    // Builder

    public Secao(String nomeSecao){

        this.nomeSecao = nomeSecao;
        this.produtos = new Produto[10];
        this.numProdutos = 0;

    }

    // Metodos

    public void adicionarProduto(Produto produto){
        produtos[numProdutos] = produto;
        numProdutos++;
    }

    public void mostraInfo(){
        System.out.println("\nSessão: " + this.nomeSecao);

        for(int i = 0; i < numProdutos; i++){
            System.out.println("\nProduto[" + (1 + i) +  "]");
            System.out.println("Nome: " + produtos[i].getNomeProduto());
            System.out.println("Preco: " + produtos[i].getPreco());
        }
    }
}


class Loja {

    // Atributos

    public String nomeLoja;

    public Secao[] secoes;

    public int numSecoes;

    public Loja(String nomeLoja){
        
        this.nomeLoja = nomeLoja;
        this.secoes = new Secao[10];
        this.numSecoes = 0;

    }


    public void adicionarSecao(Secao secao){

        secoes[numSecoes] = secao;
        numSecoes++;

    }

    public void mostraInfoFull(){

        System.out.println("Loja: " + this.nomeLoja);

        for(int i = 0; i < numSecoes; i++){

            secoes[i].mostraInfo();

        }

    }
    
} 


class atividada_associacao {
    
    public static void main(String[] args){

        Produto produto01 = new Produto("Monitor Acer", 1200);

        Produto produto02 = new Produto("Yoga 6I slim", 4200);

        Secao secao01 = new Secao("Eletronicos");

        Loja loja01 = new Loja("Ricardo Eletro");

        secao01.adicionarProduto(produto01);

        secao01.adicionarProduto(produto02);

        loja01.adicionarSecao(secao01);

        loja01.mostraInfoFull();


    }
}
