package ExerciciosDioSintaxe.EstruturasRepetição;

public class ExemploForArray {

    public static void main(String[] args) {
        String alunos [] = {"Matheus", "Ana", "Pedro", "Mirella"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);

        }
    }
    
}
