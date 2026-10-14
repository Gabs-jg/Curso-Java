package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaNota = 0;
        double nota = 0;
        int quantidadeNotasValidas = 0;

        while(nota != -1) {
            System.out.print("Informe a nota ou -1 para sair: ");
            nota = sc.nextDouble();
            if(nota >= 0 && nota <= 10) {
                somaNota += nota;
                quantidadeNotasValidas++;
            } else if(nota != -1){
                System.out.println("Por favor, digite uma nota válida.");
            }
        }

        double media = somaNota / quantidadeNotasValidas;

        System.out.printf("\nForam digitadas %d notas válidas e a média é %.2f.", quantidadeNotasValidas, media);

        sc.close();
    }
}
