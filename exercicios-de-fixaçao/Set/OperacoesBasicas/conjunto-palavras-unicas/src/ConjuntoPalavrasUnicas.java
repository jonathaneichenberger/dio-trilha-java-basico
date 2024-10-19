
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("BMW");
        conjuntoLinguagens.adicionarPalavra("Fiat");
        conjuntoLinguagens.adicionarPalavra("Ford");
        conjuntoLinguagens.adicionarPalavra("Chevrolet");
        conjuntoLinguagens.adicionarPalavra("Renault");
        conjuntoLinguagens.adicionarPalavra("Ferrari");

        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Fiat");
        conjuntoLinguagens.exibirPalavrasUnicas();

        conjuntoLinguagens.removerPalavra("Swift");

        System.out.println("A fabricante 'BMW' está no conjunto? " + conjuntoLinguagens.verificarPalavra("BMW"));
        System.out.println("A fabricante 'Fiat' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Fiat"));

        conjuntoLinguagens.exibirPalavrasUnicas();
    }
}