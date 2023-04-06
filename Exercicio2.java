# Test_Java
public class Empregado {
    public String nome;
    public String sobrenome;
    public double salarioMensal;

    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal >= 0.0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }
    public double getSalarioAnual() {
        return salarioMensal * 12;
    }
    public void aplicarAumentoSalario(double percentualAumento) {
        double aumento = salarioMensal * percentualAumento / 100;
        salarioMensal += aumento;
    }
}
