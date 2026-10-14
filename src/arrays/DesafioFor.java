package arrays;

import java.util.Scanner;

public class DesafioFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas: ");
        double[] notas = new double[sc.nextInt()];

        for(int i=0; i<notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double soma = 0;
        for(double nota:notas) {
            soma+=nota;
        }

        double media = soma/notas.length;
        System.out.println("A média das notas é: " + media);

        sc.close();
    }
}
