
import java.util.Scanner;
class logi_exe01 {   
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("informe horas: ");
        int horas = input.nextInt();

        System.out.print("informe Minutos: ");
        int minutos = input.nextInt();

        System.out.print("informe segundos: ");
        int segundos = input.nextInt();

        int total_segundos = (horas * 3600) + (minutos * 60) + segundos ;

        System.out.printf("Total em segundos : %d s", total_segundos);

        input.close();
    }

}
