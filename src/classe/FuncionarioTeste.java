package classe;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        System.out.println(f1);

        Funcionario f2 = new Funcionario("José");
        System.out.println(f2);

        Funcionario f3 = new Funcionario("Baltazar", 1600);
        System.out.println(f3);

        Funcionario f4 = new Funcionario("Baldur", 1700, "Engenheiro de testes");
        System.out.println(f4);

        Funcionario f5 = new Funcionario();
        System.out.println(f5);
        f5.nome = "Josué";
        System.out.println(f5);
        f5.salario = 1656.75;
        System.out.println(f5);
        f5.funcao = "Zelador";
        System.out.println(f5);
    }
}
