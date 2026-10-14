package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.imprimirDataFormatada();
        //d1.dia = 25;
        //d1.mes = 06;
        d1.ano = 2005;

        var d2 = new Data(3, 3, 2026);
        //d2.dia = 3;
        //d2.mes = 3;
        //d2.ano = 2026;

        System.out.println("A data instanciada foi: " + d1.obterDataFormatada());
        System.out.println("A data instanciada foi: " + d2.obterDataFormatada());
    }
}
