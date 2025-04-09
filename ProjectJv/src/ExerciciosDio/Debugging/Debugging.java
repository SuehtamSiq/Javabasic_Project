package ExerciciosDio.Debugging;


import java.util.Scanner;
public class Debugging {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alunos[] = {"Matheus", "Mirella", "Cssia", "Julia"};

        int media = calculoMediaAlunos(alunos, scan);

        System.out.print("Média da Turma: " + media);

        scan.close();

    }


    public static int calculoMediaAlunos(String[] alunos, Scanner scanner) {

            int soma = 0; 
            for (String aluno : alunos) {
                System.out.printf("Nota do aluno %s ",  aluno);
                int nota = scanner.nextInt();
                soma += nota;
            }

            return  soma / alunos.length;

        
    }
    
}
