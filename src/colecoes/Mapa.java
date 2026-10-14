package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(1, "Ricardo"); // Pode ser atualizado e não há duplicação
        usuarios.put(2, "Roberto");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // Pega o valor das chaves
        System.out.println(usuarios.values()); // Pega o valor
        System.out.println(usuarios.entrySet()); // Pega a chave e o valor

        System.out.println(usuarios.containsKey(2)); // Verifica se contém uma chave
        System.out.println(usuarios.containsValue("Rebeca")); // Verifica se contém um valor

        System.out.println(usuarios.get(3)); // pega um valor atraves da chave

        // Percorrendo um map
        for(int chave : usuarios.keySet()) { // por chave
            System.out.println(chave);
        }

        for(String valor : usuarios.values()) { // por valor
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro : usuarios.entrySet()) { // por chave e valor
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }

    }
}