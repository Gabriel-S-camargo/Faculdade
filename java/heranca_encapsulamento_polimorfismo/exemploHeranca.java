package heranca_encapsulamento_polimorfismo;

class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }

    public void exibirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}

class Cachorro extends Animal{

    String raca;

    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    //Override
    public void emitirSom() {
        System.out.println("Au Au Au");
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Raca: " + getRaca());
    }
}

class ExemploHeranca {
    public static void main(String[] args) {
        Animal gato = new Animal("Bu" , 9);
        gato.emitirSom();
        gato.exibirInfo();

        Cachorro cachorro = new Cachorro("Cacau", 5, "Pinscher");
        cachorro.emitirSom();
        cachorro.exibirInfo();
        
    }
}


