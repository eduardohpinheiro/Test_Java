# Test_Java
public class Fatura {
    private String numero;
    private  String descricao;
    private  int quantidade;
    private  double preco;
    
    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPreco(preco);
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
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
    public double getTotalFatura() {
        return quantidade * preco;
    }
}

// app de teste da classe fatura 
public class FaturaTeste {
    public static void main(String[] args) {
      
        Fatura fatura = new Fatura("123", "Mouse", 5, 12.99);

        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço: " + fatura.getPreco());
        System.out.println("Total da Fatura: " + fatura.getTotalFatura());
     
        fatura.setQuantidade(10);
        fatura.setPreco(9.99);
      
        System.out.println("Quantidade atualizada: " + fatura.getQuantidade());
        System.out.println("Preço atualizado: " + fatura.getPreco());
        System.out.println("Total da Fatura atualizado: " + fatura.getTotalFatura());
    }
}
