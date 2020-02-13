package exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Conjunto {
    Set<Integer> conjunto = new HashSet<>();

    public void adicionar(){
        conjunto.add(1);
        conjunto.add(5);
        conjunto.add(5);
        conjunto.add(6);
        conjunto.add(7);
        conjunto.add(8);
        conjunto.add(8);
        conjunto.add(8);
    }

    public void imprimir(){
        System.out.println("--------------------------");
        for(Integer valor : conjunto){
            System.out.println(valor);
        }
    }
}
