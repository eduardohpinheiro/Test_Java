// questao 1 -  Introdução à linguagem Java.



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


// Questao 2 - Introdução à linguagem Java.

import java.util.Scanner;

public class CalculoCaloriasRefeicao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Calorias dos alimentos
        int[] caloriasPratos = {180, 230, 250, 350};
        int[] caloriasSobremesas = {75, 110, 170, 200};
        int[] caloriasBebidas = {20, 70, 100, 65};

        // Opções de prato, sobremesa e bebida
        String[] pratos = {"Vegetariano", "Peixe", "Frango", "Carne"};
        String[] sobremesas = {"Abacaxi", "Sorvete diet", "Mouse diet", "Mouse chocolate"};
        String[] bebidas = {"Chá", "Suco de laranja", "Suco de melão", "Refrigerante diet"};

        // Solicitar ao usuário a escolha do prato, sobremesa e bebida
        System.out.println("Escolha o prato: ");
        for (int i = 0; i < pratos.length; i++) {
            System.out.println((i+1) + " - " + pratos[i]);
        }
        int escolhaPrato = input.nextInt();
        System.out.println("Escolha a sobremesa: ");
        for (int i = 0; i < sobremesas.length; i++) {
            System.out.println((i+1) + " - " + sobremesas[i]);
        }
        int escolhaSobremesa = input.nextInt();
        System.out.println("Escolha a bebida: ");
        for (int i = 0; i < bebidas.length; i++) {
            System.out.println((i+1) + " - " + bebidas[i]);
        }
        int escolhaBebida = input.nextInt();

        // Calcular a quantidade total de calorias da refeição
        int totalCalorias = caloriasPratos[escolhaPrato-1] +
                            caloriasSobremesas[escolhaSobremesa-1] +
                            caloriasBebidas[escolhaBebida-1];

        // Exibir o total de calorias da refeição
        System.out.println("Total de calorias da refeição: " + totalCalorias + " cal");
    }
}


// Questao 3 - Introdução à linguagem Java.
// não entendi como fazer.
