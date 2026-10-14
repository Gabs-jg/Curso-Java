package controle;

public class DesafioFor {
    public static void main(String[] args) {

        for(String v = "#";!v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}

// Não pode usar valor numérico para controlar o laço
