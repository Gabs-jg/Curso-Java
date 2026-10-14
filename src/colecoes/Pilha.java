package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>(); // Estrutura relacionado com fila e pilha

        livros.add("O pequeno Prínciope");
        livros.push("Dom Quixote");
        livros.push("O hobbit");

        for(String livro : livros) {
            System.out.println(livro);
        }

        System.out.println(livros.peek()); // Retorna null
        System.out.println(livros.element()); // Retorna uma exceção

        System.out.println(livros.pop());
        System.out.println(livros.poll()); // Retorna null
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        // System.out.println(livros.pop()); Retorna uma exceção
        // System.out.println(livros.remove()); Retorna uma exceção

        System.out.println(livros.size());
        livros.clear();
        System.out.println("Contém Dom Quixote? " + livros.contains("Dom Quixote"));
        System.out.println("Está vazia? " + livros.isEmpty());
    }
}
