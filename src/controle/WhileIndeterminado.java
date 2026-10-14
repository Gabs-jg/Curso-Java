package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String valor = "";

        while(!valor.equalsIgnoreCase("sair")) {
            System.out.print("Digite uma palavara ou digite sair para finalizar o programa: ");
            valor = sc.nextLine();
        }

        sc.close();
    }
}
