package entities;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    // Construtor: executa no momento da instanciacao do objeto,
    // iniciando os valores
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorTotalEstoque() {
        return preco*quantidade;
    }
    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void retirarProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
        +", preço: $"
        + String.format("%.2f", preco)
        + ", quantidade: "
        + quantidade
        + " unidades, Total: $ "
        + String.format("%.2f", valorTotalEstoque());
    }
}
