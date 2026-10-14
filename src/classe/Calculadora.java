package classe;

public class Calculadora {

    double resultado;

    double somar(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    double subtrair(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    double multiplicar(double a, double b) {
        resultado = a * b;
        return resultado;
    }

    double dividir(double a, double b) {
        resultado = a / b;
        return resultado;
    }

    void acrescentar(double a) {
        resultado += a;
    }

    double obterResultado() {
        return resultado;
    }

    void limpar() {
        resultado = 0;
    }
}
