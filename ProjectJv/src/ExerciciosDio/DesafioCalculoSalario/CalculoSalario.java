package ExerciciosDio.DesafioCalculoSalario;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu salário: ");
        double valorSalario = scanner.nextDouble();
        System.out.print("Quanto em benefícios: ");
        double valorBeneficios = scanner.nextDouble();


        double valorImposto = 0.0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05 * valorSalario;
        }
        else if (valorSalario >=1100.01 && valorSalario <=2500) {
            valorImposto = 0.10 * valorSalario;
        }
        else {
            valorImposto = 0.15 * valorSalario;
        }

        double saida = valorSalario - valorImposto + valorBeneficios;
        System.out.printf("%.2f", saida);

        scanner.close();
    }
    
}