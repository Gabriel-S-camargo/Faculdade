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

        public void falar(){
            if(this.falando == true){
                System.out.println(this.nome + " ja Esta falando");

            }else{
                this.falando = true;
                System.out.println(this.nome + " Esta falando");
                
            }
        }

        public void parar_de_falar(){
                this.falando = false;
                System.out.println(this.nome + " Parou de Falar");
        }

    }

    class objeto_exemplo {
        public static void main(String[] args){

            Pessoa p1 = new Pessoa();
            p1.nome = "Gabriel";
            p1.idade = 19;
            p1.falando = true;

            Pessoa p2 = new Pessoa();
            p2.nome = "Pedro";
            p2.idade = 24;

            p1.falar();
            p1.falar();
            


        }
}
