package classe;

public class Jantar {
    public static void main(String[] args) {

        Comida feijao = new Comida("Feijão", 0.200);
        Comida arroz = new Comida("Arroz", 0.300);
        Comida acai = new Comida("acai", 0.500);

        Pessoa p1 = new Pessoa("Gabriel", 80);
        System.out.printf("Peso de %s antes de comer: %.2f.\n", p1.nome, p1.peso);

        p1.comer(feijao);
        p1.comer(arroz);
        System.out.printf("Peso de %s depois de almoçar: %.2f.\n", p1.nome, p1.peso);

        p1.comer(feijao);
        p1.comer(arroz);
        System.out.printf("Peso de %s depois de repetir o almoço: %.2f.\n", p1.nome, p1.peso);

        p1.comer(acai);
        System.out.printf("Peso de %s depois de comer uma sobremesa: %.2f.\n", p1.nome, p1.peso);
    }
}
