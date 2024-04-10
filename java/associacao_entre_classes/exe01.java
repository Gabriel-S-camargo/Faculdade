package associacao_entre_classes;

class Autor{
    public String nomeAutor;
    public String nacionalidade;

    public Autor(String nomeAutor, String nacionalidade){
        this.nomeAutor = nomeAutor;
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

}

class Livro{

    public String titulo;
    public int anoPublicacao;
    public Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void imprimirDetalhes(){
        System.out.println("\nTitulo do livro: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + autor.getNomeAutor());
        System.out.println("Nacionalidade: " + autor.getNacionalidade());
    }


}




class exe01_assoiacao_entre_classes {
    public static void main(String[] args){
        
        // Autores

        Autor autor01 = new Autor("Machado de Asis", "Brasileiro");

        Autor autor02 = new Autor("Graciliano Ramos", "Brasileiro");

        // Livros

        Livro livro01 = new Livro("Memórias Póstumas de Brás Cubas", 1880, autor01);

        Livro livro02 = new Livro("Vidas Secas", 1937, autor02);

        // Exibindo os detalhes

        livro01.imprimirDetalhes();

        livro02.imprimirDetalhes();



    }
}
