import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede ao usuário para digitar um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}