package dataehora;

import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Duration;
import java.util.List;
import java.util.ArrayList;

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
        if ((tempoPermanencia.toMinutes() - 60 ) <= 1) {
             setTotalAPagar(5);
             System.out.println(tempoPermanencia.toMinutes() - 10);
        } else {
            double tempVar = tempoPermanencia.toMinutes();

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
            System.out.printf("Total a pagar: " + "%.2f",getTotalAPagar());

        } else {
            System.out.println("Impossivel Imprimir Recibo, Saida não registrada");
        }
    }

}

class atividadesDataEHora {
    public static void main(String[] args) {

        List<Carro> estacionamento = new ArrayList<Carro>();

        Carro carro01 = new Carro("AAAA-1234");

        estacionamento.add(carro01);

        estacionamento.get(0).registrarSaida("20:30cl");

        estacionamento.get(0).imprimirRecibo();

    }
}
