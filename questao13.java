import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Lê os três números do usuário
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        
        // Inicializa a variável para armazenar o maior número
        double maiorNumero = num1;
        
        // Compara o segundo número com o maior número
        if (num2 > maiorNumero) {
            maiorNumero = num2;
        }
        
        // Compara o terceiro número com o maior número
        if (num3 > maiorNumero) {
            maiorNumero = num3;
        }
        
        // Exibe o maior número
        System.out.println("O maior número é: " + maiorNumero);
        
        // Fecha o Scanner
        scanner.close();
    }
}