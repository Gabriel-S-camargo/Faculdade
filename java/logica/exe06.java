import java.util.Scanner;

class logi_exe06 {

    private static int valor;

    private static void atualizaValor(int cedula){
        valor %= cedula;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe valor do saque: ");
        valor = input.nextInt();

        int notas_100 = valor / 100;

        atualizaValor(100);

        int notas_50 = valor / 50;

        atualizaValor(50);

        int notas_20 = valor / 20;

        atualizaValor(20);

        int notas_10 = valor / 10;

        atualizaValor(10);

        int notas_5 = valor / 5;

        atualizaValor(5);

        System.out.printf("Quantidade cédulas 100: %d \nQuantidade cédulas 50: %d \nQuantidade cédulas 20: %d \nQuantidade cédulas 10: %d \nQuantidade cédulas 5: %d", notas_100, notas_50, notas_20, notas_10, notas_5);

        input.close();
    }

}
