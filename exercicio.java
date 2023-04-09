# questao 1 - PROGRAMAÇÃO ORIENTADA A OBJETOS



import java.util.Scanner;

public class CalculoSalarioVendedor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numCarrosVendidos = input.nextInt();

        System.out.print("Digite o valor total das vendas: R$");
        double valorTotalVendas = input.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: R$");
        double salarioFixo = input.nextDouble();

        System.out.print("Digite o valor por carro vendido: R$");
        double valorPorCarroVendido = input.nextDouble();

        // Cálculo do salário final
        double comissaoFixa = numCarrosVendidos * valorPorCarroVendido;
        double comissaoPercentual = 0.05 * valorTotalVendas;
        double salarioFinal = salarioFixo + comissaoFixa + comissaoPercentual;

        System.out.println("\nSalário final do vendedor: R$" + salarioFinal);
        
        input.close();
    }
}
