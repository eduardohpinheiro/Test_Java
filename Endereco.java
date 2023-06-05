package atividade_arraylist;

public class Endereco {
    private String rua;
    private String cidade;
    private String estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirEndereco(){
        System.out.println("Endereço: "+getRua()+","+getCidade()+","+getEstado());
    }
    
    
}
