package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terça (V ou F)
        boolean trabalho1 = false;
        // Trabalho na quinta (V ou F)
        boolean trabalho2 = false;
        // tomar sorvete?
        boolean tomarSorvete;


        // se os dois derem certos = tv de 50 e sorvete
        if(trabalho1 && trabalho2) {
            System.out.println("Ir ao shopping comprar televisão de 50 polegadas e tomar sorvete.");
            tomarSorvete = true;
            // se um der certo = tv de 32 e sorvete
        } else if(trabalho1 || trabalho2) {
            System.out.println("Ir ao shopping comprar televisão de 32 polegadas e tomar sorvete.");
            tomarSorvete = true;
            // se nenhum der certo vai ficar em casa
        } else {
            System.out.println("Não fomos ao shopping");
            tomarSorvete = false;
        }

        // nao tomou sorvete = mais saudavel
        if(!tomarSorvete) {
            System.out.println("Estamos saudáveis");
            // tomou sorvete = nao vai ficar com fome
        } else {
            System.out.println("Não ficamos com fome");
        }
    }
}
