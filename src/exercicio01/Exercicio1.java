package exercicio01;

public class Exercicio1 {
    public static void main(String[] args) {
        LoteriaDosSonhos premios = new LoteriaDosSonhos();
        Apelidos carinhoso = new Apelidos();

        premios.adicionar();
        premios.percorrer();

        carinhoso.adicionar();
        carinhoso.percorrer();
    }
}
