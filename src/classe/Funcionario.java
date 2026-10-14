package classe;

public class Funcionario {

    String nome;
    double salario;
    String funcao;

    Funcionario() {
        this("Gabriel", 2000.0, "Desenvolvedor");
    }

    Funcionario(String nome) {
        this(nome, 1500, "Estagiário");
    }

    Funcionario(String nome, double salario) {
        this(nome, salario, "Analista");
    }

    Funcionario(String nome, double salario, String funcao) {
        this.nome = nome;
        this.salario = salario;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return String.format("Nome do funcionário: %s.\nSalário do funcionário: %.2f.\nFunção do funcionário: %s.\n", nome, salario, funcao);
    }
}
