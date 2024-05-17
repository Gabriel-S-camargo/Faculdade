package dataehora;

import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Duration;
import java.util.HashMap;
import java.util.Scanner;

class Carro {
    public String placa;
    public LocalTime horaEntrada;
    public LocalTime horaSaida;
    public double totalAPagar;

    public Carro(String placa) {
        this.placa = placa;
        this.horaEntrada = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    // Formatadores de Saida

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

    // Fim Formatadores de Saida

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public void registrarSaida(String horaSaida) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
    
        LocalTime hora = LocalTime.parse(horaSaida, formato);
    
        setHoraSaida(hora);
    
        Duration tempoPermanencia = Duration.between(horaEntrada, hora);
        if ((tempoPermanencia.toMinutes() - 60) <= 1) {
            setTotalAPagar(5);
            System.out.println(tempoPermanencia.toMinutes() - 10);
        } else {
            long tempVar = tempoPermanencia.toMinutes();
    
            tempVar -= 60;
    
            tempVar /= 15;
    
            setTotalAPagar((tempVar * 2) + 5);
        }
        System.out.println("Saida registrada!");
    }
    

    public void imprimirRecibo() {

        if (getHoraSaida() != null) {
            Duration tempoPermanencia = Duration.between(horaEntrada, horaSaida);
            System.out.println("-----------------------------\r\n" + //
                    "           Recibo\r\n" + //
                    "-----------------------------");
            System.out.println("PLACA: " + getPlaca());
            System.out.println("Hora entrada: " + getHoraEntrada().format(formato));
            System.out.println("Hora Saida: " + getHoraSaida().format(formato));
            System.out.println("Tempo de Permanencia: " + tempoPermanencia.toMinutes());
            System.out.printf("Total a pagar: " + "%.2f", getTotalAPagar());

        } else {
            System.out.println("Impossivel Imprimir Recibo, Saida não registrada");
        }
    }

}

class exercicioDataEHora2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bem Vindo ao Estacionamento do Simas");
        System.out.println("Escolha uma opção");

        HashMap<Integer, Carro> estacionamento = new HashMap<Integer, Carro>();

        int opcao = 10;

        do {
            System.out.println("\n[1] Entrada de Veículo");
            System.out.println("[2] Saida de Veiculo");
            System.out.println("[3] Listagem de Veiculos");
            System.out.println("[4] Sair");
            opcao = input.nextInt();

            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe Placa do Veiculo");
                    String placaTemp = input.nextLine();

                    Carro carro = new Carro(placaTemp);

                    if (estacionamento.size() <= 50) {
                        System.out.println("Informe vaga a ser estacionado o carro : ");
                        int vagaTemp = input.nextInt();
                        estacionamento.put(vagaTemp, carro);
                    } else {
                        System.out.println("Estacionamento Cheio! Impossivel realizar entrada");
                    }
                    break;

                case 2:
                    System.out.println("Informe Numero da Vaga que o carro estava Localizado");
                    int localizaVaga = input.nextInt();

                    input.nextLine();

                    if (estacionamento.get(localizaVaga) != null) {

                        System.out.println("Informe horario de saida no formato - HH:ss");
                        String horaSaida = input.nextLine();

                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
    
                        LocalTime hora = LocalTime.parse(horaSaida, formato);

                        String horaFormatada = hora.format(formato);

                        estacionamento.get(localizaVaga).registrarSaida(horaFormatada);

                        estacionamento.get(localizaVaga).imprimirRecibo();

                        estacionamento.remove(localizaVaga);
                    }else{
                        System.out.println("Carro não localizado!");
                    }

                    break;

                case 3:
                    
                    for(int i = 1; i <= 50; i++){
                        if(estacionamento.get(i) != null){
                            System.out.println("Carro[" + i + "]");
                            System.out.println("Placa Carro: " + estacionamento.get(i).getPlaca());
                            System.out.println("Horario da entrada: " + estacionamento.get(i).getHoraEntrada());
                            System.out.println("Vaga do carro: " + i);

                        }
                    }

                    break;

                default:
                    break;
            }

        } while (opcao != 4);

        input.close();

    }
}
