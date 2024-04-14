import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede ao usuário para digitar sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Verifica se o usuário é maior de idade
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você não é maior de idade.");
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}