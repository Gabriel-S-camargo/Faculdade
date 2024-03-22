package extra_poo;

class Caneta{

    String marca;
    String cor;
    boolean tampada = true;
    float carga = 100;
    boolean escrevendo = false;

    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor tinta: " + this.cor);
        System.out.println("tampada: " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Escrevendo: " + this.escrevendo);
        System.out.println("\n");

    }

    public void destanpar(){
        if(this.tampada == true){
            System.out.println("Caneta Destampada\n");
            this.tampada = false;
        }
        else if(this.tampada == false){
            System.out.println("Ja esta destanpada\n");
        }
    }

    public void tampar(){
        if(this.tampada == true){
            System.out.println("ja esta tampada\n");
        }
        else if(this.tampada == false){
            System.out.println("Caneta tampada\n");
            this.tampada = true;
        }
    }

    public void escrever(){
        
        if(this.escrevendo == true && this.tampada == false && this.carga > 0){
            System.out.println("Ja esta escrevendo\n carga atual: \n" + this.carga);
            carga -= 10;
        }else{
            this.escrevendo = true;
    
            if(this.tampada == true){
                System.out.println("Caneta tampada n pode escrever\n");
            }
            else if(this.carga <= 0){
                System.out.println("Caneta sem tinta :( \n");
            }
            else{
                System.out.println("Esta escrevendo :) \n carga atual: \n"+ this.carga);
                carga -= 10;
            }


        }
        
    }

}


class extra_poo_exe03 {
    
    public static void main(String[] args){

        Caneta c1 = new Caneta();
        c1.marca = "Bic";
        c1.cor = "Azul";
    
        c1.destanpar();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.escrever();
        c1.status();

    }

}
