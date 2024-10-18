import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listItems;

    public CarrinhoDeCompras() {
        this.listItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        if (!listItems.isEmpty()) {
            for (int i = 0; i < listItems.size(); i++) {
                if (listItems.get(i).getNome().equals(nome)) {
                    System.out.println("Item: " + listItems.get(i).getNome() + " removido com sucesso!");
                    listItems.remove(i);
                }
            }
        }
    }

    public void calcularValorTotal() {
        double total = 0;
        for (Item item : listItems) {
            total += item.getPreco() * item.getQuantidade();
        }
        System.out.println("Valor Total dos Produtos: R$" + String.format("%.2f", total));
    }

    public void exibirItens() {
        for (int i = 0; i < listItems.size(); i++) {
            System.out.println("Produto " + (i + 1) + ": " + listItems.get(i).toString());
            System.out.println("------------------------------------------");
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("TV", 500.00, 3);
        carrinho.adicionarItem("Notebook", 3500.00, 1);
        carrinho.adicionarItem("Celular", 1500.00, 2);
        carrinho.adicionarItem("Fone de Ouvido", 200.00, 4);
        carrinho.adicionarItem("Geladeira", 2500.00, 1);
        carrinho.adicionarItem("Cadeira Gamer", 700.00, 2);

        carrinho.exibirItens();

        carrinho.calcularValorTotal();

        carrinho.removerItem("Celular");

        carrinho.calcularValorTotal();

    }
}
