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
//app de teste
public class EmpregadoTeste {
    public static void main(String[] args) {
       
        Empregado empregado1 = new Empregado("João", "Silva", 5000.0);
        Empregado empregado2 = new Empregado("Maria", "Santos", 6000.0);
        
        System.out.println("Salário anual do empregado 1: " + empregado1.getSalarioAnual());
        System.out.println("Salário anual do empregado 2: " + empregado2.getSalarioAnual());

        empregado1.aplicarAumentoSalario(10);
        empregado2.aplicarAumentoSalario(10);
        
        System.out.println("Salário anual atualizado do empregado 1: " + empregado1.getSalarioAnual());
        System.out.println("Salário anual atualizado do empregado 2: " + empregado2.getSalarioAnual());
    }
}
