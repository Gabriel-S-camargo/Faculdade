/* Classe que representa um contato com nome e telefone */
class Contatos {
    private String nome;
    private String telefone;
    private String email;
 
    /* Construtor da classe Contato */
    public Contatos(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }
 
    /* Métodos para obter os atributos do contato */
    public String getNome() {
        return nome;
    }
 
    public String getTelefone() {
        return telefone;
    }
 
    /* Métodos para definir os atributos do contato */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    /* Sobrescreve o método toString para retornar uma representacao em string do contato */
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone + ", Email: " + email;
    }
}