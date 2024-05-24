package exercicios_try_cat;

import java.util.Scanner;

public class exemplo2 {

    public static class Financiamento {
        private double valorFinanciamento;
        private int quantidadeParcelas;
        private double taxaJuros;

        public Financiamento(double valorFinanciamento, int quantidadeParcelas, double taxaJuros) {
            if (valorFinanciamento < 0.0 || quantidadeParcelas < 0 || taxaJuros < 0) {
                throw new RuntimeException("Valores precisam ser positivos");
            }

            this.valorFinanciamento = valorFinanciamento;
            this.quantidadeParcelas = quantidadeParcelas;
            this.taxaJuros = taxaJuros;
        }

        public double getValorFinanciamento() {
            return valorFinanciamento;
        }

        public int getQuantidadeParcelas() {
            return quantidadeParcelas;
        }

        public double getTaxaJuros() {
            return taxaJuros;
        }

        public void InfoFinanciamento() {
            double valorTotal = getValorFinanciamento() + getValorFinanciamento() * (getTaxaJuros()/100.0);
            double valorParcela = valorTotal / getQuantidadeParcelas();
            double valorJuros = getValorFinanciamento() * (getTaxaJuros()/100.0);

            System.out.printf("Valor Financiado: %.2f" , getValorFinanciamento());
            System.out.printf("\nValor total a ser pago: %.2f" , valorTotal);
            System.out.printf("\nValor de cada Parcela: %.2f" , valorParcela);
            System.out.println("\nTaxa de juros: " + getTaxaJuros() + "%");
            System.out.println("Valor do juros: " + valorJuros);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe valor do Financiamento:");
        double valorFinanciamento = input.nextDouble();

        System.out.println("Informe Quantidade de parcelas:");
        int quantidadeParcelas = input.nextInt();

        System.out.println("Informe taxa de Juros:");
        double taxaJuros = input.nextDouble();

        try {
            Financiamento financiamento01 = new Financiamento(valorFinanciamento, quantidadeParcelas, taxaJuros);
            financiamento01.InfoFinanciamento();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        input.close();
    }
}