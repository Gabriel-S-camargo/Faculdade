public class Produtos {

    public int codigoProduto;
    public String nomeProduto;
    public double precoUnitario;
    public int quantidadeEstoque;

    public Produtos(int codigoProduto, String nomeProduto, double precoUnitario, int quantidadeEstoque) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "codigoProduto: " + codigoProduto + ", nomeProduto: " + nomeProduto + ", precoUnitario: " + precoUnitario
                + ", quantidadeEstoque: " + quantidadeEstoque;
    }

}
