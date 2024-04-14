import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede ao usuário para digitar o salário do funcionário
        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();
        
        // Variável para armazenar o imposto de renda calculado
        double impostoRenda = 0.0;
        
        // Calcula o imposto de renda com base nas faixas salariais
        if (salario <= 2500.00) {
            // Salário até R$ 2.500,00 é isento de imposto
            impostoRenda = 0.0;
        } else if (salario <= 5000.00) {
            // Salário de R$ 2.500,01 até R$ 5.000,00: 10% sobre o valor que ultrapassar R$ 2.500,00
            impostoRenda = (salario - 2500.00) * 0.10;
        } else {
            // Salário acima de R$ 5.000,00: 20% sobre o valor que ultrapassar R$ 5.000,00
            // Primeiro calcula o imposto da faixa intermediária
            impostoRenda = (5000.00 - 2500.00) * 0.10;
            // Em seguida, calcula o imposto da faixa superior
            impostoRenda += (salario - 5000.00) * 0.20;
        }
        
        // Exibe o imposto de renda calculado
        System.out.printf("O imposto de renda a ser pago é: R$ %.2f%n", impostoRenda);
        
        // Fecha o Scanner
        scanner.close();
    }
}