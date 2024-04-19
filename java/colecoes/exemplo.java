package colecoes;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
 
 class ListaDeFrutas {
    public static void main(String[] args) {
        
        /* Criando uma lista de frutas */
        List<String> frutas = new ArrayList<>();
        
        /* Adicionando frutas a lista */
        frutas.add("Maca");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Mamao");
        
        /* Mostrando o tamanho da lista */
        System.out.println("Tamanho da lista: " + frutas.size());
        
        /* Mostrando os elementos da lista - v1 */
        System.out.println("Elementos da lista: " + frutas);
        
        /* Mostrando os elementos da lista - v2 */
        System.out.println("Elementos da lista:");
        for(String elemento : frutas){
            System.out.println(elemento);
        }
        
        /* Mostrando os elementos da lista - v3 */
        System.out.println("Elementos da lista:");
        for(int i = 0; i < frutas.size(); i++){
            System.out.println(frutas.get(i));
        }
        
        /* Segundo elemento da lista */
        System.out.println("Segundo elemento da lista: " + frutas.get(1));
        
        /* Ultimo elemento da lista */
        System.out.println("Ultimo elemento da lista: " + frutas.get(frutas.size() - 1));
        
        /* Verificando se Laranja existe na lista */
        if(frutas.contains("Laranja")){
            System.out.println("Laranja existe na lista");
        }
        else{
            System.out.println("Laranja nao existe na lista");
        }
        
        /* Verificando se Laranja ou laranja existe na lista, independente do formato em que a palavra foi escrita */
        boolean encontrada = false;
        for (String fruta : frutas) {
            if (fruta.equalsIgnoreCase("Laranja")) {
                encontrada = true;
                break;
            }
        }
 
        if (encontrada) {
            System.out.println("Existe laranja na lista");
        } else {
            System.out.println("Nao existe laranja na lista");
        }
        
        /* Removendo uma fruta da lista */
        frutas.remove("Maca");
        System.out.println("Maca foi removida da lista");
 
        /* Mostrando os elementos da lista */
        System.out.println("Elementos da lista: " + frutas);
        
        /* Mostrando a lista em ordem crescente */
        Collections.sort(frutas);
        System.out.println("Lista ordenada em ordem crescente: " + frutas);
 
        /* Mostrando a lista em ordem decrescente */
        Collections.sort(frutas, Collections.reverseOrder());
        System.out.println("Lista ordenada em ordem decrescente: " + frutas);
        
        /* Limpando a lista */
        frutas.clear();
        System.out.println("Elementos da lista: " + frutas);
    }
}