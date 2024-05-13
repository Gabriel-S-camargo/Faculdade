package dataehora;


import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Duration;

class Carro{
    public String placa;
    public LocalTime horaEntrada;
    public LocalTime horaSaida;
    public double totalAPagar;

    public Carro(String placa){
        this.placa = placa;
        this.horaEntrada = LocalTime.now(ZoneId.of("America/Sao_Paulo")); 
    }

    DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");

    DateTimeFormatter formatoMinutos = DateTimeFormatter.ofPattern("mm");

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
    

    public void registrarSaida(){
        this.horaSaida = LocalTime.now();
        Duration tempoPermanencia = Duration.between(horaEntrada, horaSaida);
        if(tempoPermanencia.toMinutes() / 60 <= 1){
            this.totalAPagar = 5.00;
        }else{
            double tempVar = tempoPermanencia.toMinutes();

            tempVar -= 60;

            tempVar /= 15;

            this.totalAPagar = (tempVar * 2) + 5;
        }
        System.out.println("Saida registrada!");
    }

    public void imprmirRecibo(){
        Duration tempoPermanencia = Duration.between(horaEntrada, horaSaida);
        System.out.println("-----------------------------\r\n" + //
                        "           Recibo\r\n" + //
                        "-----------------------------");
        System.out.println("PLACA: " + getPlaca());
        System.out.println("Hora entrada: " + getHoraEntrada().format(formato));
        System.out.println("Hora Saida: " + getHoraSaida().format(formatoMinutos));
        System.out.println("Tempo de Permanencia: " + tempoPermanencia.toMinutes());
        System.out.println("Total a pagar: "  );
    }
    

}

class atividadesDataEHora {
    public static void main(String[] args){
        System.out.println("-----------------------------\r\n" + //
                        "           Recibo\r\n" + //
                        "-----------------------------");
    }
}
