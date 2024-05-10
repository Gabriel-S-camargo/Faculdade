package dataehora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.ZoneId;

public class exemplo {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Hoje é " + hoje.format(formatter));

        LocalTime now = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Horario: " + now.format(formato));
    }
}