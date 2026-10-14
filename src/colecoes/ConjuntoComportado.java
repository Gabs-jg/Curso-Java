package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> listaAprovados = new HashSet<>(); NÃO RESPEITA NENHUMA ORDEM

        //Set<String> listaAprovados = new LinkedHashSet<>(); RESPEITA A ORDEM DE INSERÇÃO
        //TreeSet é ordenado
        Set<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato:listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);

        for(int n:nums) {
            System.out.println(n);
        }
    }
}
