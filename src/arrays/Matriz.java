package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na turma: ");
        int quantidadeDeAlunos = sc.nextInt();

        System.out.print("Digite a quantidade de notas que cada aluno terá: ");
        int quantidadeDeNotas = sc.nextInt();

        double[][] alunosENotas = new double[quantidadeDeAlunos][quantidadeDeNotas];

        double soma = 0;
        for(int i=0; i<alunosENotas.length; i++) {
            for(int j=0; j<alunosENotas[i].length; j++) {
                System.out.print("Digite a " + (j+1) + " nota do " + (i+1) + " aluno: ");
                alunosENotas[i][j] = sc.nextDouble();
                soma += alunosENotas[i][j];
            }
        }

        double media = soma/(quantidadeDeAlunos*quantidadeDeNotas);
        System.out.println("A média é: " + media);

        for(double[] notasDoAluno:alunosENotas) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        sc.close();
    }
}
