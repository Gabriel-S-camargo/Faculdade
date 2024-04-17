package agregacao_entre_classes;

class Time{

    public String nomeTime;

    public Jogador[] jogadoresTime;

    public int numJogadoresTime;

    public Time(String nomeTime){

        this.nomeTime = nomeTime;

        this.jogadoresTime = new Jogador[11];

    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void adicionarJogador(Jogador jogador){
        jogadoresTime[numJogadoresTime] = jogador;
        numJogadoresTime++;

    }

    public void mostrarInfo(){
        System.out.println("\nTIME: " + this.nomeTime);

        for(int i = 0; i < numJogadoresTime; i++){
            System.out.println("Jogador: " + jogadoresTime[i].getNomeJogador() + "("+ jogadoresTime[i].getPosicao() + ")");
        }
    }




}




class Jogador{
    public String nomeJogador;
    public String posicao;
    public int numJogadores;

    public Jogador(String nomeJogador, String posicao){

        this.nomeJogador = nomeJogador;
        this.posicao = posicao;

    }

    // Getters e Setters

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}



class atividade1 {
    public static void main(String[] args){

        // Inicializando Jogadores

        Jogador jogador01 = new Jogador("Neymar", "Meia-Atacante");
        Jogador jogador02 = new Jogador("Messi", "Meio-Campo");
        Jogador jogador03 = new Jogador("Paulo Henrique Ganso", "Meia-Atacante");

        Time time01 = new Time("Barcelona");
        Time time02 = new Time("Santos");


        // Elenco time 01 (Barcelona)
        time01.adicionarJogador(jogador01);

        time01.adicionarJogador(jogador02);

        // Elenco time 02 (Santos)

        time02.adicionarJogador(jogador01);

        time02.adicionarJogador(jogador03);

        // Mostrando as infos

        time01.mostrarInfo();

        time02.mostrarInfo();



    }    
}
