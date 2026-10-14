package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ler num1
        System.out.print("Digite p primeiro número: ");
        double num1 = sc.nextDouble();
        // Ler num2
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        // Digitar operação (+, -, *, /, %)
        System.out.print("Escolha uma operação: (+, -, *, /, %) ");
        String operacao = sc.next();

        double resultado = operacao.equals("+") ? num1 + num2 : 0;
        resultado = operacao.equals("-") ? num1 - num2 : resultado;
        resultado = operacao.equals("*") ? num1 * num2 : resultado;
        resultado = operacao.equals("/") ? num1 / num2 : resultado;
        resultado = operacao.equals("%") ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
    }
}
