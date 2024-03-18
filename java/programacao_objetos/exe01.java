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
            if(this.comendo == true){
                System.out.println(this.nome + " esta comendo nao pode falar ");

            }
            else if(this.falando == true){
                System.out.println(this.nome + " ja Esta falando");

            }else{
                this.falando = true;
                System.out.println(this.nome + " Esta falando");
                
            }
        }

        public void parar_de_falar(){
            if(this.falando == false){
                System.out.println(this.nome + " não Esta falando");

            }else{
                this.falando = false;
                System.out.println(this.nome + " Parou de Falar");
                     
            }

        }
        
        public void comer(String alimento){
            if(this.falando == true){
                System.out.println(this.nome + " ja esta falando");
    
            }else if(comendo == true){
                System.out.println(this.nome + " ja esta comendo" + alimento);

            }else {
                this.comendo = true;
                System.out.println(this.nome + " Comecou a comer " + alimento);
            }
        }


        public void parar_de_comer(){
            if(this.comendo == false){
                System.out.println(this.nome + " Não esta comendo");
            }else{
                this.comendo = false;
                System.out.println(this.nome + " parou de comer");
            }
        }
    
    }


    class objeto_exemplo {
        public static void main(String[] args){

            Pessoa p1 = new Pessoa();
            p1.nome = "Gabriel";
            p1.idade = 19;

            
            Pessoa p2 = new Pessoa();
            p2.nome = "Pedro";
            p2.idade = 24;

            p1.falar();
            p1.parar_de_falar();
            p1.comer("cu_de_curioso");
            p1.falar();
            p1.parar_de_comer();
            p1.falar();


        }
}
