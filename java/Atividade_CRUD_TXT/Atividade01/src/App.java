import java.io.*; /* Pacote responsável por lidar com entrada e saída de dados. */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    // Sistema Gerenciamento de Produtos e Pedidos

    // Arquivo TXT dos produtos PATH
    private static final String ARQUIVOProdutos = "C:\\Users\\gabri\\Documents\\Programacao\\Faculdade\\java\\Atividade_CRUD_TXT\\Atividade01\\produtosATV.txt";
    // Arquivo TXT dos pedidos PATH
    private static final String ARQUIVOPedidos = "C:\\Users\\gabri\\Documents\\Programacao\\Faculdade\\java\\Atividade_CRUD_TXT\\Atividade01\\pedidosATV.txt";

    private static ArrayList<Produtos> produtos = new ArrayList<>(); /* Lista para armazenar os produtos */

    private static ArrayList<Pedidos> pedidos = new ArrayList<>(); /* Lista para armazenar os pedidos */

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        carregarProdutos();
        carregarPedidos();

        while (true) {
            System.out.println("# Menu principal #");
            System.out.println("[1] Produtos");
            System.out.println("[2] Pedidos");
            System.out.println("[3] Sair");
            System.out.printf("Selecione uma das opcoes : ");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    menuProdutos(input);
                    break;
                case 2:
                    menuPedidos(input);
                    break;
                case 3:
                    System.out.println("\nSistema Encerrando...");
                    salvarProduto();
                    salvarPedidos();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }
    }

    // Menu Dos Produtos
    public static void menuProdutos(Scanner input) {
        while (true) {
            System.out.println("\n* Produtos *");
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
                    incluirProduto();
                    break;
                case 2:
                    System.out.println("[2] Editar quantidade estoque produto");
                    editarQuantidadeEstoqueProduto();
                    break;
                case 3:
                    System.out.println("[3] Editar preco unitario produto");
                    editarPrecoUnitarioProduto();
                    break;
                case 4:
                    System.out.println("[4] Excluir produto");
                    excluirProduto();
                    break;
                case 5:
                    System.out.println("[5] Listagem produtos");
                    listarProdutos();
                    break;
                case 6:
                    System.out.println("\n");
                    salvarProduto();
                    return;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }
    }

    // Menu Dos Pedidos
    public static void menuPedidos(Scanner input) {
        while (true) {
            System.out.println("\n* Pedidos *");
            System.out.println("[1] Novo pedido");
            System.out.println("[2] Listagem pedidos");
            System.out.println("[3] Voltar ao menu principal");
            System.out.printf("Selecione uma das opcoes : ");
            int opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("[1] Novo pedido");
                    novoPedido();
                    break;
                case 2:
                    System.out.println("[2] Listagem pedidos");
                    listarPedidos();
                    break;
                case 3:
                    System.out.println("\n");
                    return;
                default:
                    System.out.println("Digite uma opção válida");
                    break;
            }
        }
    }

    // Metodos de carregamento do sistema

    // Metodo para Carregar os Produtos no Inicio do sistema

    private static void carregarProdutos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVOProdutos))) {
            String linha;
            while ((linha = reader.readLine()) != null) { /* Le cada linha do arquivo */
                String[] line = linha.split(";"); /* Divide a linha nos atributos do contato */
                int codigoProduto = Integer.parseInt(line[0]);
                String nomeProduto = line[1];
                double precoUnitario = Float.parseFloat(line[2]);
                int quantidadeEstoque = Integer.parseInt(line[3]);
                Produtos produto = new Produtos(codigoProduto, nomeProduto, precoUnitario, quantidadeEstoque);
                produtos.add(produto);
            }
        } catch (IOException e) { /* Trata erros de leitura do arquivo */
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }

    /* Método para salvar os contatos no arquivo */
    private static void salvarProduto() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVOProdutos))) {
            for (Produtos produtos : produtos) { /* Para cada contato na lista */
                writer.write(produtos.getCodigoProduto() + ";" + produtos.getNomeProduto() + ";"
                        + produtos.getPrecoUnitario() + ";" + produtos.getQuantidadeEstoque());
                writer.newLine(); /* Adiciona uma quebra de linha */
            }
        } catch (IOException e) { /* Trata erros de escrita no arquivo */
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    // Metodos de carregar os Pedidos

    private static void carregarPedidos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVOPedidos))) {
            String linha;
            while ((linha = reader.readLine()) != null) { /* Le cada linha do arquivo */
                String[] line = linha.split(";"); /* Divide a linha nos atributos do contato */
                int numeroPedido = Integer.parseInt(line[0]);
                int codigoProduto = Integer.parseInt(line[1]);
                double precoUnitario = Float.parseFloat(line[2]);
                int quantidade = Integer.parseInt(line[3]);
                Pedidos pedido = new Pedidos(numeroPedido, codigoProduto, precoUnitario, quantidade);
                pedidos.add(pedido);
            }
        } catch (IOException e) { /* Trata erros de leitura do arquivo */
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }

    // Metodos de salvar o pedido

    private static void salvarPedidos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVOPedidos))) {
            for (Pedidos pedidos : pedidos) { /* Para cada contato na lista */
                writer.write(pedidos.getNumeroPedido() + ";" + pedidos.getCodigoProduto() + ";"
                        + pedidos.getPrecoUnitario() + ";" + pedidos.getQuantidade());
                writer.newLine(); /* Adiciona uma quebra de linha */
            }
        } catch (IOException e) { /* Trata erros de escrita no arquivo */
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    private static Produtos procurarProduto(int codigoProduto) {
        for (Produtos produto : produtos) {
            if (produto.getCodigoProduto() == codigoProduto) {
                return produto;
            }
        }
        return null;
    }

    public static void incluirProduto() {

        int codigoProduto = produtos.size() + 1;

        System.out.println("Digite o nome do Produto:");
        String nomeProduto = input.nextLine();

        System.out.println("Digite o valor unitario do Produto: ");
        double precoUnitario = input.nextDouble();

        System.out.println("Digite a quantidade de Estoque:");
        int quantidadeEstoque = input.nextInt();

        Produtos produto = new Produtos(codigoProduto, nomeProduto, precoUnitario, quantidadeEstoque);
        produtos.add(produto);

        input.nextLine();

        salvarProduto();
    }

    public static void editarQuantidadeEstoqueProduto() {
        System.out.println("Digite o codigo do produto que deseja editar");
        int opcaoEdicao = input.nextInt();

        Produtos produto = procurarProduto(opcaoEdicao);

        if (produto != null) {
            System.out.print("Digite Nova quantidade em estoque: ");
            int novaQuantidade = input.nextInt();
            input.nextLine();
            produto.setQuantidadeEstoque(novaQuantidade);
            salvarProduto();
            System.out.println("Quantidade atualizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }

    }

    public static void editarPrecoUnitarioProduto() {
        System.out.println("Digite o codigo do produto que deseja editar");
        int opcaoEdicao = input.nextInt();

        Produtos produto = procurarProduto(opcaoEdicao);

        if (produto != null) {
            System.out.print("Digite Novo preco: ");
            double novaQuantidade = input.nextDouble();
            input.nextLine(); // limpa buffer lembrar
            produto.setPrecoUnitario(novaQuantidade);
            salvarProduto();
            System.out.println("Preco atualizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }

    public static void excluirProduto() {
        System.out.println("Digite o ID do produto que voce deseja excluir: ");
        int opcaoExclusao = input.nextInt();

        Produtos produto = procurarProduto(opcaoExclusao);

        input.nextLine();

        if (produto != null) {
            System.out.println("Confirma a exclusao do produto (s/n):");
            String opcaoString = input.nextLine();

            if ("s".equalsIgnoreCase(opcaoString)) {
                produtos.remove(produto);
                salvarProduto();
                System.out.println("Produto Excluido!");
            } else if ("n".equalsIgnoreCase(opcaoString)) {
                System.out.println("Produto não Excluido!");
            } else {
                System.out.println("Digite um caracter válido");
            }
        } else {
            System.out.println("Produto não encontrado!");
        }

    }

    public static void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum Produto Regitrado!");
        } else {

            System.out.println("Código  Nome                                         Preço unitário  estoque");
            System.out
                    .println("---------------------------------------------------------------------------------------");
            double valorTotalEstoque = 0;
            for (Produtos produto : produtos) {
                System.out.printf("%-7d %-45s %-16.2f %-18d%n", produto.getCodigoProduto(), produto.getNomeProduto(),
                        produto.getPrecoUnitario(), produto.getQuantidadeEstoque());
                valorTotalEstoque += produto.getPrecoUnitario() * produto.getQuantidadeEstoque();
            }
            System.out
                    .println("---------------------------------------------------------------------------------------");
            System.out.printf("Valor total estoque: %.2f%n", valorTotalEstoque);
        }

    }

    // Metodos Pedidos

    public static Pedidos buscarPedido(int codigoPedido) {
        for (Pedidos pedidos : pedidos) {
            if (pedidos.getCodigoProduto() == codigoPedido) {
                return pedidos;
            }
        }
        return null;
    }

    // Variavel estática para poder pegar o numero do ultimo pedido, o
    // pedidos.size() estava incrementando na quantidade
    // de registros no txt, dai estava pulando numeração comforme a quantidade de
    // itens nos pedidos

    private static int ultimoNumeroPedido = 0;

    public static void novoPedido() {
        ultimoNumeroPedido++;
        int numeroPedido = ultimoNumeroPedido;
        String opcaoString;

        do {
            System.out.println("Digite o código do produto que você deseja incluir no pedido:");
            int opcaoInclusaoPedido = input.nextInt();
            input.nextLine(); // Consome a quebra de linha após o número

            Produtos produto = procurarProduto(opcaoInclusaoPedido);

            if (produto != null) {
                System.out.println("Informe a quantidade do pedido: ");
                int quantidade = input.nextInt();
                input.nextLine(); // Consome a quebra de linha após o número

                if (produto.getQuantidadeEstoque() >= quantidade) {
                    produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
                    salvarProduto();

                    System.out.println(produto.getNomeProduto() + " adicionado ao pedido com sucesso!");
                    Pedidos pedido = new Pedidos(numeroPedido, produto.getCodigoProduto(), produto.getPrecoUnitario(),
                            quantidade);
                    pedidos.add(pedido);
                } else {
                    System.out.println("Quantidade em estoque do " + produto.getNomeProduto()
                            + " insuficiente para a quantidade informada");
                }
            } else {
                System.out.println("Produto não encontrado!");
            }

            System.out.println("Deseja adicionar mais produtos ao pedido? (s/n): ");
            opcaoString = input.nextLine();

        } while (!opcaoString.equalsIgnoreCase("n"));

        salvarPedidos();
    }

    public static void listarPedidos() {

        if (pedidos.isEmpty()) {
            System.out.printf("\nLista de pedidos está vazia");
        } else {
            // Lista que recebe os produtos ja processados, unico jeito que pensei :(
            List<Integer> pedidosProcessados = new ArrayList<>();

            for (Pedidos pedido : pedidos) {

                // teste se ja tem um codigo registrado na lista, isso faz com que não ocorra
                // duplicados, se tiver ele pula

                if (pedidosProcessados.contains(pedido.getNumeroPedido())) {

                    continue;
                }

                double valorTotalPedido = 0;
                System.out.printf("Pedido número: %d%n", pedido.getNumeroPedido());
                System.out.println(
                        "Produto                                         Preço unitário   Quantidade   Subtotal");
                System.out.println(
                        "--------------------------------------------------------------------------------------");

                for (Pedidos produtoPedido : pedidos) {
                    if (produtoPedido.getNumeroPedido() == pedido.getNumeroPedido()) {
                        Produtos produto = procurarProduto(produtoPedido.getCodigoProduto());

                        if (produto != null) {
                            double subtotal = produtoPedido.getPrecoUnitario() * produtoPedido.getQuantidade();
                            System.out.printf("%-45s %15.2f %10d %15.2f%n",
                                    produto.getNomeProduto(),
                                    produtoPedido.getPrecoUnitario(),
                                    produtoPedido.getQuantidade(),
                                    subtotal);

                            valorTotalPedido += subtotal;
                        }
                    }
                }

                System.out.printf("Valor total do Pedido: R$%.2f%n", valorTotalPedido);
                System.out.println();

                pedidosProcessados.add(pedido.getNumeroPedido()); // Marca esse número de pedido como processado
            }
        }
    }

}
