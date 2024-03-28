package extra_poo;

class Caneta{

    public String marca;
    public String cor;
    public double carga;
    public boolean tampada;
    public boolean escrevendo ;


    // Builder 
    
    public Caneta(String marca, String cor){
        this.setCor(cor);
        this.setMarca(marca);
        this.setCarga(100);
        this.setTampada(true);
        this.setEscrevendo(false);
    }


    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public void setCarga(double carga){
        this.carga = carga;
    }
    public double getCarga(){
        return this.carga;
    }

    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }
    public boolean getTampada(){
        return this.tampada;
    }

    public void setEscrevendo(boolean escrevendo){
        this.escrevendo= escrevendo;
    }
    public boolean getEscrevendo(){
        return this.escrevendo;
    }

    public void status(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Cor tinta: " + this.getCor());
        System.out.println("tampada: " + this.getTampada());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Escrevendo: " + this.getEscrevendo());
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

        Caneta c1 = new Caneta("Bic", "Azul");

        c1.status();

    }

}
