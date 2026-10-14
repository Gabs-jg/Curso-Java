package classe;

import java.util.Scanner;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1  = new Produto("Notebook", 4356.89);
        //p1.nome = "Notebook";
        //p1.preco = 4356.89;
        //p1.desconto = 0.25;

        var p2 = new Produto("Caneta");
        p2.nome = "Caneta";
        p2.preco = 12.56;
        Produto.desconto = 0.50;

        System.out.printf("Preço do produto %s com desconto: %.2f\n", p1.nome, p1.precoComDesconto());
        System.out.printf("Preço do produto %s com desconto: %.2f\n", p2.nome, p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2)/2;

        System.out.printf("Preço final do produto %s: %.2f.\n",p1.nome, precoFinal1);
        System.out.printf("Preço final do produto %s: %.2f.\n",p2.nome, precoFinal2);
        System.out.printf("Média do carrinho %.2f.", mediaCarrinho);
    }
}
