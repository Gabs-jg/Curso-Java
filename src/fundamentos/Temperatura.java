package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final int AJUSTE = 32;
        final double FATOR = 5.0/9.0;
        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.printf("%.2f° Fahrenheit = %.2f° Celsius", fahrenheit, celsius);
    }
}