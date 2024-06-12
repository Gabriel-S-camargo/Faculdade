import java.io.*; /* Pacote responsável por lidar com entrada e saída de dados. */
import java.util.ArrayList;
import java.util.Scanner;
 
/* Classe principal do programa */
public class Agenda {
    private static final String ARQUIVO = "contatos.txt"; /* Nome do arquivo de texto */
 
    private static ArrayList<Contatos> contatos = new ArrayList<>(); /* Lista para armazenar os contatos */
 
    /* Método principal do programa */
    public static void main(String[] args) {
        
        /* Carrega os contatos do arquivo */
        carregarContatos(); 
 
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        /* Loop para exibir o menu e receber opcoes do usuario */
        while(true){
            System.out.println("Escolha uma opcao:");
            System.out.println("1. Incluir contato");
            System.out.println("2. Alterar telefone");
            System.out.println("3. Excluir contato");
            System.out.println("4. Listar contatos");
            System.out.println("5. Alterar email");
            System.out.println("6. Sair");
            opcao = scanner.nextInt(); /* Le a opcao do usuario */
            
            scanner.nextLine(); /* Limpa a quebra de linha após receber um número inteiro */
 
            switch (opcao) {
                case 1:
                    incluirContato(scanner); /* Chama o método para incluir um contato */
                    break;
                case 2:
                    alterarTelefone(scanner); /* Chama o método para alterar o telefone de um contato */
                    break;
                case 3:
                    excluirContato(scanner); /* Chama o método para excluir um contato */
                    break;
                case 4:
                    listarContatos(); /* Chama o método para listar os contatos */
                    break;
                case 5:
                    alterarEmail(scanner); /*Metodo de alterar email*/
                    break;
                case 6:
                    salvarContatos(); /* Chama o método para salvar os contatos no arquivo */
                    System.exit(0); /* Encerra o programa */
            }
        }
    }
 
    /* Método para carregar os contatos do arquivo */
    private static void carregarContatos() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = reader.readLine()) != null) { /* Le cada linha do arquivo */
                String[] line = linha.split(";"); /* Divide a linha nos atributos do contato */
                String nome = line[0];
                String telefone = line[1];
                String email = line[2];
                Contatos contato = new Contatos(nome, telefone, email); /* Cria um objeto Contato */
                contatos.add(contato); /* Adiciona o contato à lista */
            }
        } catch (IOException e) { /* Trata erros de leitura do arquivo */
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }
 
    /* Método para salvar os contatos no arquivo */
    private static void salvarContatos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Contatos contato : contatos) { /* Para cada contato na lista */
                writer.write(contato.getNome() + ";" + contato.getTelefone() + ";" + contato.getEmail()); /* Escreve no arquivo */
                writer.newLine(); /* Adiciona uma quebra de linha */
            }
        } catch (IOException e) { /* Trata erros de escrita no arquivo */
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
 
    /* Método para incluir um novo contato */
    private static void incluirContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o email do contato: ");
        String email = scanner.nextLine();
        Contatos contato = new Contatos(nome, telefone, email); /* Cria um novo objeto Contato */
        contatos.add(contato); /* Adiciona o contato à lista */
        System.out.println("Contato incluido com sucesso!");
    }
 
    /* Método para alterar o telefone de um contato */
    private static void alterarTelefone(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        for (Contatos contato : contatos) { /* Para cada contato na lista */
            if (contato.getNome().equalsIgnoreCase(nome)) { /* Se o nome do contato for encontrado */
                System.out.print("Digite o novo telefone: ");
                String novoTelefone = scanner.nextLine();
                contato.setTelefone(novoTelefone);
                System.out.println("Telefone alterado com sucesso!");
                return;
            }
        }
        System.out.println("Contato nao encontrado!");
    }

        /* Método para alterar o telefone de um contato */
        private static void alterarEmail(Scanner scanner) {
            System.out.print("Digite o nome do contato: ");
            String nome = scanner.nextLine();
            for (Contatos contato : contatos) { /* Para cada contato na lista */
                if (contato.getNome().equalsIgnoreCase(nome)) { /* Se o nome do contato for encontrado */
                    System.out.print("Digite o novo email: ");
                    String novoEmail = scanner.nextLine();
                    contato.setEmail(novoEmail);
                    System.out.println("Email alterado com sucesso!");
                    return;
                }
            }
            System.out.println("Contato nao encontrado!");
        }
 
    /* Método para excluir um contato */
    private static void excluirContato(Scanner scanner) {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        for (Contatos contato : contatos) { /* Para cada contato na lista */
            if (contato.getNome().equalsIgnoreCase(nome)) { /* Se o nome do contato for encontrado */
                contatos.remove(contato); /* Remove o contato da lista */
                System.out.println("Contato excluido com sucesso!");
                return;
            }
        }
        System.out.println("Contato nao encontrado!");
    }
 
    /* Método para listar todos os contatos */
    private static void listarContatos() {
        if (contatos.isEmpty()) { /* Se nao houver contatos na lista */
            System.out.println("Nenhum contato cadastrado.");
        } else {
            System.out.println("Lista de contatos:");
            for (Contatos contato : contatos) { /* Para cada contato na lista */
                System.out.println(contato); /* Exibe os dados do contato */
            }
        }
    }
}