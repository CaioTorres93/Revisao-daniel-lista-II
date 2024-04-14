import java.util.Random;
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Cria um objeto Random para gerar a escolha do computador
        Random random = new Random();
        
        // Opções do jogo
        String[] opcoes = {"pedra", "papel", "tesoura"};
        
        // Inicializa as pontuações dos jogadores
        int pontosUsuario = 0;
        int pontosComputador = 0;
        
        // Define o número de rodadas
        int numRodadas = 3;
        
        // Joga várias rodadas
        for (int i = 0; i < numRodadas; i++) {
            // Mostra as opções ao usuário
            System.out.println("Escolha uma opção: pedra, papel ou tesoura:");
            String escolhaUsuario = scanner.nextLine().trim().toLowerCase();
            
            // Verifica se a escolha do usuário é válida
            if (!escolhaUsuario.equals("pedra") && !escolhaUsuario.equals("papel") && !escolhaUsuario.equals("tesoura")) {
                System.out.println("Escolha inválida. Por favor, escolha pedra, papel ou tesoura.");
                i--; // Subtrai uma rodada para repetir a entrada inválida
                continue;
            }
            
            // Gera uma escolha aleatória para o computador
            int escolhaComputador = random.nextInt(3);
            String escolhaComp = opcoes[escolhaComputador];
            
            // Mostra a escolha do computador
            System.out.println("O computador escolheu: " + escolhaComp);
            
            // Determina o vencedor da rodada
            if (escolhaUsuario.equals(escolhaComp)) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario.equals("pedra") && escolhaComp.equals("tesoura")) ||
                       (escolhaUsuario.equals("papel") && escolhaComp.equals("pedra")) ||
                       (escolhaUsuario.equals("tesoura") && escolhaComp.equals("papel"))) {
                System.out.println("Você venceu esta rodada!");
                pontosUsuario++;
            } else {
                System.out.println("O computador venceu esta rodada!");
                pontosComputador++;
            }
            
            // Mostra as pontuações atuais
            System.out.println("Placar: Você " + pontosUsuario + " - " + pontosComputador + " Computador");
            System.out.println();
        }
        
        // Mostra o resultado final
        System.out.println("Resultado final:");
        if (pontosUsuario > pontosComputador) {
            System.out.println("Você venceu o jogo!");
        } else if (pontosUsuario < pontosComputador) {
            System.out.println("O computador venceu o jogo!");
        } else {
            System.out.println("O jogo terminou em empate!");
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}