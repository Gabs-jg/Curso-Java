package fundamentos;

public class DesafioAritmeticos {
    public static void main(String[] args) {

        double e1d = 1 - 5;
        double e2d = 2 - 7;
        double e3d = e1d * e2d;
        double e4d = e3d / 2;
        double e5d = Math.pow(e4d, 2);
        double e1e = 3 + 2;
        double e2e = e1e * 6;
        double e3e = Math.pow(e2e, 2);
        double e4e = 3 * 2;
        double e5e = e3e / e4e;
        double r1 = e5e - e5d;
        double r2 = Math.pow(r1, 3);
        double r3 = Math.pow(10, 3);
        double result = r2 / r3;

        System.out.println("Lado esquerdo = " + e5e + "\nLado direito = " + e5d + "\nSubtração e expo = " + r2 + "\nResultado = " + result);


        /*int a = 3 * 4 - 10;
        int b = (int) Math.pow(a, 3);
        double c = Math.pow(a, 3);

        System.out.println(b);
        System.out.println(c);*/
    }
}
