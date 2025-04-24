
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroSorteado = random.nextInt(100) + 1;

        System.out.print("Tente adivinhar o número de 1 a 100: ");
        int numeroEscolhido = scanner.nextInt();
        int numeroDeTentativas = 1;

        while (numeroSorteado != numeroEscolhido) {

            if (numeroSorteado < numeroEscolhido) {
                System.out.println("Tente um numero menor.");
            } else if (numeroSorteado > numeroEscolhido) {
                System.out.println("Tente um numero maior.");
            }
            numeroDeTentativas++;
            System.out.print("Digite outro numero: ");
            numeroEscolhido = scanner.nextInt();
        }
        System.out.println("Parabéns, você acertou o numero! Com " + numeroDeTentativas + " tentativas.");

        scanner.close();
    }

}
