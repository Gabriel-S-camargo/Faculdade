import java.util.Scanner;

class logi_exe05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe Capacidade do tanque: ");
        double capacidade_tanque = input.nextDouble();

        System.out.print("Informe quantidade abastecida: ");
        double quantidade_abastecida = input.nextDouble();

        System.out.print("informe a quilometragem percorrida desde o último abastecimento: ");
        double km_percorridos = input.nextDouble();

        double consumo_medio = quantidade_abastecida * km_percorridos;
        
        double autonomia_carro = (capacidade_tanque - quantidade_abastecida) * consumo_medio;

        System.out.printf("Autonomia antes do abastecimento: %.2f \nConsumo Medio: %.2fKM/L", autonomia_carro, consumo_medio);
        
        input.close();
    }
}
