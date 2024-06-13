import java.io.*; /* Pacote responsável por lidar com entrada e saída de dados. */
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    // Sistema Gerenciamento de Produtos e Pedidos
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        boolean executando = true;

        while (true) {
            System.out.println("# Menu principal #");
            System.out.println("[1] Produtos");
            System.out.println("[2] Pedidos");
            System.out.println("[3] Sair");
            System.out.printf("Selecione uma das opcoes : ");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    // System.out.println("[1] Produtos");
                    menuProdutos(input);
                    break;
                case 2:
                    // System.out.println("[2] Pedidos");
                    menuPedidos(input);
                    break;
                case 3:
                    System.out.println("\nSaindo...");
                    System.exit(0); // Encerra o programa
                    break;
                default:
                    System.out.println("opcao invalida !!");
                    break;
            }
        }
    }

    // Menu Dos Produtos 
    public static void menuProdutos(Scanner input) {
        while (true) {
            System.out.println("\n# Produtos #");
            System.out.println("[1] Incluir produto");
            System.out.println("[2] Editar quantidade estoque produto");
            System.out.println("[3] Editar preco unitario produto");
            System.out.println("[4] Excluir produto");
            System.out.println("[5] Listagem produtos");
            System.out.println("[6] Voltar ao menu principal...");
            System.out.printf("Selecione uma das opcoes : ");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("[1] Incluir produto");
                    break;
                case 2:
                    System.out.println("[2] Editar quantidade estoque produto");
                    break;
                case 3:
                    System.out.println("[3] Editar preco unitario produto");
                    break;
                case 4:
                    System.out.println("[4] Excluir produto");
                    break;
                case 5:
                    System.out.println("[5] Listagem produtos");
                    break;
                case 6:
                    System.out.println("\n");
                    return;
                default:
                    System.out.println("opcao invalida !!");
                    break;
            }
        }
    }

    // Menu Dos Pedidos 
    public static void menuPedidos(Scanner input) {
        while (true) {
            System.out.println("\n# Pedidos #");
            System.out.println("[1] Novo pedido");
            System.out.println("[2] Listagem pedidos");
            System.out.println("[3] Voltar ao menu principal");
            System.out.printf("Selecione uma das opcoes : ");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("[1] Novo pedido");
                    break;
                case 2:
                    System.out.println("[2] Listagem pedidos");
                    break;
                case 3:
                    System.out.println("\n");
                    return;
                default:
                    System.out.println("opcao invalida !!");
                    break;
            }
        }
    }
}
