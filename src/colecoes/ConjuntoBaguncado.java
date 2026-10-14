package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        // add
        conjunto.add(1.2); // -> Transforma o tipo primitivo em Wrapper (double -> Double)
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String ja é objeto
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character

        System.out.println("Tamanho: " + conjunto.size());

        // O hashset não aceita valores repetidos, por isso continua com o mesmo tamanho
        conjunto.add("Teste");
        System.out.println("Tamanho: " + conjunto.size());

        // remove
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));
        System.out.println("Tamanho: " + conjunto.size());

        // contains
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // união entre dois conjuntos
        conjunto.addAll(nums);
        System.out.println(conjunto);

        // interseção entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        // limpar
        conjunto.clear();
        System.out.println(conjunto.isEmpty());
        System.out.println(conjunto);
    }
}
