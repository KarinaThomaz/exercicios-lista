import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Set<String> conjunto = new HashSet<>();
        Map<Integer, String>mapa = new HashMap<>();

        lista.add("Karina");
        lista.add("Mario");

        lista.remove(1);

        for(String valor:lista){
            System.out.println(valor);
        }

        conjunto.add("Olá");
        conjunto.add("Mundo");
        conjunto.add("tudo");
        conjunto.add("bem");

        conjunto.remove("Mundo");

        for (String valor : conjunto) {
            System.out.println(valor);
        }

        //adicionando no mapa
        mapa.put(2, "Olá mundo");
        mapa.put(1, "tudo bem");
        mapa.put(7, "bye");

        //percorrendo o mapa
        for(Integer chave: mapa.keySet()){ //criando um indice que recebe as chaves
            String valor = mapa.get(chave);//exibindo todas as chaves
            System.out.println(valor);//imprimindo
        }
    }

}
