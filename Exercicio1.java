# Test_Java
public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    // Construtor
    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPreco(preco);
    }

    // Métodos get e set para número
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Métodos get e set para descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos get e set para quantidade
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    // Métodos get e set para preço
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0.0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    // Método para calcular o valor total da fatura
    public double getTotalFatura() {
        return quantidade * preco;
    }
}
