package ExerciciosDioSintaxe.ControleCandidatos;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;;

public class ControleCandidatos {
 
    public static void main(String[] args) {
        String candidatos [] = {"FELIPE", "MATHEUS", "MIRELLA", "JOYCE", "CAMILA"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");


        }while(continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA TENTATIVA " + tentativasRealizadas);
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + ", NÚMERO MAXIMO DE TENTAIVAS " + tentativasRealizadas);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
         String candidatos [] = {"FELIPE", "MATHEUS", "MIRELLA", "JOYCE", "CAMILA"};

         for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice+1) + " é o candidato " + candidatos[indice]);
         }

    }

    static void selecaoCandidatos() {
        String candidatos [] = {"FELIPE", "MATHEUS", "MIRELLA", "JOYCE", "CAMILA", "PEDRO", "CARLOS",
        "ANA", "LUANA", "CAMILLE"};

        int candidatosSelecionados = 0;
        int candidatoAtual= 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou um salario de R$" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }


    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
        
    }

}


