package ExerciciosDio.EstruturasExcepcionais;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryCatch {

    public static void main(String[] args) {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu Sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua Altura: ");
        double altura = scanner.nextDouble();

        System.out.println(nome);
        System.out.println(sobreNome);
        System.out.println(idade);
        System.out.println(altura);

        scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser númericos.");
        }
        
    }
    
}
