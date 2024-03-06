import java.util.Scanner;

class logi_exe02 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Informe numero: ");
        int numero = input.nextInt();

        System.out.printf("Antecessor: %d \nSucessor: %d", numero - 1, numero + 1);

        input.close();
    }
}
