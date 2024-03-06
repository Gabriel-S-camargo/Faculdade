import java.util.Scanner;

class logi_exe04 {    
    public static void main (String[] args){

        Scanner input = new Scanner(System.in); 
        
        System.out.print("Informe quantidade de quilômetros percorridos: ");
        double km_percorridos = input.nextDouble();

        System.out.print("Informe a quantidade de dias alugado: ");
        int dias_alugado = input.nextInt();

        double valor_total = (km_percorridos * 0.15) + (dias_alugado * 70) ;
        
        System.out.printf("Total a pagar: R$%.2f", valor_total);

        input.close();
    }
}
