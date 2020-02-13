package exercicio03;

import java.util.Set;

public class Prova {
    Set<Integer>valor=new HashSet<>();

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma;
        for(Integer chave : valor){
            soma+=chave;
        }
        System.out.println(soma);
    }
}
