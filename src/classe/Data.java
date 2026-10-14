package classe;

public class Data {
    int dia;
    int mes;
    int ano;
    String formato = "%d/%d/%d";

    Data() {
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970); // o this() chama o outro construtor
    }

    // inicializadas de forma implícita
    // byte, short, int, long -> 0
    // float, double -> 0.0
    // boolean -> false
    // char -> '/u0000'
    // objetos -> null
    // constantes precisam ser inicializadas ou na classe ou no construtor

    // variável local não é inicializada por padrão, precisa inicializar antes de usá-la, iniciar de forma explícita.

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format(formato, this.dia, this.mes, this.ano);
                //dia + "/" + mes + "/" + ano;
    }

    void imprimirDataFormatada() {
        System.out.println(this.obterDataFormatada());
    }

}
