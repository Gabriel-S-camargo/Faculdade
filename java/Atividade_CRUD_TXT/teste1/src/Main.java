import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Produto> produtos = new ArrayList<>();
    private static List<Pedido> pedidos = new ArrayList<>();
    private static final String PRODUTOS_FILE = "produtos.txt";
    private static final String PEDIDOS_FILE = "pedidos.txt";
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        loadProdutos();
        loadPedidos();
        showMainMenu();
    }

    private static void showMainMenu() {
        int choice;
        do {
            System.out.println("# Menu principal #");
            System.out.println("[1] Produtos");
            System.out.println("[2] Pedidos");
            System.out.println("[3] Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    showProdutosMenu();
                    break;
                case 2:
                    showPedidosMenu();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 3);
    }

    private static void showProdutosMenu() {
        int choice;
        do {
            System.out.println("# Produtos #");
            System.out.println("[1] Incluir produto");
            System.out.println("[2] Editar quantidade estoque produto");
            System.out.println("[3] Editar preço unitário produto");
            System.out.println("[4] Excluir produto");
            System.out.println("[5] Listagem produtos");
            System.out.println("[6] Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    incluirProduto();
                    break;
                case 2:
                    editarQuantidadeEstoqueProduto();
                    break;
                case 3:
                    editarPrecoUnitarioProduto();
                    break;
                case 4:
                    excluirProduto();
                    break;
                case 5:
                    listarProdutos();
                    break;
                case 6:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 6);
    }

    private static void showPedidosMenu() {
        int choice;
        do {
            System.out.println("# Pedidos #");
            System.out.println("[1] Novo pedido");
            System.out.println("[2] Listagem pedidos");
            System.out.println("[3] Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    novoPedido();
                    break;
                case 2:
                    listarPedidos();
                    break;
                case 3:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (choice != 3);
    }

    private static void loadProdutos() {
        List<String> lines = FileManager.readFromFile(PRODUTOS_FILE);
        for (String line : lines) {
            String[] parts = line.split(";");
            int codigoProduto = Integer.parseInt(parts[0]);
            String nomeProduto = parts[1];
            double precoUnitario = Double.parseDouble(parts[2]);
            int quantidadeEstoque = Integer.parseInt(parts[3]);
            produtos.add(new Produto(codigoProduto, nomeProduto, precoUnitario, quantidadeEstoque));
        }
    }

    private static void saveProdutos() {
        List<String> lines = new ArrayList<>();
        for (Produto produto : produtos) {
            lines.add(produto.toString());
        }
        FileManager.writeToFile(PRODUTOS_FILE, lines);
    }

    private static void loadPedidos() {
        List<String> lines = FileManager.readFromFile(PEDIDOS_FILE);
        for (String line : lines) {
            String[] parts = line.split(";");
            int numeroPedido = Integer.parseInt(parts[0]);
            int codigoProduto = Integer.parseInt(parts[1]);
            double precoUnitario = Double.parseDouble(parts[2]);
            int quantidade = Integer.parseInt(parts[3]);
            pedidos.add(new Pedido(numeroPedido, codigoProduto, precoUnitario, quantidade));
        }
    }

    private static void savePedidos() {
        List<String> lines = new ArrayList<>();
        for (Pedido pedido : pedidos) {
            lines.add(pedido.toString());
        }
        FileManager.writeToFile(PEDIDOS_FILE, lines);
    }

    private static void incluirProduto() {
        int codigoProduto = produtos.size() + 1;
        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Preço unitário: ");
        double precoUnitario = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();
        scanner.nextLine();

        Produto produto = new Produto(codigoProduto, nomeProduto, precoUnitario, quantidadeEstoque);
        produtos.add(produto);
        saveProdutos();
        System.out.println("Produto incluído com sucesso!");
    }

    private static void editarQuantidadeEstoqueProduto() {
        System.out.print("Código do produto: ");
        int codigoProduto = scanner.nextInt();
        scanner.nextLine();
        Produto produto = findProdutoByCodigo(codigoProduto);
        if (produto != null) {
            System.out.print("Nova quantidade em estoque: ");
            int novaQuantidade = scanner.nextInt();
            scanner.nextLine();
            produto.setQuantidadeEstoque(novaQuantidade);
            saveProdutos();
            System.out.println("Quantidade atualizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void editarPrecoUnitarioProduto() {
        System.out.print("Código do produto: ");
        int codigoProduto = scanner.nextInt();
        scanner.nextLine();
        Produto produto = findProdutoByCodigo(codigoProduto);
        if (produto != null) {
            System.out.print("Novo preço unitário: ");
            double novoPreco = scanner.nextDouble();
            scanner.nextLine();
            produto.setPrecoUnitario(novoPreco);
            saveProdutos();
            System.out.println("Preço unitário atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void excluirProduto() {
        System.out.print("Código do produto: ");
        int codigoProduto = scanner.nextInt();
        scanner.nextLine();
        Produto produto = findProdutoByCodigo(codigoProduto);
        if (produto != null) {
            produtos.remove(produto);
            saveProdutos();
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    private static void listarProdutos() {
        System.out.println("Código  Nome                                         Preço unitário  Quantidade estoque");
        System.out.println("---------------------------------------------------------------------------------------");
        double valorTotalEstoque = 0;
        for (Produto produto : produtos) {
            System.out.printf("%-7d %-45s %-16.2f %-18d%n", produto.getCodigoProduto(), produto.getNomeProduto(), produto.getPrecoUnitario(), produto.getQuantidadeEstoque());
            valorTotalEstoque += produto.getPrecoUnitario() * produto.getQuantidadeEstoque();
        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("Valor total estoque: %.2f%n", valorTotalEstoque);
    }

    private static Produto findProdutoByCodigo(int codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto() == codigoProduto) {
                return produto;
            }
        }
        return null;
    }

    private static void novoPedido() {
        int numeroPedido = pedidos.size() + 1;
        List<Pedido> novoPedido = new ArrayList<>();
        String continuar;
        do {
            System.out.print("Código do produto: ");
            int codigoProduto = scanner.nextInt();
            scanner.nextLine();
            Produto produto = findProdutoByCodigo(codigoProduto);
            if (produto != null) {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();
                if (produto.getQuantidadeEstoque() >= quantidade) {
                    Pedido pedido = new Pedido(numeroPedido, codigoProduto, produto.getPrecoUnitario(), quantidade);
                    novoPedido.add(pedido);
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
                } else {
                    System.out.println("Quantidade em estoque insuficiente!");
                }
            } else {
                System.out.println("Produto não encontrado!");
            }
            System.out.print("Deseja adicionar mais um produto ao pedido? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        pedidos.addAll(novoPedido);
        savePedidos();
        saveProdutos();
        System.out.println("Pedido realizado com sucesso!");
    }

    private static void listarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.printf("Pedido número: %d%n", pedido.getNumeroPedido());
            System.out.println("Produto                                         Preço unitário   Quantidade   Subtotal");
            System.out.println("--------------------------------------------------------------------------------------");
            double valorTotalPedido = 0;
            for (Pedido p : pedidos) {
                if (p.getNumeroPedido() == pedido.getNumeroPedido()) {
                    Produto produto = findProdutoByCodigo(p.getCodigoProduto());
                    if (produto != null) {
                        double subtotal = p.getPrecoUnitario() * p.getQuantidade();
                        System.out.printf("%-45s %-16.2f %-12d %.2f%n", produto.getNomeProduto(), p.getPrecoUnitario(), p.getQuantidade(), subtotal);
                        valorTotalPedido += subtotal;
                    }
                }
            }
            System.out.println("--------------------------------------------------------------------------------------");
            System.out.printf("Valor total pedido: %.2f%n", valorTotalPedido);
        }
    }
}
