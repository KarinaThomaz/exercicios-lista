package exercicio01;

import java.util.HashMap;
import java.util.Map;

public class Apelidos {
    Map<String, String> mapa = new HashMap<>();

    public void adicionar(){
        mapa.put("João", "Juan, Fissura, Maromba");
        mapa.put("Miguel", "Night Watch, Bruce Wayne, Tampinha");
        mapa.put("Maria", "Wonder Woman, Mary, Marilene");
        mapa.put("Lucas", "Lukinha, Jorge, George");
    }

    public void percorrer(){
        for(String valor : mapa.keySet()){
            String texto=mapa.get(valor);
            System.out.println(valor+" --> "+texto);
        }
    }
}
