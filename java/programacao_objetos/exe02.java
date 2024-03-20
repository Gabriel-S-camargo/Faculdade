package programacao_objetos;

class pessoa {
    
    String nome;
    int idade;
    double peso;
    double altura;

    public void envelhecer(){
        this.idade++;
        if(this.idade <= 21){
            this.altura += 0.01;
        }

        if(this.idade <= 21){
            System.out.printf("\nIdade e altura atualizados!\nidade: %d \naltura: %.2f", this.idade, this.altura);
        }
        else{
            System.out.printf("\nIdade atualizada!\nidade: %d", this.idade);
        }
    }

    public void engordar(double quant_kg){
        this.peso += quant_kg;
        
        System.out.printf("Peso atualizado!\nPeso: %.2f", this.peso);
    }

    public void emagrecer(double quant_kg){
        this.peso -= quant_kg;
        
        System.out.printf("Peso atualizado!\nPeso: %.2f", this.peso);
    }

    
}

class poo_exe02{
    public static void main(String[] args){
    
        pessoa p1 = new pessoa();
    
        p1.nome = "Gabriel";
        p1.idade = 19;
        p1.altura = 1.70;
        p1.peso = 75;
    
        p1.envelhecer();
        p1.envelhecer();
        p1.envelhecer();
        p1.emagrecer(10);
        
    
    }


}