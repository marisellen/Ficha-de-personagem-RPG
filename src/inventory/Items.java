package inventory;
// classe dos itens
public class Items {
    private String nome;
    private int quantidade;

    public Items(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public int getQuantity() {
        return quantidade;
    }

    public void setQuantity(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + " (Quantidade: " + quantidade + ")";
    }
}
