package ExerciciosDioSintaxe.EstruturasCondicionais.ResultadoEscolar;

import java.util.Scanner;

public class ResultadoEscolar {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua nota? ");
        int nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.println("Você foi Aprovado!");
        }
        else if (nota >= 5 && nota <= 7) {
            System.out.println("Você foi para a recuperação!");
        }

        else {
            System.out.println("Reprovado");
        }
        
        scanner.close();

    }

}
