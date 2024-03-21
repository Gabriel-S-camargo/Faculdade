package extra_poo;

class livro {
    String nome;
    String autor;
    int anoPublicacao;

    public void mostraLivro(){
        System.out.println("Título: " + this.nome);
        System.out.println("Autor " + this.autor);
        System.out.println("Ano de Publicacao: " + this.anoPublicacao);
    }


}

class extraPoo_exe01{
    public static void main(String[] args){
    
        livro l1 = new livro();
    
        l1.nome = "Guia prático para construcao de software";
        l1.autor = "Steve McConnell";
        l1.anoPublicacao = 2005;

        l1.mostraLivro();
    
    
    
    
    }


}
