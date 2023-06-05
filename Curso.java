package atividade_arraylist;

public class Curso {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void imprimirCurso(){
        System.out.println("Curso: "+getNome());
    }
}
