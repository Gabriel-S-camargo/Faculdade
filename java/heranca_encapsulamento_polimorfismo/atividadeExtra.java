package heranca_encapsulamento_polimorfismo;

import java.util.ArrayList;

class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;

    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double calcularAutonomia() {
        double autonomiaAtual = getCombustivel() * getConsumoMedio();

        if (autonomiaAtual < 30) {
            System.out.println("Autonomia menor que 30 KM's, Abastecimento recomendado");
        }
        return autonomiaAtual;
    }

    public void realizarViagem(double distancia) {

        double autonomiaFinal = this.calcularAutonomia() - distancia;

        if (autonomiaFinal < 0) {
            System.out.println("Não foi possível Realizar Viagem, Autonomia insuficiente");
        }else{

            setCombustivel(autonomiaFinal / getConsumoMedio());

            System.out.println("Viagem Realizada com sucesso! Restaram " + getCombustivel() +" Litros no tanque");
        }

    }

    public void mostrarInfo(){
        String abastecimento = "";
        if(getCombustivel() * getConsumoMedio() < 30){
            abastecimento = "Sim";
        }else{
            abastecimento = "Não";
        }
        System.out.println("\nVeículo: " + getMarca() + " " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Autonomia atual: " + getCombustivel() * getConsumoMedio());
        System.out.println("Precisa de abastecimento? " + abastecimento);
    }
}

class Carro extends Veiculo{
    
    public Carro(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }

    public void acelerar(){
        System.out.println("Carro Acelerando");
    }

    public void freiar(){
        System.out.println("Carro freiando");
    }
}

class Moto extends Veiculo{
    
    public Moto(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }

    public void acelerar(){
        System.out.println("Moto Acelerando");
    }

    public void freiar(){
        System.out.println("Moto freiando");
    }
}

class atividadeExtra {
    public static void main(String[] args) {

        ArrayList<Veiculo> frota = new ArrayList<Veiculo>();
        
        Carro carro01 = new Carro("Chevrolet", "Vectra", 2008, 20, 1);

        frota.add(carro01);

        frota.get(0).mostrarInfo();

        // System.out.println(frota.get(0).calcularAutonomia());

        frota.get(0).realizarViagem(2);

        Moto moto01 = new Moto("Kawasaki", "Ninja 1000", 2023, 10, 28);

        frota.add(moto01);

        frota.get(1).mostrarInfo();

        // System.out.println(frota.get(0).calcularAutonomia());

        frota.get(1).realizarViagem(2);

    }
}
