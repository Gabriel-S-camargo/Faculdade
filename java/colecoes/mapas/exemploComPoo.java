package colecoes.mapas;

import java.util.Map;
import java.util.TreeMap;
 
class Fruta {
    private String nome;
    private int quantidade;
    private double preco;
 
    public Fruta(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
 
    /* Metodos getters e setters */
 
    /* Metodo para mostrar informacoes da fruta */
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preco: " + this.preco);
    }
}
 
public class exemploComPoo {
    public static void main(String[] args) {
        /* Criando um TreeMap */
        Map<String, Fruta> estoque = new TreeMap<>();
 
        /* Adiciona frutas e suas informacoes ao estoque */
        estoque.put("Maca", new Fruta("Maca", 50, 2.5));
        estoque.put("Banana", new Fruta("Banana", 100, 1.75));
        estoque.put("Laranja", new Fruta("Laranja", 75, 3.0));
 
        /* Exibe o estoque de frutas */
        System.out.println("Estoque de Frutas:\n");
        for (Map.Entry<String, Fruta> fruta : estoque.entrySet()) {
            fruta.getValue().mostrarInformacoes();
            System.out.println();
        }
    }
}
