package agregacao_entre_classes;

class Autor{

    public String nomeAutor;

    public Autor(String nomeAutor){

        this.nomeAutor = nomeAutor;

    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }


}



class Livro {
    public String nomeLivro;
    public int anoPublicacao;
    public Autor autor;

    public Livro(String nomeLivro, int anoPublicacao, Autor autor){

        this.nomeLivro = nomeLivro;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;

    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

}

class Bibioteca{

    public String nomeBiblioteca;
    public Livro[] livros;
    public int numLivros = 0;

    public Bibioteca(String nomeBiblioteca){

        this.nomeBiblioteca = nomeBiblioteca;
        this.livros = new Livro[10];

    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public void adicionarLivro(Livro livro){
        this.livros[numLivros] = livro;
        numLivros++;
    }

    public void mostraInfo(){
        System.out.println("Livros na Biblioteca: ");

        for(int i = 0; i < numLivros; i++){
            System.out.println("\nLivro[" + (1 + i)+ "]");
            System.out.println("Titulo: " + livros[i].getNomeLivro());
            System.out.println("Ano publicacao: " + livros[i].getAnoPublicacao());
            System.out.println("Autor: " + livros[i].autor.getNomeAutor());

        }
    }



}

class atividade2 {
    public static void main(String [] args){

        Autor autor01 = new Autor("George Oliver");

        Livro livro01 = new Livro("1984", 1965, autor01);

        Livro livro02 = new Livro("Animal Farm", 1978, autor01);

        Bibioteca biblioteca01 = new Bibioteca("Real Gabinete Portugues de Leitura");

        biblioteca01.adicionarLivro(livro01);

        biblioteca01.adicionarLivro(livro02);

        biblioteca01.mostraInfo();



    }
}
