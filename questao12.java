import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede ao usuário para digitar uma string
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // Remove espaços em branco e converte a string para minúsculas
        String sanitizedInput = input.replaceAll("\\s+", "").toLowerCase();
        
        // Verifica se a string é um palíndromo
        boolean isPalindromo = true;
        int length = sanitizedInput.length();
        
        // Percorre a string comparando caracteres
        for (int i = 0; i < length / 2; i++) {
            if (sanitizedInput.charAt(i) != sanitizedInput.charAt(length - 1 - i)) {
                isPalindromo = false;
                break;
            }
        }
        
        // Exibe o resultado
        if (isPalindromo) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}