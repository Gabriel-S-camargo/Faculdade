package associacao_entre_classes;

import java.util.Scanner;

class Cliente{

    public String nome;
    public String email;
    public String endereco;

    Cliente(String nome, String email, String endereco){

        this.nome = nome;
        this.email = email;
        this.endereco = endereco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}



class exeAssociacaoEntreClasses {
        
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        




        input.close();

    }

}
