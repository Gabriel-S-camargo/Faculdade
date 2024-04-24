package colecoes.mapas;

import java.util.Map;
import java.util.TreeMap;

class exemploMapas {

    public static void main(String[] args) {

        Map<String, Integer> estoque = new TreeMap<>();

        // Adiciona elementos ao Mapa
        estoque.put("Maca", 50);
        estoque.put("Banana", 100);
        estoque.put("Laranja", 75);

        // Atualiza o valor da chave
        // estoque.put("Maca", 60);

        // Remove valores da Maca
        // estoque.remove("Maca");

        // Verifica se possui a chave no Mapa

        // if(estoque.containsKey("Maca")){
        // System.out.println("Maca ja existe no estoque");
        // }

        // Limpa os elementos do estoque
        // estoque.clear();

        mostrarEstoque(estoque);

        System.out.println(estoque.size());

    }

    public static void mostrarEstoque(Map<String, Integer> estoque) {

        for (Map.Entry<String, Integer> fruta : estoque.entrySet()) {
            System.out.println("Fruta: " + fruta.getKey() + " | Quantidade em estoque: " + fruta.getValue());
        }

    }

}
