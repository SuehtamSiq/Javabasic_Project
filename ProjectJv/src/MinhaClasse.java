public class MinhaClasse {
    
public static void main (String [] args) {

        int numeroUm = 9;
        int numero2 = 10;
        int numero3 = 8;
        int mediaNotas = media (numeroUm, numero2, numero3);

        if (mediaNotas < 6)
            System.out.println("REPROVADO");
        else if (mediaNotas == 6)
            System.out.println("Prova Minerva");
        else 
            System.out.println("APROVADO");

    

}

public static int media (int numeroUm, int numero2, int numero3) {
    return (numeroUm + numero2 + numero3) / 3;

}
    
}
