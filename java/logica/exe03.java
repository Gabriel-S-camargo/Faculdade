import java.util.Scanner;

class logi_exe03 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe quantidade de latas 350ml: ");
        int lata_350ml = input.nextInt();

        System.out.print("Informe quantidade de garrafas 600ml: ");
        int garrafa_600ml = input.nextInt();

        System.out.print("Informe quantidade de garrafas 2L: ");
        int garrafas_2L = input.nextInt();

        double total_litros = (lata_350ml * 0.35) + (garrafa_600ml * 0.6) + (garrafas_2L * 2);

        System.out.printf("Total de litros: %.1fL", total_litros);
        
        input.close();
    }    

}
