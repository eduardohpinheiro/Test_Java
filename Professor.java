package atividade_arraylist;

import java.util.ArrayList;

public class Professor extends Pessoa{
    public Professor(){
        super();
    }
    private String titulacao;
    private Double salario;
    private ArrayList<Curso> cursos;

   
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Titulação: " +getTitulacao()+"Salario: "+getSalario());
        System.out.println("______Dados Professor______");
        super.imprimir();
        
        for(int i = 0 ; i < getCursos().size(); i++){
            getCursos().get(i).imprimirCurso();
        }
    }
    
}
