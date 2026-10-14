package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro salário: ");
        String s1 = sc.nextLine();

        System.out.print("Digite o valor do segundo salário: ");
        String s2 = sc.nextLine();

        System.out.print("Digite o valor do terceiro salário: ");
        String s3 = sc.nextLine();

        Double v1 = Double.parseDouble(s1.replace(",", "."));
        Double v2 = Double.parseDouble(s2.replace(",", "."));
        Double v3 = Double.parseDouble(s3.replace(",", "."));

        double media = (v1 + v2 + v3)/3;

        System.out.println("Média: " + media);

        sc.close();
    }
}
