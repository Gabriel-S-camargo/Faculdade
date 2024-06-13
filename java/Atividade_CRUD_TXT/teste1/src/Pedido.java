public class Pedido {
    private int numeroPedido;
    private int codigoProduto;
    private double precoUnitario;
    private int quantidade;

    public Pedido(int numeroPedido, int codigoProduto, double precoUnitario, int quantidade) {
        this.numeroPedido = numeroPedido;
        this.codigoProduto = codigoProduto;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return numeroPedido + ";" + codigoProduto + ";" + precoUnitario + ";" + quantidade;
    }
}
