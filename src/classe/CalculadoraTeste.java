package classe;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2.3, 4.5));

        calc.acrescentar(10);
        System.out.println(calc.obterResultado());

        calc.limpar();
        System.out.println(calc.obterResultado());

        System.out.println(calc.multiplicar(3, 2));
        calc.limpar();
        System.out.println(calc.obterResultado());

        System.out.println(calc.subtrair(10, 5));
        calc.limpar();
        System.out.println(calc.obterResultado());

        System.out.println(calc.dividir(100, 25));
        calc.limpar();
        System.out.println(calc.obterResultado());
    }
}
