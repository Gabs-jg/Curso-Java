package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Adicionam elementos na fila
        // Difereça é o comportamento quando a fila está cheia!

        fila.add("Ana"); // Retorna falso
        fila.offer("Bia"); // Lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Retornam o próximo elemento da fila
        // Difereça é o comportamento quando a fila está vazia!
        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança uma exceção
        System.out.println(fila.element());

        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Contém Gui? " + fila.contains("Gui"));
        fila.clear(); // limpa a fila
        System.out.println("Fila está vazia? " + fila.isEmpty());

        fila.add("Ana"); // Retorna falso
        fila.offer("Bia"); // Lança uma exceção
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Poll e Remove -> Retorna o próximo elemento da fila e remove
        System.out.println(fila.poll()); // Retorna null
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        //System.out.println(fila.remove()); Lança uma exceção quando a fila está vazia
    }
}
