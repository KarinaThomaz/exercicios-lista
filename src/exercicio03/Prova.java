package exercicio03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prova {

    Map<Integer, Integer> mapa=new HashMap<>();

    public Prova(Map<Integer, Integer> mapa) {
        this.mapa = mapa;
    }

    public void somaTotal(Set<Integer> conjuntoDeInteiros){

        for(Integer chave : mapa.keySet()){

            Integer soma = mapa.get(chave);
            soma+=chave;
            System.out.println(soma);
        }
    }
}
