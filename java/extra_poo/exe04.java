package extra_poo;

class Jogador {
    String nome;
    int pontuacao;
    int nivel;

    public Jogador(String nome, int pontuacao, int nivel){
        this.setNome(nome);
        this.setPontuacao(pontuacao);
        this.setNivel(nivel);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void status(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Pontuação: " + this.getPontuacao());
        System.out.println("Nivel: " + this.getNivel());
    }

    public void aumentarPontuacao(int pontuacaoAdicionada){

        


    }


}
