package heranca;

class itemBiblioteca {
    public String titulo;
    public int anoPublicacao;

    public itemBiblioteca(String titulo, int anoPublicacao) {
        setTitulo(titulo);
        setAnoPublicacao(anoPublicacao);
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

    public void mostrarInfo() {
        System.out.println("\nTitulo: " + getTitulo());
        System.out.println("Ano de Publicacao: " + getAnoPublicacao());

    }

}

class Dvd extends itemBiblioteca {
    public int tempoDeDuracao;
    public String categoria;

    public Dvd(String titulo, int anoPublicacao, int tempoDeDuracao, String categoria) {
        super(titulo, anoPublicacao);
        setTempoDeDuracao(tempoDeDuracao);
        setCategoria(categoria);

    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTempoDeDuracao() {
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao) {
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tempo de duração: " + getTempoDeDuracao());
        System.out.println("Categoria: " + getCategoria());
    }

}

class Livro extends itemBiblioteca {

    public String autor;
    public int numeroDePaginas;

    public Livro(String titulo, int anoPublicacao, String autor, int numeroDePaginas) {
        super(titulo, anoPublicacao);
        setNumeroDePaginas(numeroDePaginas);
        setAutor(autor);

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Autor: " + getAutor());
        System.out.println("Numero de Páginas: " + getNumeroDePaginas());
    }
}

class exercicioAplicacao {
    public static void main(String[] args) {

        Dvd dvd01 = new Dvd("O Poderoso Chefão", 1972, 175, "Policia, Drama");

        Livro livro01 = new Livro("O Hobbit", 1937, "J. R. R. Tolkein", 336);

        dvd01.mostrarInfo();

        livro01.mostrarInfo();



    }
}
