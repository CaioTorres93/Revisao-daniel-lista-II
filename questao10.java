import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede ao usuário para digitar o valor original do produto
        System.out.print("Digite o valor original do produto: ");
        double valorOriginal = scanner.nextDouble();
        
        // Pede ao usuário para digitar a taxa de desconto (em porcentagem)
        System.out.print("Digite a taxa de desconto (em porcentagem): ");
        double taxaDesconto = scanner.nextDouble();
        
        // Calcula o valor do desconto
        double valorDesconto = valorOriginal * (taxaDesconto / 100);
        
        // Calcula o valor final do produto após o desconto
        double valorFinal = valorOriginal - valorDesconto;
        
        // Exibe o valor do desconto e o valor final do produto
        System.out.println("Valor do desconto: R$" + String.format("%.2f", valorDesconto));
        System.out.println("Valor final do produto após o desconto: R$" + String.format("%.2f", valorFinal));
        
        // Fecha o Scanner
        scanner.close();
    }
}