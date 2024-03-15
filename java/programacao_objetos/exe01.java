package programacao_objetos;

    class Pessoa {
        String nome;
        int idade;
        boolean falando = false;
        boolean comendo = false;

        public void status(){
            System.out.println("Nome: " + this.nome);
            System.out.println("idade: " + this.idade);
            System.out.println("comendo: " + this.comendo);
            System.out.println("falando: " + this.falando);
        }



    }

    class objeto_exemplo {
        public static void main(String[] args){

            Pessoa p1 = new Pessoa();
            p1.nome = "Gabriel";
            p1.idade = 55;

            Pessoa p2 = new Pessoa();
            p2.nome = "Pedro";
            p2.idade = 24;

            p1.status();
            


        }
}
