package arrays;

import java.util.Scanner;

class Contato {

    public String nome;

    public String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}

class exemploArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Contato[] contato = new Contato[5];

        int numContatos = 0;

        boolean exit = false;

        do {
            System.out.println("\n[1] Adicionar Contato");
            System.out.println("[2] Buscar Contato");
            System.out.println("[3] Editar Contato");
            System.out.println("[4] Listar Contato");
            System.out.println("[5] sair");
            int opcao = input.nextInt();

            switch (opcao) {

                // Opção de Adicionar Contato

                case 1:

                    if (numContatos == contato.length) {

                        System.out.println("ERRO! Numero Máximo de contatos cadastrados");
                    } else {

                        input.nextLine();

                        System.out.println("\nDigite o nome do Contato: ");
                        String nomeContato = input.nextLine();

                        System.out.println("Digite o telefone do Contato: ");
                        String numContato = input.nextLine();

                        if (numContatos < contato.length && nomeContato != null && numContato != null) {
                            contato[numContatos] = new Contato(nomeContato, numContato);

                            numContatos++;

                            System.out.println("Contato Adicionado Com sucesso!");

                        } else {
                            System.out.println(
                                    "Erro ao adicionar o contato. Certifique-se de que o nome e o telefone não estão vazios.");
                        }

                    }

                    break;
                // Opção de busca Contato

                case 2:

                    System.out.println("[1] Pesquisar por nome");
                    System.out.println("[2] Pesquisar por numero");

                    int opcaoBusca = input.nextInt();
                    input.nextLine();

                    Contato[] contatosEncontrados = new Contato[5];

                    int j = 0;
                    switch (opcaoBusca) {
                        case 1:
                            // Busca pelo Nome do contato
                            System.out.println("Digite o nome a ser buscado: ");
                            String nomeBusca = input.nextLine();

                            if (nomeBusca != null) {
                                for (int i = 0; i < numContatos; i++) {

                                    if (contato[i].getNome().equalsIgnoreCase(nomeBusca)) {

                                        contatosEncontrados[j] = new Contato(contato[i].getNome(),
                                                contato[i].getTelefone());
                                        j++;
                                    }
                                }

                                if (j > 0) {
                                    System.out.println("Resultados Encontrados: ");

                                    for (int k = 0; k < j; k++) {
                                        System.out.println(
                                                "Contato[" + (k + 1) + "]" + "\nNome: "
                                                        + contatosEncontrados[k].getNome()
                                                        + "\nTelefone: " + contatosEncontrados[k].getTelefone());
                                    }
                                } else {
                                    System.out.println("Nenhum contato encontrado.");
                                }

                                break;
                            } else {
                                break;
                            }

                        case 2:

                            // Busca pelo telefone do Contato

                            System.out.println("Digite o telefone a ser buscado: ");
                            String telefoneBusca = input.nextLine();

                            if (telefoneBusca != null) {
                                for (int i = 0; i < numContatos; i++) {

                                    if (contato[i].getTelefone().equals(telefoneBusca)) {

                                        contatosEncontrados[j] = new Contato(contato[i].getNome(),
                                                contato[i].getTelefone());
                                        j++;

                                    }
                                }

                                if (j > 0) {
                                    System.out.println("Resultados Encontrados: ");

                                    for (int k = 0; k < j; k++) {
                                        System.out.println(
                                                "Contato[" + (k + 1) + "]" + "\nNome: "
                                                        + contatosEncontrados[k].getNome() + "\nTelefone: "
                                                        + contatosEncontrados[k].getTelefone());
                                    }
                                } else {
                                    System.out.println("Nenhum contato encontrado.");
                                }

                                break;
                            } else {
                                break;
                            }

                        default:
                            System.out.println("ERRO! Opcao inválida");
                            break;
                    }

                    break;
                // Opção Editar Contato
                case 3:

                    System.out.println("[1] Pesquisar por nome");
                    System.out.println("[2] Pesquisar por numero");

                    int escolhaBusca = input.nextInt();
                    input.nextLine();

                    int l = 0;
                    switch (escolhaBusca) {
                        case 1:
                            // Busca pelo Nome do contato
                            System.out.println("Digite o nome a ser buscado: ");
                            String nomeBusca = input.nextLine();

                            if (nomeBusca != null) {
                                for (int i = 0; i < numContatos; i++) {

                                    if (contato[i].getNome().equalsIgnoreCase(nomeBusca)) {

                                        System.out.println("\nContato Localizado!");
                                        System.out.println("\n[1] Editar Nome\n[2] Editar telefone\n[3] Ambos");
                                        int opcaoEdicao = input.nextInt();

                                        input.nextLine();

                                        switch (opcaoEdicao) {
                                            case 1:
                                                System.out.println("\nDigite o nome desejado: ");
                                                String novoNome = input.nextLine();

                                                contato[i].setNome(novoNome);

                                                System.out.println("\nContato Atualizado!");

                                                break;

                                            case 2:

                                                System.out.println("\nDigite no numero do novo Telefone");
                                                String novoTelefone = input.nextLine();

                                                contato[i].setTelefone(novoTelefone);

                                                System.out.println("\nContato Atualizado!");

                                                break;

                                            case 3:

                                                System.out.println("\nDigite o nome desejado: ");
                                                String novoNomeAmbos = input.nextLine();

                                                System.out.println("\nDigite no numero do novo Telefone");
                                                String novoTelefoneAmbos = input.nextLine();

                                                contato[i].setNome(novoNomeAmbos);

                                                contato[i].setTelefone(novoTelefoneAmbos);

                                                System.out.println("\nContato Atualizado!");


                                                break;

                                            default:

                                                System.out.println("\nOpção inválida");

                                                break;
                                        }

                                        l++;
                                    }
                                }
                                
                                if( l == 0){
                                    System.out.println("Nenhum resultado encontrado");

                                }
                                break;
                                
                            } else{
                                break;
                            }

                        case 2:

                            // Busca pelo telefone do Contato

                            System.out.println("Digite o telefone a ser buscado: ");
                            String telefoneBusca = input.nextLine();

                            if (telefoneBusca != null) {
                                for (int i = 0; i < numContatos; i++) {

                                    if (contato[i].getTelefone().equals(telefoneBusca)) {

                                        System.out.println("\nContato Localizado!");
                                        System.out.println("\n[1] Editar Nome\n[2] Editar telefone\n[3] Ambos");
                                        int opcaoEdicao = input.nextInt();

                                        input.nextLine();

                                        switch (opcaoEdicao) {
                                            case 1:
                                                System.out.println("\nDigite o nome desejado: ");
                                                String novoNome = input.nextLine();

                                                contato[i].setNome(novoNome);

                                                System.out.println("\nContato Atualizado!");

                                                break;

                                            case 2:

                                                System.out.println("\nDigite no numero do novo Telefone");
                                                String novoTelefone = input.nextLine();

                                                contato[i].setTelefone(novoTelefone);

                                                System.out.println("\nContato Atualizado!");

                                                break;

                                            case 3:

                                                System.out.println("\nDigite o nome desejado: ");
                                                String novoNomeAmbos = input.nextLine();

                                                System.out.println("\nDigite no numero do novo Telefone");
                                                String novoTelefoneAmbos = input.nextLine();

                                                contato[i].setNome(novoNomeAmbos);

                                                contato[i].setTelefone(novoTelefoneAmbos);

                                                System.out.println("\nContato Atualizado!");


                                                break;

                                            default:

                                                System.out.println("\nOpção inválida");

                                                break;
                                        }

                                        l++;
                                    }
                                }
                                
                                if( l == 0){
                                    System.out.println("Nenhum resultado encontrado");

                                }
                                break;
                                
                            } else{
                                break;
                            }

                    }

                    break;

// opção Listar Contatos

                case 4:

                    System.out.println("Lista de contatos na agenda");

                    for (int i = 0; i < numContatos; i++) {

                        System.out.println("\nContato[" + i + 1 + "]\nNome: " + contato[i].getNome() + "\nTelefone: "
                                + contato[i].getTelefone());

                    }

                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Digite um valor valido para o menu!");
                    break;
            }

        } while (exit != true);

        input.close();

    }
}
