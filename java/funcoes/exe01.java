package funcoes;

import java.util.Scanner;

class funcoes_exe01 {
    
    public static float mostraMedia(float nota1, float nota2, float nota3){
        
        float valorMedia = (nota1 + nota2 + nota3) / 3;        

        System.out.printf("Media do aluno: %.2f", valorMedia);

        return valorMedia;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe nota 1: ");
        float nota1 = input.nextFloat();

        System.out.println("Informe nota 2: ");
        float nota2 = input.nextFloat();

        System.out.println("Informe nota 3: ");
        float nota3 = input.nextFloat();
        

        mostraMedia(nota1, nota2, nota3);

        input.close();
    }


}
