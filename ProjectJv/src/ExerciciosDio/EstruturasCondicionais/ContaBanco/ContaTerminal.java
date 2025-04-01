package ExerciciosDio.EstruturasCondicionais.ContaBanco;

import java.util.Scanner;

/**
Esta classe representa um exemplo de simulação de conta bancária.
* Ela demonstra o uso do scanner para obter dados do usuários para trata-los.
* @author Matheus Soares Siqueira
* @since 30/03/2025
*/
public class ContaTerminal {
    

    /**
    * Método principal que executa o programa.
    * Ele coleta os dados do usuário e exibe uma mensagem de boas-vindas.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner
        
        System.out.print("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt(); 
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agenciaConta = scanner.next();

        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.print("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldoConta = scanner.nextDouble();
        // Mensagem formatada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo é de R$" + saldoConta + " já disponível para saque.");

        scanner.close(); // Fechar o Scanner.
    }
}