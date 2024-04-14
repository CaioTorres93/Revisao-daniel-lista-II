import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pede ao usuário para digitar a nota do aluno
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();
        
        // Define o critério de aprovação
        double notaMinimaAprovacao = 6.0;
        
        // Verifica se o aluno foi aprovado ou reprovado
        if (nota >= notaMinimaAprovacao) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}