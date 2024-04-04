package arrays;

import java.util.Scanner;

class Contato {
    
    public String nome;

    public String telefone;

    public Contato(String nome, String telefone){
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


class exemploArrays{

    public static void main(String[]args) {
        
        Scanner input = new Scanner(System.in);

        Contato[] contato = new Contato[5];

        int numContatos = 0;

        boolean exit = false;

        do{
            System.out.println("[1] Adicionar Contato");
            System.out.println("[2] Buscar Contato");
            System.out.println("[3] Editar Contato");
            System.out.println("[4] Listar Contato");
            System.out.println("[5] sair");
            int opcao = input.nextInt();

            switch (opcao) {
                
                case 1:
                    
                    if(numContatos == contato.length){
                    
                        System.out.println("ERRO! Numero Máximo de contatos cadastrados");
                    }
                    else{

                        System.out.println("\nDigite o numero do Contato: ");
                        String numContato = input.nextLine();

                        input.nextLine();
    
                        System.out.println("Digite o nome do Contato: ");
                        String nomeContato = input.nextLine();
    
                        contato[numContatos] = new Contato(nomeContato, numContato);
    
                        System.out.println("Contato Adicionado Com sucesso!");
                    }

                    break;
                
                case 2:

                    System.out.println("[1] Pesquisar por nome");
                    System.out.println("[2] Pesquisar por numero");
                    int opcaoBusca = input.nextInt();
                    
                    switch (opcaoBusca) {
                        case 1:
                                
                                System.out.println("Digite o nome a ser buscado: ");
                                String nomeBusca = input.nextLine();

                                boolean encontrado = false;

                                for(int i = 0; i < numContatos; i++){
                                    if(contato[i].getNome().equalsIgnoreCase(nomeBusca)){


                                        String nomeEncontrado = contato[i].getNome();

                                        String numeroEncontrado = contato[i].getTelefone();

                                        Contato[] contatosEncontrados = new Contato[5];

                                        

                                        System.out.println("telefone de " + nomeBusca + ":" + contato[i].getTelefone());
                                        encontrado = true;
                                    }
                                }


                            break;

                        case 2:
                            
                            break;
                    
                        default:

                                System.out.println("ERRO! Opcao inválida");

                            break;
                    }


                    break;

                case 3:
                    

                    break;

                case 4:

                    break;
                
                case 5:
                    exit = true;
                    break;

                default: System.out.println("Digite um valor valido para o menu!");
                    break;
            }

        }while(exit != true);


        input.close();

    }
}
