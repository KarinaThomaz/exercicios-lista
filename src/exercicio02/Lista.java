package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    List<Integer> lista=new ArrayList<>();

    public Lista(){

    }

    public Lista(List<Integer> lista) {
        this.lista = lista;
    }

    public void adicionar(){
        lista.add(1);
        lista.add(5);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(8);
        lista.add(8);
    }

    public void imprimir(){
        System.out.println("--------------------------");
        for(Integer i : lista){
            System.out.println(i);
        }
    }
}
