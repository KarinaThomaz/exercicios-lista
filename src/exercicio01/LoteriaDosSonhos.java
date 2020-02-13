package exercicio01;

import java.util.HashMap;
import java.util.Map;

public class LoteriaDosSonhos {

        Map<Integer, String> mapa = new HashMap<>();

        public LoteriaDosSonhos(){

        }

    public LoteriaDosSonhos(Map<Integer, String> mapa) {
        this.mapa = mapa;
    }

    public void adicionar(){
            mapa.put(0, "Ovos");
            mapa.put(1, "Água");
            mapa.put(2, "Escopeta");
            mapa.put(3, "Cavalo");
            mapa.put(4, "Dentista");
            mapa.put(5, "Fogo");
        }

    public void percorrer() {
        for (Integer chave : mapa.keySet()) {
            String premio = mapa.get(chave);
            System.out.println(chave + " --> " + premio);
        }
    }

}
